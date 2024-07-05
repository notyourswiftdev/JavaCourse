Breakdown of how Java is compiled. Each computer has it's own hardware, and OS (operating system). For the OS as long as it has JDK (Java Development Kit) installed it will compile Java code, or using JRE it will run the Java program on your hardware. With JDK installed it includes JRE (Java Runtime Enviroment) and JVM (Java Virtual Machine) or JRE has JVM is built in. When we write Java code in .java files and compile it using javac command line. It will create a Byte code file with an extension of .class

No matter the program you are building it can be 2 files or 100's of files we only have one file that the command line needs to build and that file needs to the `public static void main(String[] args)` method. JVM is looking for that main class to run the program.

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