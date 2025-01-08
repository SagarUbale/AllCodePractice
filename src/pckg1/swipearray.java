package pckg1;

public class swipearray {

    int arr[] ={3,10};

    public void meth1(int [] s) {

//                int temp = s[0];
//                s[0] = s[1];
//                s[1] = temp;
                 s[0]=s[0]-s[1];// [1]= 10
                 s[1]=  s[0]+s[1];//  [0]=20
                s[0]= s[1] - s[0];


                for (int value1 : s) {
                    System.out.print(value1+" ");
                }
            }

    public static void main(String[] args) {
        swipearray arr1= new swipearray();
        arr1.meth1(arr1.arr);

    }


}
