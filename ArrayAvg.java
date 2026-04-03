public class ArrayAvg {

    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        int sum=0;
        // 1st window
        for(int i=0;i<k;i++){
            sum=sum+arr[i];

        }
        System.out.println(sum/(double)k);

        //sliding window
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k]; 
        }
        System.out.println(sum/(double)k);
    }
    
}
