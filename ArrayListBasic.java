import java.util.*;
public class ArrayListBasic {
    public static void main(String[] args) {
        // to create arraylist
        ArrayList<Integer> arr=new ArrayList<>();
        // arraylist is dynamic which is increase and dec 
        // to add the elements without mention the index of array
        arr.add(21);
        arr.add(15);
        arr.add(56);
        arr.add(45);
        arr.add(34);

        // to add the elements in the specific location
        arr.add(2, 89);

        // to print array 
        System.out.print(arr);
        System.out.println();

        // using looping
        System.out.println();
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        // using for each
        System.out.println();
        for (Integer integer : arr) {
            System.out.print(integer+" ");
        }
        // to access the array in the list using the get
        System.out.println(arr.get(2));

        // to update the aaraylist using the set(index,newelement)
        arr.set(4, 67);
        System.out.print(arr);
        System.out.println();

        // remove 
        arr.remove(2);
        System.out.print(arr);

        // when we want to reverse the arrayElements
        // inbuilt 
        Collections.reverse(arr);
        System.out.println();
        System.out.print(arr);

        // manually 
        int i=0;
        int j=arr.size()-1;
        while (i<j) {
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println();
        System.out.print(arr);
        System.out.println();

        // to calculate the size
        System.out.println(arr.size());

    }
    
}
