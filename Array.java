public class Array{
        static int rowCount=4;
        static int columnCount=4;
        static int initial=10;
        static int newarray[][]= new int[rowCount][columnCount];
    public static void main(String[] args) {
        
        
        initialize();
        display();
       /* for( int i=0;i<rowCount;i++){
            for(int j=0;j<columnCount;j++){
                  newarray[i][j]=initial++;
            }
        }
        for( int i=0;i<rowCount;i++){
            for(int j=0;j<columnCount;j++){
                System.out.print("\t"+newarray[i][j]);
            }
            System.out.println();
        }*/
    }
    private static void initialize( ){
        for( int i=0;i<rowCount;i++){
            for(int j=0;j<columnCount;j++){
                  newarray[i][j]=initial++;
            }
    }
}
    private static void display(){
        for( int i=0;i<rowCount;i++){
            for(int j=0;j<columnCount;j++){
                System.out.print("\t"+newarray[i][j]);
            }
            System.out.println();
        }
    }
    }