import java.util.ArrayList;

public class MinAndMaxInArray {
    public static void main(String[] args) {
        int arr[]={1, 4, 3, 5, 8, 6};
        ArrayList<Integer>arr1=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                //arr1.add(max);
            }if(arr[i] < min){
                min = arr[i];
            }
        }
        arr1.add(min);
        arr1.add(max);
        System.out.println(arr1);
        System.out.println(min);
        System.out.println(max);
    }
    
}
