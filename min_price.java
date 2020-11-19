import java.util.Scanner;

public class min_price {
    public static void main(String[] args) {
        int[] list = new int[4];
        System.out.println("请输入4家店的价格");
        Scanner input = new Scanner(System.in);
        for (int i = 1; i < list.length + 1; i++) {
            System.out.print("第" + i + "家店的价格：");
            list[i - 1] = input.nextInt();
        }
        int min = list[0];
        for (int j = 1; j < list.length; j++) {
            if (min > list[j]) {
                min = list[j];
            }
        }
        System.out.println("最低价格是：" +min);
    }
}

