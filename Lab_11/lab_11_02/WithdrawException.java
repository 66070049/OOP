package lab_11_02;
public class WithdrawException extends Exception{
    private Account ac;
    public WithdrawException(){
        super("");
    }
    public WithdrawException(String s){
        super(s);
    }
}
