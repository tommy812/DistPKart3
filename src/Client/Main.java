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
    static int nLaps=1;


    public static void main(String[] args) {
        Frame frame = new Frame(ipAddress,nLaps);
        frame.setVisible(true);

    }
}