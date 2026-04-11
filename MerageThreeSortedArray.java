public class MerageThreeSortedArray {
    public static void main(String[] args) {
        int a[]={2,5,6,8};
        int b[]={1,4,6,7,10,20};
        int c[]={3,5,6,19,20,30,40};

        int res[]=new int[a.length+b.length+c.length];

        int i=0;
        int j=0;
        int k=0;
        int l=0; // for res[] travers
        // compare all three arrays

        while (i<a.length && j<b.length && k<c.length) {
            if(a[i]<b[j] && a[i]<c[k])
            {
                res[l]=a[i];
                i++;
            }
            else if(b[j]<c[k]){
                res[l]=b[j];
                j++;
            }
            else{
                res[l]=c[k];
                k++;
            }
            l++;  
        }

        // comapare two remaiting sorted array 
        // 1st two array
        while (i<a.length && j<b.length) {
            if(a[i]<b[j]){
                res[l]=a[i];
                i++;

            }else{
                res[l]=b[j];
                j++;
            }
            l++;
        }
        // 2nd and 3rd array
        while(j<b.length && k<c.length){
            if(b[j]<c[k]){
                res[l]=b[j];
                j++;
            }
            else{
                res[l]=c[k];
                k++;
            }
            l++;
        }
        // 1st and 3rd array
        while (i<a.length && k<c.length) {
            if(a[i]<c[k]){
                res[l]=a[i];
                i++;
            }
            else{
                res[l]=c[k];
                k++;
            }
            k++;
        }
        // remating separate arrays 
        while (i<a.length) {
            res[l]=a[i];
            i++;
            l++;
        }
        while (j<b.length) {
            res[l]=b[j];
            j++;
            l++;
        }
        while (k<c.length) {
            res[l]=c[k];
            k++;
            l++;
        }
        for (int ele : res) {
            System.out.print(ele+" ");
            
        }
    }
    
}
