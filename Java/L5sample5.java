import java.io.*;
public class L5sample5 {
    public static void main(String[] args) throws IOException
    {
        System.out.println("何番目のコースにしますか？");
        System.out.println("整数を入力してください。");
     
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        char ans;
        if(res == 1)
            ans = 'A';
        else
            ans = 'B';

            System.out.println(ans + "コースを選択しました。");
            
    }

}