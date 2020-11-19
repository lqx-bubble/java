import java.util.*;

public class gueeNum {
    public static void main(String[] args) {
        int sum = 0;
        int[] list = new int[]{8, 4, 2, 1, 23, 344, 12};
        for (int i : list) {   //增强for循环   类型 变量名 : 数组或Collection集合
            System.out.println(list[i]);
            sum = sum + list[i];
        }
        System.out.println("sum=" + sum);
        System.out.println("请输入你猜的数字：");
        Scanner input = new Scanner(System.in);
        int guessNum = input.nextInt();
        boolean istrue = false;
        for (int j : list) {     //增强for循环
            if (guessNum == list[j]) {
                istrue = true;
            } else {
                istrue = false;
            }
        }
        if (istrue) {
            System.out.println("恭喜你，猜对了！");
        } else {
            System.out.println("抱歉，猜错啦！");
        }
    }
}
