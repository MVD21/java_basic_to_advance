public class OneTo5PrintUsingREcursion {
    public void One_to_5_print1(int n){

        if(n==6){
            return;
        }

        System.out.print(" "+n);
        One_to_5_print1(n+1);

    }
    public static void One_to_5_print2(int n){

        if(n==10){
            return;
        }
        System.out.println();
        System.out.print(" "+n);
        One_to_5_print2(n+1);
    }
    public static void main(String[] args) {
        // using class object to call function becox function cannot static
        OneTo5PrintUsingREcursion on=new OneTo5PrintUsingREcursion();
        on.One_to_5_print1(1);

        // using static function direct call it
        One_to_5_print2(1);
    }
    
}
