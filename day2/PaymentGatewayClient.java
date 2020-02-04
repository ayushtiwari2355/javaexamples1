public class PaymentGatewayClient{
    public static void main(String[] args) {
        Paymentgateway p= new Googlepay();
        p.pay("ayush","ankur",2000);
    }
}