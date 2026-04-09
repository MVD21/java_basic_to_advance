public class RotatedArray {
    // starting ke elements last mai dalana 
    public static void main(String[] args) {
        int arr[]={6,8,1,2,4,9,0};
        print(arr);
        int n=arr.length;

    // {2,4,9,0,6,8,1}
    int d=3;
    d%=n;
    // 1st step to reverse 1 three elemnts from o to d-1;
    reverse(arr,0,d-1);
    // 2nd step to reverse rahilel part form d to n-1;
    reverse(arr,d,n-1);
    // 3rd and final step to reverse all modify array from 0 to n-1;
    reverse(arr,0,n-1);
    print(arr);
        
    }
    public static void reverse(int arr[],int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    
}
    

