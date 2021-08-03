public class calculator {
    public static void calculate (int a,int b, char operator){

        switch(operator)
        {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case'/':
                System.out.println(a/b);
                break;
            case'%':
                System.out.println(a%b);
                break;

        }

    }

    public static boolean even (int a){
        if(a%2==0){
            return true;

        }
        else {
            return false;

    }

    }
public static void fibonacci(int a){
        int m=1;
        int n=1;
        int o=0;

     for(int i=3; i<=a; i++) {
         if(a<=o){
             break;
         }

         o=n+m;
         System.out.println(o);
         m=n;
         n=o;

     }

}


}
