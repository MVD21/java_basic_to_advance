public class SearchInArray {
    public static void main(String[] args) {
        // linear search :- Searach elemnet one by one if found then return exits and return index
        int arr[]={10,20,40,80,89};
        int target=-1;
        int found=-1; //the no.and not exits
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                found=i;
                break;
            }

        }
        if(found!=-1){
            System.out.println("The No.is exits in array at the position :- "+found);
        }
        else{
            System.out.println("Not found at this postion:- ");
        }
    }
    
}
