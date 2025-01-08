package pckg1;

public class class1 {


    public static void main(String[] args) {

      //  operation without using Arethmatic
        int a = 10;
        int b = 20;

         a = a ^ b;
         b= b ^ a;
         a= a ^ b;


        System.out.println("a :"+a+" "+" b:"+b+" ");


    }

}