package yundongyuan_jiaolian;

public class PingPangCoach extends Coach implements SpackEnglish {

    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("足球教练教足球");
    }

    @Override
    public void eat() {
        System.out.println("足球教练吃羊肉");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练要学英语");
    }
}
