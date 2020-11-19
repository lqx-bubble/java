import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class print_coumt {
    public static void main(String[] args) {
        double[] list = new double[5];
        double sum = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入会员本月的消费");
        for (int i = 1; i < list.length + 1; i++) {
            System.out.print("请输入第" + i + "笔购物金额：");
            list[i - 1] = input.nextDouble();
            sum = sum + list[i - 1];
        }
        System.out.println("\n");
        System.out.println("序号                 金额（元）");
        for (int j = 1; j < list.length + 1; j++) {
            System.out.print(j);
            System.out.println("                    " + list[j - 1]);
        }
        System.out.println("总金额                " + sum);
        //System.out.println(Arrays.toString(list));    // 输出数组
    }
}
