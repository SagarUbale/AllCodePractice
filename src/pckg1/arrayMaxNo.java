package pckg1;

public class arrayMaxNo {

    public static int meth1(int [] n){
        int max= n[0];

        for (int m : n){
            if(m>max){
                max=m;
            }
        }
        System.out.println(max);
        return max;
    }
    public static void main(String[] args) {

int [] arr={1,2,3,4,3,6,2};
meth1(arr);
//        arrayMaxNo nn= new arrayMaxNo();
//        nn.meth1( new int[]{1, 2, 3, 4, 8, 3, 5});


    }}

