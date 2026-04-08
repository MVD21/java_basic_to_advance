public class ProductOfArray{
    public static void main(String[] args) {
        int arr[]={10,20,3,4,5,7};
        int product=1;// multipication
        for(int i=0;i<arr.length;i++){
            product*=arr[i];
        }
        System.out.println(product);
    }
}