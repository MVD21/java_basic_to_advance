public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={10,20,40,56,78,1,2};
        System.out.println("2nd Methods:- ");
        //int n=arr.length;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        print(arr);
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
