package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        temp = a; // 10
        a = b; // 10
        b = temp; // 20

        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 10
    }
}
