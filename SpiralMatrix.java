import java.util.*;
public class  SpiralMatrix{
    public static int[] spiralMatrix(int [][]MATRIX) {
        List<Integer> spiral = new ArrayList<>();

        int m = MATRIX.length;
        int n = MATRIX[0].length;
        int top = 0, left = 0, bottom = m - 1, right = n - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                spiral.add(MATRIX[top][i]);
            top++;

            for (int i = top; i <= bottom; i++)
                spiral.add(MATRIX[i][right]);
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    spiral.add(MATRIX[bottom][i]);
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    spiral.add(MATRIX[i][left]);
                left++;
            }
        }

        int a = spiral.size();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = spiral.get(i);
        }
        return arr;
    }
}