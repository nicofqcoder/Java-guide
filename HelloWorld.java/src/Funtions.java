public class Funtions {

    public static void main(String[] args) {
        double y = 3;

        circleArea(y);

        sphereArea(y);

        sphereVolume(y);

        double quantity;
            String currency;

        System.out.println("Peso to dollars: " + converToDolar(quantity = 200, currency = "MXN"));
    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolume(double r){
        return 4 * Math.PI * Math.pow(r,3);
    }

    public static double converToDolar(double quantity, String currency){
        switch (currency){
            case "MXN":
                quantity = quantity * 0.050;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }

        return quantity;
    }
}
