public class Casting {
    public static void main(String[] args) {

        //In a year locate 30 dogs
        //Per month

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //Estimation
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //Accuracy
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);

        double c = (double) a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;
        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);
    }
}
