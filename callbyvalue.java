

class callbyvalue{
    void changevalue(int x)
    {
        x=x+10;
        System.out.println("inside method x="+x);
    
    }
    public static void main(String[] arg){
        int a=5;
        callbyvalue obj=new callbyvalue();

        System.out.println("Before method call:- "+a);
        obj.changevalue(a);

        System.out.println("after call the method: "+a);
    }
}