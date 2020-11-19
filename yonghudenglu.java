import java.util.Scanner;

public class yonghudenglu {
    public static void main(String[] args) {
        String uername = "luqixin";
        String password = "2000515";

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<3; i++) {
            System.out.print("请输入你的账户名：");
            String name = sc.nextLine();

            System.out.print("请输入你的密码：");
            String word = sc.nextLine();
            if (name.equals(uername) && word.equals(password)) {
                System.out.println("登录成功！");
                break;
            }else {
                System.out.println("登录失败，你还有"+(2-i)+"次机会");
            }
        }
    }
}
