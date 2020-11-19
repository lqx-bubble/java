import java.util.Scanner;

public class tongjizifugeshu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一组字符串：");
        String line = sc.nextLine();

        int bigcount = 0;
        int smallcount = 0;
        int numbercount = 0;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                bigcount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallcount++;
            } else if (ch >= '0' && ch <= '9') {
                numbercount++;
            }
        }
        System.out.println("大写字母有" + bigcount + "个");
        System.out.println("小写字母有" + smallcount + "个");
        System.out.println("数字有" + numbercount + "个");
    }
}
