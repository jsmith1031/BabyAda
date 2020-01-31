# BabyAda
 Simple Ada Compiler made with Java

# Scanner and Lexer

* **Jeffrey Smith** - Github: [jsmith1031](https://github.com/jsmith1031)
* [**ITEC 460 (Translator Design and Construction) Spring 2020**](https://www.radford.edu/nokie/classes/460/)

Email: [jsmith1031@radford.edu](mailto::jsmith1031@radford.edu)

#

## Sources
* [Cup - LALR Parser Generator for Java](http://www2.cs.tum.edu/projects/cup/)
* [JavaCC - Java Compiler Compiler](https://javacc.github.io/javacc/)

## Getting Started
**(My personal notes for getting setup)**

Install ANT if running outside Ecllipse

I personally used brew to install jflex-1.7.0 and javacc7.0.5 which may be required dependencies for this project now or later as this project evolves this semster

To compile the '.cup' file:
>java -jar java-cup-11b.jar -interface -parser Parser {cup file name}.cup

>java -jar java-cup-11b.jar -interface -parser Parser BabyAda.cup

This will create "Parser.java", and "sym.java".

Now create a driver file that will call the flex file and parser file, the scanner file will read the input data and create a symbol table for hte input. That feels into the parser which creates the parse tree based on the grammar.