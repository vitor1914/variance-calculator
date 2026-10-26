
# Variance and Standard Deviation Calculator | Calculadora de Variância e Desvio Padrão

🇧🇷 Português | 🇺🇸 English

## 🇧🇷 Português

### Sobre o projeto

Aplicação de linha de comando desenvolvida em Java para calcular medidas de estatística descritiva a partir de um conjunto de números informado pelo usuário.

O projeto demonstra a aplicação prática de conceitos estatísticos e fundamentos de programação Java.

### Funcionalidades

- Cálculo da média aritmética.
- Cálculo da variância populacional.
- Cálculo do desvio padrão populacional.
- Cálculo da variância amostral.
- Cálculo do desvio padrão amostral.
- Identificação do menor e do maior valor.
- Contagem de elementos.
- Validação básica das entradas numéricas.

### Tecnologias utilizadas

- Java
- Programação orientada a objetos e métodos estáticos
- Estatística descritiva
- Scanner
- Arrays
- Math
- Git e GitHub

### Conceitos estatísticos

**Variância populacional**

σ² = Σ(xᵢ − μ)² / N

**Desvio padrão populacional**

σ = √σ²

**Variância amostral**

s² = Σ(xᵢ − x̄)² / (n − 1)

**Desvio padrão amostral**

s = √s²

Onde:

- xᵢ: cada valor observado.
- μ: média populacional.
- x̄: média amostral.
- N: quantidade de elementos da população.
- n: quantidade de elementos da amostra.

### Pré-requisitos

- Java Development Kit (JDK) 17 ou superior.
- Terminal ou prompt de comando.

Verifique a instalação:

```bash
java -version
javac -version
```

### Estrutura do projeto

```text
variance-calculator/
├── src/
│   └── Main.java
└── README.md
```

### Como executar

#### Windows

1. Abra o Prompt de Comando ou PowerShell.
2. Acesse a pasta do projeto.
3. Compile e execute:

```powershell
javac -d out src\Main.java
java -cp out Main
```

#### macOS

1. Abra o Terminal.
2. Acesse a pasta do projeto.
3. Compile e execute:

```bash
mkdir -p out
javac -d out src/Main.java
java -cp out Main
```

#### Linux

1. Abra o terminal.
2. Acesse a pasta do projeto.
3. Compile e execute:

```bash
mkdir -p out
javac -d out src/Main.java
java -cp out Main
```

### Exemplo de utilização

Entrada:

```text
2 4 6
```

Saída esperada:

```text
Mean: 4.00
Minimum: 2.00
Maximum: 6.00
Population variance: 2.67
Population standard deviation: 1.63
Sample variance: 4.00
Sample standard deviation: 2.00
```

### Aprendizados

- Aplicação de fórmulas estatísticas em Java.
- Manipulação de arrays.
- Uso de loops e condicionais.
- Tratamento básico de entradas inválidas.
- Organização e execução de programas Java pelo terminal.

---

## 🇺🇸 English

### About the project

A Java command-line application that calculates descriptive statistics from a set of numbers provided by the user.

The project demonstrates the practical application of statistical concepts and Java programming fundamentals.

### Features

- Arithmetic mean calculation.
- Population variance calculation.
- Population standard deviation calculation.
- Sample variance calculation.
- Sample standard deviation calculation.
- Minimum and maximum value identification.
- Element counting.
- Basic numeric input validation.

### Technologies

- Java
- Object-oriented programming and static methods
- Descriptive statistics
- Scanner
- Arrays
- Math
- Git and GitHub

### Statistical concepts

**Population variance**

σ² = Σ(xᵢ − μ)² / N

**Population standard deviation**

σ = √σ²

**Sample variance**

s² = Σ(xᵢ − x̄)² / (n − 1)

**Sample standard deviation**

s = √s²

Where:

- xᵢ: each observed value.
- μ: population mean.
- x̄: sample mean.
- N: population size.
- n: sample size.

### Requirements

- Java Development Kit (JDK) 17 or later.
- Terminal or command prompt.

Check your installation:

```bash
java -version
javac -version
```

### Project structure

```text
variance-calculator/
├── src/
│   └── Main.java
└── README.md
```

### How to run

#### Windows

1. Open Command Prompt or PowerShell.
2. Navigate to the project directory.
3. Compile and run:

```powershell
javac -d out src\Main.java
java -cp out Main
```

#### macOS

1. Open Terminal.
2. Navigate to the project directory.
3. Compile and run:

```bash
mkdir -p out
javac -d out src/Main.java
java -cp out Main
```

#### Linux

1. Open the terminal.
2. Navigate to the project directory.
3. Compile and run:

```bash
mkdir -p out
javac -d out src/Main.java
java -cp out Main
```

### Usage example

Input:

```text
2 4 6
```

Expected output:

```text
Mean: 4.00
Minimum: 2.00
Maximum: 6.00
Population variance: 2.67
Population standard deviation: 1.63
Sample variance: 4.00
Sample standard deviation: 2.00
```

### What I learned

- Implementing statistical formulas in Java.
- Working with arrays.
- Using loops and conditional statements.
- Basic invalid input handling.
- Compiling and running Java applications from the terminal.

---

## Author

**Israel Vitor**

GitHub: [@vitor1914](https://github.com/vitor1914)

## License

This project is available for educational and personal portfolio purposes.
