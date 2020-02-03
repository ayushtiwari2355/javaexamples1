public class ProgrammingConduct{
    public static void main(String[] args) {
        for (int index = 0; index < args.length; index++) {
            System.out.println(index);
        }
      /*  if(args.length>0){
            System.out.println(args.length);
        }
        else{
            System.out.println("city");

        }*/
        int value= args.length;
        while(value>0){
            System.out.println(args[value-1]);
            value--;
        }
    }
}