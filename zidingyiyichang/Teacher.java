package zidingyiyichang;

public class Teacher {

    public void cheakScore(int score) throws ScoreException {
        if (score < 0 || score > 100){
//            throw new ScoreException();
            throw new ScoreException("分数有误，分数应该在0-100之间");
        }else {
            System.out.println("分数正常");
        }
    }
}
