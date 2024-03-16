package lab_10_2;
public class Customer_1 {
   private String firstName;
   private String lastName;
   private Account acct[];
   private int numOfAccount;
   public Customer_1(){
       this("", "");
       acct = new Account[5];
   }
   public Customer_1(String firstName, String lastName){
       this.firstName = firstName;
       this.lastName = lastName;
       acct = new Account[5];
   }
   public void setFirstName(String firstName){
       this.firstName = firstName;
   }
   public String getFirstName(){
       return firstName;
   }
   public void setLastName(String lastName){
       this.lastName = lastName;
   }
   public String getLastName(){
       return lastName;
   }
   public Account getAccount(int index){
       return acct[index];
   }
   public void addAccount(Account ac){
       for(int i=0; i<acct.length; i++){
            if(acct[i] == null){
                acct[i] = new Account(ac.getBalance(), ac.getName());
                numOfAccount += 1;
                break;
            }
        }
   }
   public int getNumOfAccount(){
       return numOfAccount;
   }
   @Override
   public String toString(){
       return firstName + lastName + numOfAccount;
   }
   public boolean equals(Customer_1 c){
       return this.firstName.equals(c.getFirstName()) && this.lastName.equals(c.getLastName());
   }
}
