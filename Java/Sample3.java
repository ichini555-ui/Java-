import java.io.*;
import java.util.Scanner;

public class Sample3 {
	public static void main(String args[]) throws IOException
	{

        System.out.println("整数を入力してください（0〜10）");

        BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);
        int res = sc.nextInt();

        if (res >= 0 && res <= 10) {
            System.out.println("正解です。");
        } else {
            System.out.println("間違です。");
        }

        sc.close();
    }
}

