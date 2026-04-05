class Even{
    public static void main(String []args)
    {
        int count=1;
        int first=0;
        int second=1;
        while(count<=8)
        {
            System.out.println(first);
            int temp=first+second;//swapping
            first=second;
            second=temp;
            count=count+1;
        }
    }
}