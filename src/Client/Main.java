package Client;

///////////////////////////////////////////
//
//  Sid: 1955004
//
///////////////////////////////////////////
//
//  Set ipAddress with "localhost" or preferred ipAddresses
//
///////////////////////////////////////////
public class Main {


    static String ipAddress = "0.0.0.0";


    public static void main(String[] args) {
        Frame frame = new Frame(ipAddress);
        frame.setVisible(true);

    }
}