import java.util.*;


public class HasHMapEx1{

    public static void majoryElement(int num[]){
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<num.length;i++){
            if(map.containsKey(num[i])){ //if exits
                map.put(num[i],map.get(num[i])+1);

            }else{ //does not exits
                map.put(num[i],1);
            }
        }
       // int con=num.length/3;
        for(int keys:map.keySet()){
            if(map.get(keys)>(num.length/3)){
                System.out.println("Majority of elements:- "+keys+" their freq:- "+map.get(keys));
                
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={1,3,2,5,1,3,1,5,1};
        HasHMapEx1 map1=new HasHMapEx1();
        map1.majoryElement(nums);
    }


}