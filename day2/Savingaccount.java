public class Savingaccount{
    private double accountBalance;
    private Address address;
    private AccountType accounttype;
    private long accountid;
    private static long INITIAL_ACCOUNT_ID=10000;

    public Savingaccount(AccountType accounttype,double initial,Address address){
        if(initial>10000){
        this.accountBalance=initial;
        }
        this.accounttype=accounttype;
        this.address=address;
        this.accountid=INITIAL_ACCOUNT_ID;
    }
    public long getaccountid(){
        return accountid;
    }
    public void deposit(double amount){
       this.accountBalance=+amount;
    }
    public double withdraw(double amount){
        switch(this.accounttype){
            case CURRENT_ACCOUNT:
            if((this.accountBalance-amount)>25000){
                this.accountBalance=this.accountBalance-amount;
                return amount;
            }
               break;
            case SALARIED_ACCOUNT:
            if((this.accountBalance-amount)>10000){
                this.accountBalance=this.accountBalance-amount;
                return amount;
            }
               break;
            case SAVING_ACCOUNT:
            if((this.accountBalance-amount)>0){
                this.accountBalance=this.accountBalance-amount;
                return amount;
            }
                break;
        }
       
           return 0;
       
    }
    public double checkAccountBalance(){
        return this.accountBalance;
    }
    public void updateaddress(Address address){
        this.address=address;
    }
}