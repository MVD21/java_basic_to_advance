public class WaveArrat {
    // upare niche
    public static void main(String[] args) {
        int arr[]={3,5,6,7,8,9,8};
        for(int i=0;i<arr.length-1;i+=2){

            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        // print array
        for (int i =0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }



        }
    
}
