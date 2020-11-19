public class try_catch {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method() {
        try {
            int[] array = {1, 4, 7,};
            System.out.println(array[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("--------");
            System.out.println(e.toString());
            System.out.println("--------");
            e.printStackTrace();     //显示异常信息并且程序能继续执行
        }
    }
}
