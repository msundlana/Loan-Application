public class UtilityA {

    public static void main(String [] s){
       double d = 10.0/-0;

       if(d == Double.POSITIVE_INFINITY){
           System.out.println("Positive");
       }else {
           System.out.println("Negative");
       }
    }
}
