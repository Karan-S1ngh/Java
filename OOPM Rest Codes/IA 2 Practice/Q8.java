/*
Q8  Write a program to create package and show the execution of the same.
*/


// HelloWorld class in com.example package
package com.example;

public class HelloWorld {
    public void display() {
        System.out.println("Hello, World! This is your package.");
    }
}


// Main class outside the package
public class Main {
    public static void main(String[] args) {
        // Creating an instance of HelloWorld class from the package com.example
        HelloWorld hello = new HelloWorld();

        // Calling the display method of HelloWorld class to show the message
        hello.display();
    }
}



/*
1. Create a Directory Structure
  First, create a directory structure for your package. For example: 
  MyProject
  └── src
      └── com
          └── example
        
2. Create a Java Class in the Package
  Inside the com.example directory, create a Java class. For example, HelloWorld.java
  Then put the HelloWorld code from above.
  This class is in the com.example package.

3. Compile the Java Class
  Open a terminal or command prompt, navigate to the src directory, and compile your Java class.
  javac com/example/HelloWorld.java
  After compilation, you should see HelloWorld.class in the com/example directory.

4. Create a Main Class Outside the Package
  Now, create another Java class outside the com.example package (in the same directory as src), for example, Main.java
  Then put the Main class code from above.
  This class imports the HelloWorld class from the com.example package and uses it in the main method.

5. Compile and Run the Main Class
  javac Main.java   (Compiling Main.java)
  java Main         (Running Main class)
  OUTPUT should be seen as 
  Hello, World! This is your package.


  This demonstrates creating a package (com.example), placing a class (HelloWorld.java) inside the package, 
  importing and using the class in another class (Main.java).
*/
