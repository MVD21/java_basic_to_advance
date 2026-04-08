public class ShallowCpy {
    // sha;;owcopy nit actual data copy it may affect to another object array
    public static void main(String[] args) {
        int arr[]={10,20,30};
        int x[]=arr;
        x[2]=100;
        System.out.println(arr[2]);
        
    }
    
}
