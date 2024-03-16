package Ex_05;
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
        public boolean myEquals(Fraction x){
        int num1 = topN * x.btmN;
        int num2 = x.topN * btmN;
        return num1 == num2;
    }
    public void LowestTermFrac(){
        int num1 = Math.abs(topN);
        int num2 = Math.abs(btmN);
        while(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        topN = topN / num1;
        btmN = btmN / num1;
    }
    }


