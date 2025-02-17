# Delphi/Pascal Interpreter
This project implements a subset of Delphi features as an extension of Pascal using ANTLR4 and Java. It's designed to demonstrate object-oriented programming concepts in Pascal.

## Features
- Classes and Objects
- Constructors and Destructors
- Encapsulation
- Basic input/output functionality

## Prerequisites
- Java JDK 8 or higher
- ANTLR 4.9 or higher
- Visual Studio Code (recommended)
  - Java Extension Pack
  - ANTLR4 grammar syntax support


## Test Files
- `test1.pas`: Demonstrates basic class and object instantiation
- `test2.pas`: Shows encapsulation and input/output functionality


# To Run
java -jar lib/antlr-4.9.3-complete.jar -o src/generated -visitor -listener src/delphi.g4
javac -cp "lib/antlr-4.9.3-complete.jar:src:src/generated" src/DelphiInterpreter.java -d src
java -cp "lib/antlr-4.9.3-complete.jar:src:src/generated" DelphiInterpreter test/test1.pas
