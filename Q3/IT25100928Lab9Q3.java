public class IT25100928Lab9Q3 {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        // Expression 1: (3*4 + 5*7)^2
        int term1 = multiply(3, 4);
        int term2 = multiply(5, 7);
        int addResult1 = add(term1, term2);
        int finalResult1 = square(addResult1);

        // Expression 2: (4+7)^2 + (8+3)^2
        int addResult2 = add(4, 7);
        int squareResult1 = square(addResult2);
        int addResult3 = add(8, 3);
        int squareResult2 = square(addResult3);
        int finalResult2 = add(squareResult1, squareResult2);

        System.out.println("Result of (3*4+5*7)^2 : " + finalResult1);
        System.out.println("Result of (4+7)^2+(8+3)^2 : " + finalResult2);
    }
}