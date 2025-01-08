package pckg1;

import java.util.Scanner;

public class arrayRotate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5};
        int k=sc.nextInt();

        for (int s = 0; s <= k; s++) {
            int last = arr[arr.length - 1];

            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];

            }
            arr[0] = last;
        }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    }