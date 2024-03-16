package Ex_03;
public class Student {
    public String name;
    public double mScore;
    public double fScore;
    public void showGrade(){
        double s = (mScore*0.4)+(fScore*0.4)+20;
        if (80 <= s){
            System.out.println("Your grade is A.");
        }else if (60 <= s && s < 70){
            System.out.println("Your grade is B.");
        }else if (60 <= s && s < 70){
            System.out.println("Your grade is C.");
        }else if (50 <= s && s < 60){
            System.out.println("Your grade is D.");
        }else{
            System.out.println("Your grade is F.");
        }
    }
}
