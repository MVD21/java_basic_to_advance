public class RemoveElementInArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int k=4;
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=k){
                arr[j++]=arr[i];
            }
        }
        for(int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
