
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println(" VARIANCE AND STANDARD DEVIATION");
        System.out.println("========================================");

        System.out.println("Enter numbers separated by spaces:");
        String input = scanner.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println("Error: enter at least one number.");
            scanner.close();
            return;
        }

        try {
            String[] parts = input.split("\\s+");
            double[] values = new double[parts.length];

            for (int i = 0; i < parts.length; i++) {
                values[i] = Double.parseDouble(
                    parts[i].replace(',', '.')
                );

                if (!Double.isFinite(values[i])) {
                    throw new NumberFormatException();
                }
            }

            if (values.length < 2) {
                System.out.println(
                    "At least two values are required "
                    + "to calculate sample variance."
                );
            }

            calculateStatistics(values);

        } catch (NumberFormatException e) {
            System.out.println(
                "Error: enter valid numbers separated by spaces."
            );
        }

        scanner.close();
    }

    public static void calculateStatistics(double[] values) {
        int n = values.length;

        double sum = 0;
        double min = values[0];
        double max = values[0];

        for (double value : values) {
            sum += value;
            min = Math.min(min, value);
            max = Math.max(max, value);
        }

        double mean = sum / n;
        double squaredDeviations = 0;

        for (double value : values) {
            double deviation = value - mean;
            squaredDeviations += deviation * deviation;
        }

        double populationVariance = squaredDeviations / n;
        double populationStdDev = Math.sqrt(populationVariance);

        System.out.println("\n========== RESULTS ==========");
        System.out.println("Values: " + Arrays.toString(values));
        System.out.println("Count: " + n);
        System.out.printf("Mean: %.2f%n", mean);
        System.out.printf("Minimum: %.2f%n", min);
        System.out.printf("Maximum: %.2f%n", max);
        System.out.printf(
            "Population variance: %.2f%n",
            populationVariance
        );
        System.out.printf(
            "Population standard deviation: %.2f%n",
            populationStdDev
        );

        if (n >= 2) {
            double sampleVariance = squaredDeviations / (n - 1);
            double sampleStdDev = Math.sqrt(sampleVariance);

            System.out.printf(
                "Sample variance: %.2f%n",
                sampleVariance
            );
            System.out.printf(
                "Sample standard deviation: %.2f%n",
                sampleStdDev
            );
        }

        System.out.println("=============================");
    }
}
