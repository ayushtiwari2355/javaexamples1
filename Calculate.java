public class Calculate{
    public double providentFund(int basesalary){
        return (0.12*basesalary);
    }
    public double totalCTC(int basesalary){
        return basesalary+(0.12*basesalary);
    }
    public double inHand(int basesalary){
        return basesalary-(0.12*basesalary);
    }
    public double totalHRA(int basesalary){
        return basesalary*0.30;
    }
}