import java.security.Key;
import java.util.*;
public class HashMapImplement{

    public static class HashMap<K,V>{

        public class Node{
            K key;
            V value;

            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }

        private int N;//Size of array - buckets 
        private int n; //no.of nodes 
        // int arr[];
        private LinkedList<Node> backets[];

        public HashMap(){
            this.N=4;
            this.backets=new LinkedList[4];

            for(int i=0;i<4;i++){
                this.backets[i]=new LinkedList<>();
            }

        }

        public int HashMapCode(K key){
            int bi=key.hashCode(); // to get the bucket index means array index
            return Math.abs(bi); // covert it into Negative to positive 
        }
        public int SearchInLL(K key,int bi){
            LinkedList<Node>ll=backets[bi];
            int di=0;// linked list start with 0
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key==key){
                    return i;
                }
            }
            return -1;

        }
        // double the array
        public void rehash(){
            LinkedList<Node> oldbackets[]=backets;
            backets=new LinkedList[N*2];
            for(int i=0;i<oldbackets.length;i++){
                LinkedList<Node>ll=oldbackets[i];
                for(int j=0;j<ll.size();i++){
                    Node node=ll.get(j);
                    put(node.key,node.value);
                }

            }

        }

        public  void put(K key, V value){

            int bi=HashMapCode(key);
            int di= SearchInLL(key,bi);

            if(di==-1){ // if node is not exits
                backets[bi].add(new Node(key,value));
                n++;
            }
            else{
                Node node=backets[bi].get(di); // get the aaray index after going their linkedlist node with their index and upadate it
                node.value=value;
            }
            double lambda=(double)n/N; // for rehashing when the time complexity is greater 
            if(lambda>2.0){
                rehash();
            }

        }

        public boolean containsKey(K key){
            int bi=HashMapCode(key);
            int di=SearchInLL(key, bi);

            if(di==-1){
                return false;
            } else{
                return true;
            }
        }

        public V get(K key){
            int bi=HashMapCode(key);
            int di=SearchInLL(key, bi);
            if(di==-1){
                return null;
            }else{
                Node node=backets[bi].get(di);
                return node.value;
            }

        }


        
    }

    public static void main(String args[]){

       // HashMap<String,Integer> map=new HashMap<>();
       HashMap<String,Integer>map=new HashMap<>();
       map.put("Madhavi",101);
       map.put("Rutik",101);
       map.put("ABC",105);

       map.containsKey("Madhavi");
       map.get("Rutik");



    }
}