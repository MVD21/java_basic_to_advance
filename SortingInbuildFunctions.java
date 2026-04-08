import java.util.*;
//import java.util.Collections;;
public class SortingInbuildFunctions {
    public static void main(String[] args) {
        System.out.println("Asecending order");
        int arr[]={10,20,-1,-8,300};
        print(arr);
        Arrays.sort(arr); // for asecending order
        print(arr);
        System.out.println("Descending order");

        int arr1[]={10,3,5,7,-3,-4};
        print(arr1);
        Arrays.sort(arr1); // sort in asecending
        //after it reverse aaray then it is descending order
        for(int i=0;i<arr1.length;i++){
            int temp=arr1[i];
            arr1[i]=arr1[arr1.length-1];
            arr1[arr1.length-1]=temp;
        }
        
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
