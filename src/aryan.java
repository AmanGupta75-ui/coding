import java.util.Scanner;

public class aryan {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr+ " ");
        }

    }
}
