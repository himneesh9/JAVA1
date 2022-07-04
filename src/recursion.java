public class recursion {
    static int fibonacci(int n){
        int  sum = 0 ;
        if(n==1){
            return 0;
        }
        else if (n==2) {
            return 1;
        }
        else{
            return  fibonacci(n-2) + fibonacci(n-1);
        }
    }


    public static void main(String[] args) {
        int n = 8;
        System.out.println("fibonacci = " + fibonacci(n) );


    }
}
