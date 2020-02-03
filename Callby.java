public class Callby{
    public static void main(String[] args) {
        int value =100;
        int array[]= new int[10];
        callbyValue(value);
        System.out.println(value);
        callbyReference(array);
        System.out.println(array[0]);
    }
    public static void callbyValue(int value){
        ++value;

    }
    public static void callbyReference(int [] array){
         array[0]=12;
    }
}