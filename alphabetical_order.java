import java.util.Arrays;

public class alphabetical_order {
    public static void main(String[] args) {
        char[] al = new char[]{'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z'};

        System.out.print("字符原序列：");
        for (int i = 0; i < al.length; i++) {
            System.out.print(al[i] + " ");
        }
        Arrays.sort(al);
        System.out.print("\n升序排序后：");
        for (int j = 0; j < al.length; j++) {
            System.out.print(al[j] + " ");
        }

        System.out.print("\n降序排序后：");
        for (int k = al.length - 1; k >= 0; k--) {
            System.out.print(al[k] + " ");
        }
    }
}
