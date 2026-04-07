
public class ArrayCode1 {
    public static int sumOfArray(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int largestElementInArray(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;

    }
    public static int smallestElementInArray(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
    int arr[]={-6,8,14,15,-2,23,47,-7};
    System.out.println("Sum:- "+sumOfArray(arr));
    System.out.println("Largest Element in array:- "+largestElementInArray(arr));
    System.out.println("Smallest Element in Array:- "+smallestElementInArray(arr));
        
    }
}
