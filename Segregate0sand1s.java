public class Segregate0sand1s {
    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 1, 0};

        int zerocount = 0;
        // to count the zero
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zerocount++;
            }
        }

        // fills 0
        for(int i=0;i<zerocount;i++){
            arr[i]=0;
        }
        // fills 1
        for(int i=zerocount;i<arr.length;i++){
            arr[i]=1;
        }

        // to print array
        for (int i : arr) {
            System.out.print(i);
            
        }

        
    }
}