package method;

public class MethodValue3 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("changeNumber 호출 전, num1: " + num1); // 5
        num1 = changeNumber(num1);
        System.out.println("changeNumber 호출 후, num1: " + num1); // 10
        // 자바는 항상 값을 복사해서 전달한다.
    }
    public static int changeNumber (int num2) {
        num2 = num2 * 2;
        return num2;

    }
}
