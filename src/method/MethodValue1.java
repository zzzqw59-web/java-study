package method;

public class MethodValue1 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + num1);
        changeNumber(num1);
        System.out.println("4. changeNumber 호출 후, num1: " + num1);
        // 자바는 항상 값을 복사해서 전달한다.
    }
    public static void changeNumber (int num2) { // num1의 값을 num2에 복사해서 전달, 원본을 건들지 않음
        System.out.println("2. changeNumber 변경 전, num2: " + num2);
        num2 = num2 * 2;
        System.out.println("3. changeNumber 변경 후, num2: " + num2);
        // num2의 변경은 num1에 영향을 미치지 않는다. 값을 복사해서 전달했기 때문이다.
    }
}
