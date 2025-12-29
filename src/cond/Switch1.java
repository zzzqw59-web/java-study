package cond;

public class Switch1 {
    public static void main(String[] args) {
        int grade = 2;
        int counpon;

        if (grade == 1) {
            counpon = 1000;
        } else if (grade == 2) {
            counpon = 2000;
        } else if (grade == 3) {
            counpon = 3000;
        } else {
            counpon = 500;
        }
        System.out.println("발급받은 쿠폰:" + counpon);
    }
}
