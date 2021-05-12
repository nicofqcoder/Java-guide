public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        //Assignment operators
        System.out.println("a equals b ? --> " + (a == b) );
        System.out.println("a is different from b ? --> " + ( a != b));

        //Relational operators
        System.out.println("a is greater than b ? --> " + (a > b));
        System.out.println("a is less than b ? --> " + (a < b));
        System.out.println("a is greater than or equal to b ? --> " + (a >= b));
        System.out.println("a is less than or equal to b ? --> " + (a <= b));

        if ( a==b ) {
            System.out.println("a equals b");
        }else if(a != b){
            System.out.println("a is different from b");
        }else if(a > b){
            System.out.println("a is greater than b");
        }else if(a < b){
            System.out.println("a is less than b");
        }else if(a >= b){
            System.out.println("a is greater than or equal to b");
        }else if(a <= b){
            System.out.println("a is less than or equal to b");
        }
    }
}
