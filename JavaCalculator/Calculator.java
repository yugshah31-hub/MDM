class Calculator {
    // Attributes
    int num1, num2;

    // Default Constructor (Constructor Overloading)
    Calculator() {
        System.out.println("Welcome to Calculator!");
    }

    // Parameterized Constructor (Constructor Overloading)
    Calculator(int a, int b) {
        num1 = a;
        num2 = b;
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    // Method Overloading: add() with no parameters
    void add() {
        int a = 5, b = 10;
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }

    // Method Overloading: add() with two integer parameters
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }

    // Method Overloading: add() with three float parameters
    void add(float a, float b, float c) {
        float sum = a + b + c;
        System.out.println("Sum of " + a + ", " + b + ", and " + c + " is: " + sum);
    }
}
