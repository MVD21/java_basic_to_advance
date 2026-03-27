import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // key value paire data
        // create
                //Rollno,name
        HashMap<Integer,String> map=new HashMap<>();

        // insert dada-put()
        map.put(101, "Madhavi");
        map.put(102, "Rutik");
        map.put(103, "ABC");
        map.put(104, "PQR");

        // dispaly all key value
        System.out.println(map);
        // size
        System.out.println("Size of map:- "+map.size());

        // search-containskey()-if the key present return true otherwise false;;; get()--> printing the value if exits otherwise null dispaly
        if(map.containsKey(101)){
                System.out.println("The key is present in HashMap");
        }
        else{
            System.out.println("Not present ");
        }
        System.out.println("101:- "+ map.get(101)); // if exits
        System.out.println("105:- "+ map.get(105)); // not exits 

        // iterator 
        // 1st method
        for (Map.Entry<Integer, String> e : map.entrySet()){

            System.out.println("Key:- "+e.getKey());
            System.out.println(e.getValue());

        }
        // 2nd method

        Set<Integer> s=map.keySet();
        for(int ss:s){
            System.out.println(ss+" "+map.get(ss));
        }

        // remove
        map.remove(104);
        System.out.println(map);


    }
}
