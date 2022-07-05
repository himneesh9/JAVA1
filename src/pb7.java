public class pb7 {
  /*
    static void multiply(int n){
        for(int i = 1 ; i<=10 ;i++ ){
            System.out.println( n + "*" + i + "=" +(n*i));
        }
    }
    public static void main(String[] args) {
        int n = 5;
        multiply(n);

   */
    // Problem 2
  /* static void pattern(int n) {
      for (int i = 0; i <= n; i++) {
          for (int j = 0; j <= i; j++) {
              System.out.print("*");
          }
          System.out.print("\n");
      }
  }

    public static void main(String[] args) {
        int a = 3;
        pattern(a);

    }
   */
    //Probllem 3
     /*static int sum(int n){
        if(n==0){
            return 0;
        }
        else{
        return n + sum(n-1);
    }
    }

    public static void main(String[] args) {
        int a = 5 ;
        System.out.println(sum(a));
    }

      */
    // Problem 4
 /* static void pattern (int n){
      for(int i = 0 ; i<= n ; i++){
          for(int j = n ; j>=i ; j--){
              System.out.print("*");
          }
          System.out.println();
      }
  }
    public static void main(String[] args) {
      int n = 3;
        pattern(n);

  }

  */
    //Problem 6
  /* static int avg(int ...arr){
       int sum = 0 ;
       for(int i = 0; i< arr.length ; i++){
           sum += arr[i];
       }
       return (sum)/ arr.length;
   }
    public static void main(String[] args) {
        System.out.println("average=" + avg(9,5,4));

  }

   */
    static float convert(float n){
        float a;
        a = ( n * (9.0f / 5.0f) ) + 32 ;
        return a ;
    }
    public static void main(String[] args) {
        float c =32.0f;
        float f;
        f = convert(c);
        System.out.println("f = " + f);


  }
}
