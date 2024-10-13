# String Handler

This is a Java application that processes a given text string by removing all words of a specified length that begin with a consonant. It uses the `StringBuffer` class for string manipulations.

## Project Structure

- `Main.java`: Entry point of the program.
- `StringHandler.java`: Class that contains the method for processing the text by removing words with the specified conditions.

## How to Run

### Prerequisites
1. Install the [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) version 8 or above.
2. Install [Maven](https://maven.apache.org/) or use a Java-compatible IDE like [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/ide/).

### Clone the repository
```bash
git clone https://github.com/kovaliovev/java-basic-2.git
```

### Navigate to the root directory of the project
```bash
cd java-basic-2
```

### Compile the project
```bash
javac -d out -sourcepath src src/main/java/org/example/*.java
```

### Run the project
```bash
java -cp out org.example.Main
```
