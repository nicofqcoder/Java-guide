public class SwitchStatement {
    public static void main(String[] args) {

        String colorModeSelected = "1";

        switch (colorModeSelected){
            case "Light":
                System.out.println("Select Light Mode");
                break;
            case "Night":
                System.out.println("Select Night Mode");
                break;
            case "Blue Dark":
                System.out.println("Select Blue Dark Mode");
                break;
            case "Dark":
                System.out.println("Select Dark Mode");
                break;
                default:
                    System.out.println("Select an option");
        }

    }
}
