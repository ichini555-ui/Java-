import java.io.*;

public class Sample2 {
	public static void main(String args[]) throws IOException
	{
		System.out.println("2つの整数を入力してください");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
        String str2 = br.readLine();
        
        int a = Integer.parseInt(str);
        int b = Integer.parseInt(str2);

		
		if(a == b){
			System.out.println("2つの数は同じ値です。");
		
        }else
            if (a > b){
            System.out.println(a + "の方が大きいです。");
            }
        else{

			System.out.println(b + "の方が大きいです。");
		}
	}
}
	