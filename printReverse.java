public class printReverse {
    static int reverse(int x){
         int rev=0;
        while(x!=0){ //loop covers both positive and negative numbers
                int d=x%10;
                rev=rev*10+d;
                x/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int x=124;
       int res= reverse(x);
       System.out.println(res);
       
    }
}
