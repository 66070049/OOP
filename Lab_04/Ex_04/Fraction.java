package Ex_04;
public class Fraction {
    public int topN;
    public int btmN;
    public String toFraction(){
        String num1 = String.valueOf(topN);
        String num2 = String.valueOf(btmN);
        return num1 + "/" + num2;
    }
    public String toFloat(){
        double cal = (double)topN / btmN;
        String num = String.valueOf(cal);
        return num;
    }
    public void addFraction(Fraction f){
        if (btmN == f.btmN){
            topN = topN + f.topN;
        }else if (btmN != f.btmN){
            topN = topN * f.btmN + f.topN * btmN;
            btmN = btmN * f.btmN;
        }
    }
}
