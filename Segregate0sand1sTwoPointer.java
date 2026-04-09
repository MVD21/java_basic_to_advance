public class Segregate0sand1sTwoPointer {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,0};
        int n=arr.length;
        int i=0;
        int j=n-1;
        while (i<j) {
            // to check the zero
            if(arr[i]==0){
                i++;
            }
            else if (arr[j]==1) 
                {
                    j--;  
            }
            else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            
        }
        for(int j1=0;j1<n;j1++){
            System.out.print(arr[j1]+" ");
        }

    }
    
}
