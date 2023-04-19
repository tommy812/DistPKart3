package Client;

///////////////////////////////////////////
//
//  Sid: 1955004
//
///////////////////////////////////////////

import java.net.InetAddress;

public class CarMP extends Car{
    public InetAddress ipAddress;
    public int socketPort;
    //multiplayer car class
    public CarMP(int PNum,InetAddress ipAddress, int socketPort) {
        super(PNum);
        this.ipAddress=ipAddress;
        this.socketPort = socketPort;
    }
}
