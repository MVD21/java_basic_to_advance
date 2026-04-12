public class ThirdLargestInArray {
    public static void main(String[] args) {
        int arr[]={2, 4, 1, 3, 5};
        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int tmax=Integer.MIN_VALUE;
        // compare 1st max value
        for(int i=0;i<arr.length;i++){
                if(arr[i]>fmax){
                    fmax=arr[i];   
        }
        
    }
    // then the find 2nd after it third
    for(int i=0;i<arr.length;i++){
        if(arr[i]>smax && arr[i]!=fmax){
            smax=arr[i];
        }
        if(arr[i]>tmax && arr[i]!=smax && arr[i]!=fmax){
            tmax=arr[i];
        }
    }
    
    System.out.println(tmax);
    }
    
    
    
}
