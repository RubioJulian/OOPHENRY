public class Catch_Multiple {
    public static void main(String[] args){
        try{
           int[] myNumbers= {1,2,3};
            System.out.println(myNumbers[10]);
        } catch (Exception e){
            System.err.println("ERROR: Algo va mal ");
        }finally {
            System.err.println("Try catch finished" );
        }
    }
}
