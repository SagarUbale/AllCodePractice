package pckg1;

public class returnFromMethod {

    public static int[][] meth1() {

        return new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    }

    public static void main(String[] args) {

        int arr[][] = meth1();

        for (int[] a : arr) {
            for (int m : a) {
                System.out.print(m+ " ");
            }
            System.out.println();
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i] +" ");
//
//        }
        }
    }
}