import java.util.*;
public class HashSetExample {

    public static void main(String[] args) {
        // create hashset
        HashSet<Integer> hset=new HashSet<>();

        //Insert:- add()
        hset.add(11);
        hset.add(12);
        hset.add(13);
        hset.add(11);

        // display the size of hashset
        System.out.println("Hashset size:- "+hset.size());

        // dispaly all hashset 
        System.out.println(hset);

        // Search-contains()-set can contains specfic element or not
        if (hset.contains(11)) {
            System.out.println("The 11 Element is present in hashset:- "); //true
        }
        // false--true
        if(!hset.contains(16)){
            System.out.println("This 16 Element is not present in hashset:- ");
        }

        // iterator-just like a for loop(tract the each element which present in the hashset)

        Iterator it=hset.iterator();

        // there have two function hashNext()-return true or false it check the next elemt present or not
        // next()--print the next set elements amonge call this functin

        while(it.hasNext()){
            System.out.println(it.next());
        }

        // delete element

        hset.remove(13);
        System.out.println("After Deleting:- "+hset);

    }
}