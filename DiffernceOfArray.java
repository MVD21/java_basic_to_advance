public class DiffernceOfArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,9,7,8};
    int dif=0;
    for(int i=0;i<arr.length;i++){
        dif-=arr[i];
    }
    System.out.println(dif);
    }
}
