package lab_06;
public class Seller extends Employee{
    public Food sell(Employee e){
        Food f = new Food();
        if(e.getWallet().getBalance() < Food.getPrice()){
            System.out.println("Your money is not enough.");
            return null;
        }
        else{
            this.getWallet().setBalance(this.getWallet().getBalance() + Food.getPrice());
            e.getWallet().setBalance(e.getWallet().getBalance() - Food.getPrice());
            return f;
            
        }
    }
}
