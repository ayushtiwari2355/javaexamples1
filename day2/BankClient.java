public class BankClient{
    public static void main(String[] args) {
        Address address=new Address("228", "H-block dharam colony", "gurugram", 12345);
        
        Savingaccount s= new Savingaccount(AccountType.SALARIED_ACCOUNT,20000, address);
        System.out.println(s.getaccountid());
        System.out.print("withdraw amount is"+s.withdraw(200));
       }
    
}