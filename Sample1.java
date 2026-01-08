class Sample1{
	public static void main(String args[]){

		Sample2 obj=new Sample2();
		obj.setData(10,20);
		obj.show(); 
	}
}
class Sample2
{

	int a,b;
	void setData(int a,int b){
		this.a=a;
		this.b=b;
	}
	void show()
	{
		System.out.println("A: "+a+"B: "+b);
	}

}
