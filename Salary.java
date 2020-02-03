public class Salary{
    public static void main(String[] args) {
        Calculate x=new Calculate();
        int basesalary= 21100;
        double a=x.providentFund(basesalary);
        System.out.println("PF detucted from the salary will be \t"+a);
        double b=x.totalCTC(basesalary);
        System.out.println("CTC will be \t"+b);
        double c=x.inHand(basesalary);
        System.out.println("in hand salary will be \t"+c);
        
        System.out.println("HRA included in the CTC\t"+x.totalHRA(basesalary));
    
    }

}