import java.util.*;
public class DeepCopy{
    // deep copy means it is copy the actual content of object and it does not affect to each other
    public static void main(String[] args) {
        int arr[]={12,10,20,60};
        int x[]=Arrays.copyOf(arr, arr.length);
        x[2]=101;
        System.out.println(arr[2]);
    }
}