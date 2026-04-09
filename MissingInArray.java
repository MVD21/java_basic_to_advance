public class MissingInArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        // missing in array means to final the missing elements using the sum of array and n
        long n=arr.length+1; // for the purpose to final missing elemnt
        // to calculate the sum of the number expected sum from 1 to n
        long nsum=n*(n+1)/2;
        // to calculate the aaray of sum
        long arrsum=0;
        for (int i : arr) {
            arrsum+=i;
            
        }
        // find the missing no arrsum-nsum;
        long missele=nsum-arrsum;
        System.out.println("Missing elements:- "+missele);

        
    }
    
}
