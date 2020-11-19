import java.util.Arrays;
import java.util.Scanner;

public class alphabetical_order_insert {
    public static void main(String[] args) {
        char[] al = new char[]{'a', 'b', 'c', 'e', 'f', 'p', 'u', 'z',' '};
        System.out.print("字符原序列：");
        for (int i = 0; i < al.length; i++) {
            System.out.print(al[i] + " ");
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("\n待插入字符是：");
        char inputChar = scan.next().charAt(0);
        int index = 0;
        for (int i = 0; i < al.length; i++) {
            if (inputChar < al[i]) {
                index = i;
                break;
            }
        }

        System.out.println("插入字符的下标是：" + index);
        for (int j = al.length - 1; j > index; j--) {
            al[j] = al[j - 1];
        }

        al[index] = inputChar;              //实现字符插入
        System.out.print("插入后的字符序列是：");
        for (int k = 0; k < al.length; k++) {
            System.out.print(al[k]+" ");
        }
    }
}