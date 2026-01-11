class Factorial
{
		int n;
		void setData(int n1){
			n=n1;
		}
		void factorial(){
			int facto=1;
			for (int i=1;i<=n;i++){
				facto=facto*i;
			}
			System.out.println(facto);
		}

	public static void main(String args[]){
		Factorial f=new Factorial();
		f.setData(5);
		f.factorial();
	}
}
		