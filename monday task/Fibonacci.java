class Fibonacci {    
    public static void main(String[] args) {
        int firstFib = 0, secondFib = 1;

        System.out.println("First Fibonacci: " + firstFib);
        System.out.println("Second Fibonacci: " + secondFib);

        for (int i = 3; i <= 5; i++) {
            int latestFib = firstFib + secondFib;
            System.out.println("Fibonacci " + i + ": " + latestFib);
            firstFib = secondFib;
            secondFib = latestFib;
        }
    }    
}

