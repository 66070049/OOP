package lab_10_3;
import java.util.*;
public class Customer_2 {
   private String firstName;
   private String lastName;
   private ArrayList acct;
   public Customer_2(){
       this("", "");
       acct = new ArrayList();
   }
   public Customer_2(String firstName, String lastName){
       this.firstName = firstName;
       this.lastName = lastName;
       acct = new ArrayList();
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
       return ((Account)acct.get(index));
   }
   public void addAccount(Account ac){
       acct.add(ac);
   }
   public int getNumOfAccount(){
       return acct.size();
   }
   @Override
   public String toString(){
       return firstName + lastName + acct.size();
   }
   public boolean equals(Customer_2 c){
       return this.firstName.equals(c.getFirstName()) && this.lastName.equals(c.getLastName());
   }
}
