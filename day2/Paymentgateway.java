interface Paymentgateway{
   abstract public void pay(String from, String to, long amount);
}