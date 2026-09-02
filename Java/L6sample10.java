import java.io.*;
public class L6sample10 {
    public static void main(String[] args) throws IOException
    {
     System.out.println("テストの点数を入力してください。(0 で終了)");
     BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int num = -1;
        while(num != 0){
            String str = br.readLine();
        num = Integer.parseInt(str);
        sum += num;
        }

        System.out.println("テストの合計は" + sum + "点です。");
     }
    }

            
        