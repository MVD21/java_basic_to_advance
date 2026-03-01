import java.util.*;
class ConditionalSHW{
    public static void main(String args[]){
        // Q.1 positive or negative 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number whose check is positive or no ");
        int num=sc.nextInt();
        if(num>0)
        {
            System.out.println("Number is positive  "+num);
        }
        else{
            System.out.println("Number is Negative  "+num);
        }
        System.out.println("..........................................................................................");
       // Tempture fevar check
       float temp=103.5f;
       if(temp>100)
       {
        System.out.println("You have fevar");
       }else{
        System.out.println("You dont have fevar");
       }
         System.out.println("..........................................................................................");
      // week(1-7) using switch case;

     System.out.println("Enter the week no.:- ");
      int weekno=sc.nextInt();
      switch(weekno){
        case 1:System.out.println("Monday");
        break;
        case 2:System.out.println("Tuesday");
        break;
        case 3:System.out.println("Wednesday");
        break;
        case 4:System.out.println("Thursday");
        break;
        case 5:System.out.println("Friday");
        break;
        case 6:System.out.println("Saturday");
        break;
        case 7:System.out.println("Sunday");
        break;
        default : System.out.println("Wrong Choice ");
      } 
     System.out.println("..........................................................................................");
     // leap year 
    System.out.println("Enter Year .:- ");
    int year=sc.nextInt();
        if((((year%4)==0)&& (year%100==0) ) || (year%400==0))
        {
            System.out.println("Leap year");
        }
    else{
        System.out.println("Not leap year");
        }

      }


    }