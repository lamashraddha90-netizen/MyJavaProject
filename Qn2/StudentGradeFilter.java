import java.util.ArrayList;
public class StudentGradeFilter {
    static void main(String[] args) {
        //creating arraylist object
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(78);
        scores.add(90);
        scores.add(95);
        scores.add(39);
        scores.add(1);
//for loop condition to check the result
        for(int score : scores)
        {
            if(score >= 90)
            {
                System.out.println("Distinction" + score );
            }
            else if (score >= 40)
            {
                System.out.println("pass" + score);
            }
            else {
                System.out.println("fail");
            }
        }
    }
}
