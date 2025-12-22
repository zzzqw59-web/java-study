package operator;

public class Logical2 {
    public static void main(String[] args) {
        int a = 15;
        // a는 10보다 크고, 20보다는 작다.
        boolean result = a > 20 && a < 20; // (a > 20 ) && (a < 20)
        System.out.println("result = " + result);
    }
}
