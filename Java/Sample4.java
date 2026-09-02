import java.io.*;
import java.util.Scanner;

public class Sample4 {
    public static void main(String[] args) {
        System.out.println("成績を入力してください（1〜5）");

        BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();

        switch (grade) {
            case 1:
                System.out.println("もっと頑張りましょう");
                break;
            case 2:
                System.out.println("もう少し頑張りましょう");
                break;
            case 3:
                System.out.println("さらにうえを目指しましょう");
                break;
            case 4:
                System.out.println("大変よくできた");
                break;
            case 5:
                System.out.println("大変優秀です");
                break;
            default:
                System.out.println("1〜5 の範囲で入力してください");
        }

        sc.close();
    }
}