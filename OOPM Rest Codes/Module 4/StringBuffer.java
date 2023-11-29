//WAP for using string buffer for String 'Java' with size '15'. Display length capacity buffer capacity Lappend string. "Program", insert string "Hello" 
class StringBufferExample {
    public static void main(String[] args) {
        // Create a StringBuffer with an initial size of 15
        StringBuffer stringBuffer = new StringBuffer(15);

        // Append the string "Program"
        stringBuffer.append("Program");

        // Display the length, capacity, and content of the buffer
        System.out.println("Length: " + stringBuffer.length());
        System.out.println("Capacity: " + stringBuffer.capacity());
        System.out.println("Buffer: " + stringBuffer.toString());

        // Insert the string "Hello" at index 4
        stringBuffer.insert(4, "Hello");

        // Display the updated length, capacity, and content of the buffer
        System.out.println("\nAfter inserting 'Hello' at index 4:");
        System.out.println("Length: " + stringBuffer.length());
        System.out.println("Capacity: " + stringBuffer.capacity());
        System.out.println("Buffer: " + stringBuffer.toString());
    }
}

/* OUTPUT
Length: 7
Capacity: 15
Buffer: Program

After inserting 'Hello' at index 4:
Length: 12
Capacity: 23
Buffer: ProgHelloram
*/