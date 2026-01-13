import java.io.*;
class GetInputThrogthUsingBufferClass
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number:- ");
		int n=Integer.parseInt(br.readLine());
		System.out.println(n);
	} 

}