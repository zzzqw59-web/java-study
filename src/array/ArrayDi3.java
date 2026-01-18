package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        // 2 x 3의 2차월 배열 생성
        int [][] arr = {
                {1, 2, 3},
                {4, 5, 6},
        }; // 2행, 3열

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }

    }
}
