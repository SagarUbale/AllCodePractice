package pckg1;

public class arraysum {


    public int meth1(int[] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i];
        }
        System.out.println(sum);
        return 8;
    }


        public static void main (String[]args){
//        int arr []={1,3,4,5,6,7,8,9};

            int arr[]  = {1, 2, 3, 3, 4, 5, 5, 6, 7};
            arraysum sum1 = new arraysum();
            sum1.meth1(new int[]{1, 2, 4, 7});


        }
    }