package yundongyuan_jiaolian;

public class BaskteballPlayer extends Player{

    public BaskteballPlayer() {
    }

    public BaskteballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习打篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃营养餐A");
    }
}

