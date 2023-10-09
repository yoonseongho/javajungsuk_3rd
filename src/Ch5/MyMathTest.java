package Ch5;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath nm = new MyMath();
        long result1 = nm.add(5L, 3L);
        long result2 = nm.subtract(5L, 3L);
        long result3 = nm.multiply(5L, 3L);
        double result4 = nm.divide(5L, 3L);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}

class MyMath {
    long add(long a, long b) {
        long result = a+b;
        return result;
    }

    long subtract(long a, long b) { return a - b; }
    long multiply(long a, long b) { return a * b; }
    double divide(double a, double b) {
        return a / b;
    }
}