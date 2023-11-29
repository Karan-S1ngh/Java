//WAP for using String Buffer for String 'Java' with size '15'. Display length, capacity, Buffer capacity, append string "Program", insert string "Hello".

class StringBufferExample {
    public static void main(String[] args) {
        // Create a StringBuffer with an initial size of 15
        StringBuffer stringBuffer = new StringBuffer(15);

        // Append the string "Java"
        stringBuffer.append("Java");

        // Display the length, capacity, and content of the buffer
        System.out.println("Length: " + stringBuffer.length());
        System.out.println("Capacity: " + stringBuffer.capacity());
        System.out.println("Buffer: " + stringBuffer.toString());

        // Append the string "Program"
        stringBuffer.append("Program");

        // Display the updated length, capacity, and content of the buffer
        System.out.println("\nAfter appending 'Program':");
        System.out.println("Length: " + stringBuffer.length());
        System.out.println("Capacity: " + stringBuffer.capacity());
        System.out.println("Buffer: " + stringBuffer.toString());

        // Insert the string "Hello" at index 4
        stringBuffer.insert(4, "Hello");

        // Display the final length, capacity, and content of the buffer
        System.out.println("\nAfter inserting 'Hello' at index 4:");
        System.out.println("Length: " + stringBuffer.length());
        System.out.println("Capacity: " + stringBuffer.capacity());
        System.out.println("Buffer: " + stringBuffer.toString());
    }
}


/* OUTPUT
Length: 4
Capacity: 15
Buffer: Java

After appending 'Program':
Length: 11
Capacity: 15
Buffer: JavaProgram

After inserting 'Hello' at index 4:
Length: 16
Capacity: 32
Buffer: JavaHelloProgram
*/
