package yundongyuan_jiaolian;

public class PingPangPlayer extends Player implements SpackEnglish {

    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习打乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃营养餐B");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员要学英语");
    }
}
