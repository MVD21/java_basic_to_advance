import java.util.*;

public class AddingOne {
    public static void main(String[] args) {
        int arr[]={3,2,1};
        int carry=1;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            // if the ele+1<=9 then add into arr2
            if(arr[i]+carry<=9){
                ans.add(arr[i]+carry);
                carry=0;
            }else{
                ans.add(0);
                carry=1;
            }
        }
        // if the carray become zero in last then add
        if(carry==1){
            ans.add(1);
        }

        // reverse the modify array
        Collections.reverse(ans);
        System.out.print(ans);

        
    }
    
}
