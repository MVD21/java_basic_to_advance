public class RotatedArrayByOne{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5}; // roated array one only {5,1,2,3,4}
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
        
        reverse(arr,0,arr.length-1); // reverse all
        reverse(arr,1,arr.length-1);
        System.out.println("Result");

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    private static void reverse(int[] arr, int i, int j) {
        while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
        }
        
    }
}