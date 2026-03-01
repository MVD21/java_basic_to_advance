import java.util.*;
class ArrayCode{
   
   // pass by reference
   public static void Update(int n[]){
    for(int i=0;i<n.length;i++){
        n[i]=n[i]*2;
    }
   }


   // linear search
   public static int linearSearch(int n[],int key){
    for(int i=0;i<n.length;i++){
        if(n[i]==key){
            System.out.println("Key Found at the "+i+" Position");
            return 1;
        }
    }
    System.out.println("key not found ");
    return -1;
   }

   // largest no
   public static int largestNoArray(int n[]){
    
   }
   
   
   
   
   
   
   
   
   
   
   
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // create an arrya
        int arr[]=new int[6];
         System.out.println("Enter input array  ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();  
        }
        System.out.println("Enter a key to find:- ");
        int key=sc.nextInt();
        System.out.println(linearSearch(arr,key));









        // upadte array
        /*Update(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println("Result is "+arr[i]);
        }*/

    }
}