package lab_06;
public class Programmer extends Employee{
    private int happiness;
    public void coding(String str){
        if(30 <= this.getEnergy()){
            System.out.println("Your code is " +str);
        }
        else{
            System.out.println("Error Error Error");
        }
        this.setEnergy(this.getEnergy() - 30);
            this.happiness -= 30;
    }
    public void coding(char str){
        this.coding("" + str);
    }
    public int getHappiness(){
        return happiness;
    }
    public void setHappiness(int happiness){
        this.happiness = happiness;
    }
}
