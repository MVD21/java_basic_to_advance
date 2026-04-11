public class MerageTwoSortedArrayInReverse {
    public static void main(String[] args) {
        int a[]={2,3,4,5};
        int b[]={1,3,6,7,10,20};
        int res[]=new int[a.length+b.length];

        int i=a.length-1;
        int j=b.length-1;
        int k=res.length-1;
        // compare two sorted array
        while(i>=0 && j>=0){
            if(a[i]>b[j]){
                res[k]=a[i];
                i--;
            }else{
                res[k]=b[j];
                j--;
            }
            k--;
        }
        // remaing 
        while (i>=0) {
            res[k]=a[i];
            i--;
            k--;
        }
        while (j>=0) {
            res[k]=b[j];
            j--;
            k--;
        }
        for (int ele : res) {
            System.out.print(ele+" ");           
        }
    }
    
}
