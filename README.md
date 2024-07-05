Breakdown of how Java is compiled. Each computer has it's own hardware, and OS (operating system). For the OS as long as it has JDK (Java Development Kit) installed it will compile Java code, or using JRE it will run the Java program on your hardware. With JDK installed it includes JRE (Java Runtime Enviroment) and JVM (Java Virtual Machine) or JRE has JVM is built in. When we write Java code in .java files and compile it using javac command line. It will create a Byte code file with an extension of .class

No matter the program you are building it can be 2 files or 100's of files we only have one file that the command line needs to build and that file needs to the `public static void main(String[] args)` method. JVM is looking for that main class to run the program.

Data Types
    - Primitives:
        - Integer: -2, -1, 0, 1, 2
            - int: 4bytes (-2^31 to 2^31-1)
            - long: 8bytes (-2^63 to 2^63-1)
            - short: 2bytes (-2^15 to 2^15-1)
            - byte: 1byte (-2^7 to 2^7-1)
        - Float: 1.5, 3.2
            - float: 4bytes
                - example: float num = 5.6f;
            - double: 8bytes
                - example: double num = 5.6;
        - Boolean: true, false
            - example: boolean b = true; (or false)
        - Character: a, b, c
            - char: 2bytes
                - follows UNICODE
                - example: char c = 'k'; (will only accept single quote)
    - Literals:
        - int num1 = 0b101; would print 5
        - Hexadecimals:
            - int num1 = 0x7E; would pring 126
        - When working with large sets of numbers like 1000000 we can specify this by doing 1_000_000 underscores to make it easier on us to see.

Type Conversion and Casting
    - Type Casting:
        - A data type is converted into another data type by using the casting operator.
            - example:
            ```
            float x;
            byte y;
            y = (byte)x; 
            ```
    - Type Conversion:
        - A data type is automatically converted into another data type by a compiler at the compiler time.
            - example:
            ```
            int x = 30;
            float y;
            y = x; // 30.0000;
            ```
Type Promotion
    - Converting of data from lower to higher data types.


Arithmetic Operators
    - Adding, subtract, multiply and divide
        - num + num
        - num * num
        - num % num
        - num - num
        - num++
        - num--
        - num *= num
        - num -= num
        - num += num
        - num /= num
    

Relational Operators
    - < less than
    - > greater than
    - == compare two equal values
    - != compare not equal values
    - <= less than or equal too
    - >= greater than or equal too


Logical Operators
    - 