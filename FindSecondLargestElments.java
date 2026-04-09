public class FindSecondLargestElments {
    public static void main(String args[]){
        int arr[]={10,4,78,90,56,65};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        // for 1st to find max 1st value
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        // To find 2nd largest value using following loop
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println("1st Max Value:- "+max);
        System.out.println("2nd Max Value:- "+smax);
    }
    
}
