public class Googlepay implements Paymentgateway{
    public void pay(String from, String to, long amount){
        System.out.println("paid to" +to+"from" +from +"amount" +amount);
    }
}