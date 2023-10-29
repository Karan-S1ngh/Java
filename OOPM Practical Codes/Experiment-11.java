// Define a class implementing Runnable to print numbers
class PrintNumbers implements Runnable {
    public void run() {
        System.out.print("Printing Numbers: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

// Define another class implementing Runnable to print squares
class PrintSquares implements Runnable {
    public void run() {
        System.out.print("Printing Squares: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * i + " ");
        }
    }
}

// Define a class for multi-threading
class MultiThread {
    public static void main(String[] args) {
        //Create threads
        Thread t1 = new Thread(new PrintNumbers());
        Thread t2 = new Thread(new PrintSquares());

        // Start thread t1
        t1.start();

        try {
            // Wait for t1 to finish before starting t2
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start thread t2 after t1 has finished
        t2.start();

        // Stop
    }
}




/*OUTPUT
Printing Numbers: 1 2 3 4 5 6 7 8 9 10 
Printing Squares: 1 4 9 16 25 36 49 64 81 100 
*/
