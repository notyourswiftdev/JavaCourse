Breakdown of how Java is compiled. Each computer has it's own hardware, and OS (operating system). For the OS as long as it has JDK (Java Development Kit) installed it will compile Java code, or using JRE it will run the Java program on your hardware. With JDK installed it includes JRE (Java Runtime Enviroment) and JVM (Java Virtual Machine) or JRE has JVM is built in. When we write Java code in .java files and compile it using javac command line. It will create a Byte code file with an extension of .class

No matter the program you are building it can be 2 files or 100's of files we only have one file that the command line needs to build and that file needs to the `public static void main(String[] args)` method. JVM is looking for that main class to run the program.


Data Types
    - Primitives
        - Integer: -2, -1, 0, 1, 2
            - byte, short, long, int
        - Float: 1.5, 3.2
            - double, float
        - Boolean: true, false
        - Character: a, b, c