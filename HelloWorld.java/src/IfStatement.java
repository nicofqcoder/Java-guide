public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if(isBluetoothEnabled){
            //Send file
            fileSended++;
            System.out.println("File sent");
            int i = 0;
            i++;
        } else {
            System.out.println("Please turn on your Bluetooth to start the transfer");
        }
        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);
    }
}
