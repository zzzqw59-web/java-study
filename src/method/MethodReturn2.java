package method;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살은 출입이 불가능합니다.");
            return;
        }
        System.out.println(age + "살은 입장이 가능합니다.");
    }
}
