import java.util.*;

public class UnionOfArray {
    public static void main(String[] args) {
        HashSet<Integer>set =new HashSet<>();
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,6,2,4};

        // add arr1 into Hashset
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        // add arr2 into Hashset
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }

        System.out.println("Elements :- "+set.size());
        System.out.println(set);
    }
    
}
