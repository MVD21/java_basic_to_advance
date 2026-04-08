public class TwoSumBasic {
    public static void main(String[] args) {
        int arr[]={1,3,5,-3};
        int target=2;
        //using nested loop
        for(int i=0;i<arr.length;i++){// for specfic for one element
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Pairs are:- "+arr[i]+","+arr[j]+" at postion  "+i+","+j);
                }
            }
        }
    }
    
}
