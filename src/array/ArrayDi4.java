package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        // 2 x 3의 2차월 배열 생성
        int [][] arr = new int[5][5]; // 2행, 3열

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }

    }
}
