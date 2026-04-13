public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,4,5,6,7,8,8};

        int[] res = new int[arr.length];
        int k = 0;

        res[k++] = arr[0]; // first element

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i - 1]) {
                res[k++] = arr[i];
            }
        }

        for(int i = 0; i < k; i++) {
            System.out.print(res[i] + " ");
        }
    }
}