import java.util.*;
class ConditionalS{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        // if-else
        // largest 2 no.
        System.out.println("Enter a num1:-  ");
        int num1=sc.nextInt();
        System.out.println("Enter a num2:-  ");
        int num2=sc.nextInt();
        System.out.println("Largest 2 no is ---------------------------------------------------------------------------------------");
        if(num1>=num2){
            System.out.println("Number 1 is grater");
        }else{
            System.out.println("Number 2 is grater");
        }
        System.out.println("Even or odd no is-------------------------------------------------------------------------------------");
        // even odd no.
        if((num1%2==0)){
            System.out.println("Number is Even "+num1);
        }else{
             System.out.println("Number is ODD "+num1);
        }
        //else if 
        // income tax
        System.out.println("Incom Tax Calculator----------------------------------------------------------------------------------");
        System.out.println("Enter your income:- ");
        int income=sc.nextInt();
        int tax;
        if(income<500000)
        {
            tax=0;
        }else if((income>=500000) && (income<1000000))
        {
            tax=(int) (income*0.2);
        }else{
            tax=(int) (income*0.3);
        }
        System.out.println("Your tax is:- "+tax);

        // Largest 3 no.

        System.out.println("Largest 3 no.----------------------------------------------------------------------------------");
        System.out.println("Enter A number 3:- ");
        int num3=sc.nextInt();
        if((num1>=num2) && (num1>=num3))
        {
            System.out.println("Number 1 is Largest "+num1);
        }else if((num2>=num3))
        {
            System.out.println("Number 2 is Largest "+num2);
        }else{
            System.out.println("Number 3 is Largest "+num3);
        }

        // Ternary condition it is single line condition if true then execute statament 1 otherwise statament 2 execute
        // check pass or fail
        System.out.println("Check pass or fail using ternary operator--------------------------------------------------------------");
        System.out.println("Enter a Marks :- ");
        float marks=sc.nextFloat();
        String res=(marks>=33)?"Pass":"Fail";
        System.out.println(res);

        // Switch case is the Selective statament 
        System.out.println("Calculator using Switch case-------------------------------------------------------------------------");
        System.out.println("Enter a Operator:- ");
        char op=sc.next().charAt(0);
        switch(op){
            case '+': System.out.println("Add Operator '+'"+(num1+num2));
                      break;
            case '-': System.out.println("Subtract Operator '-'"+(num1-num2));
                      break;
            case '*': System.out.println("Multiply Operator '*'"+(num1*num2));
                      break;
            case '/': System.out.println("Division Operator '/'"+(num1/num2));
                      break;
            case '%': System.out.println("Add Operator '%'"+(num1%num2));
                      break;
            default : System.out.println("Wrong Choice ");
                      break;
        }


    }
}