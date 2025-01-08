package pckg1;

public class Class2 {



    int i=10;
    int [] meth1(int arr[]){

        System.out.println("meth1" );

       return arr;
    }

    public static void main(String[] args) {

       Integer k= Integer.valueOf(new Class2().i); // boxing means using wrapper class object
        Integer s= Integer.valueOf(10);
        System.out.println(s);
        System.out.println(k);
        //reverse array
        int[][] arr = null;
//        new Class2().meth1(new int[] {1,2,3});
        int input[]={10,20,30};
        int result[]=new Class2().meth1(input);
        for (int i=result.length-1;i>=0;i--){
            System.out.println(result[i]);
        }

        // array declaration multi dimentional
        arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }


}
