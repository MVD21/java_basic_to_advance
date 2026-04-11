public class MerageTwoSortedArray{
    public static void main(String[] args) {
        int a[]={2,5,6,8};
        int b[]={1,4,6,7,10,20};
        int res[]=new int[a.length+b.length];

        int i=0; // for a array travser
        int j=0; // for b array travser
        int k=0; // for res[] array travers
        for (int pre : res) {
            System.out.print(pre+" ");
            
        }
        while (i< a.length && j<b.length) {
            if(a[i]<b[j]){ // if less than then perform following operation
                res[k]=a[i];
                i++;
            }else{
                res[k]=b[i];
                j++;
            }
            k++; 
        }
        while(i<a.length){ // remainting 
            res[k]=a[i];
            i++;
            k++;
        }

        while (j<b.length) {
            res[k]=b[j];
            j++;
            k++; 
        }
        System.out.println();

        for (int ele : res) {
            System.out.print(ele+" ");
            
        }

    }
}