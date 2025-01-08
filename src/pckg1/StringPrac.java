package pckg1;

public class StringPrac {

    public String meth1( String a, String b){

        return b.substring(0,3).concat(a)+b.substring(3,6);
    }
    public String meth2(String l, String q){

        for(int i = 0; i<=l.length()-1; i++){

            if(i%2==0){

            } else{
                System.out.print(q.charAt(i));
            }
//            System.out.print(q.charAt(i));
//            System.out.print(l.charAt(i));
        }
        return " ";

    }

    public static void main(String[] args) {

      String s1= new StringPrac().meth1("Sagar","<<<>>>");

        String s2= new StringPrac().meth2("*****","Sagar");

        System.out.println(s2);
   System.out.println(s1);
}
}
