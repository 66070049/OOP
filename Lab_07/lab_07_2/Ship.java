package lab_07_2;
public class Ship extends Vehicle implements Floatable{
    public Ship(){
        this(0.0);
    }
    public Ship(double fuel){
        super(fuel);
    }
    @Override
    public void fl0at(){
        if(fuel < 50){
            System.out.println("Fuel is not enough.");
        }
        else{
            fuel -= 50;
            System.out.println("Ship moves");
        }
    }
    @Override
    public void startEngine(){
        if(fuel < 10){
            System.out.println("Fuel is not enough.");
        }
        else{
            fuel -= 10;
            System.out.println("Engine starts");
        }
    }
    @Override
    public void stopEngine(){
        System.out.println("Engine stops");
    }
    @Override
    public void honk(){
        System.out.println("Shhhhh");
    }
    public void move(){
        this.fl0at();
    }
    public void move(int distance){
        for(int i = 1; i <= distance; i++){
            if(fuel < 50){
            System.out.println("Fuel is not enough.");
            break;
            }
            this.fl0at();
        }
    }
}
