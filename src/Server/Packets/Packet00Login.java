package Server.Packets;

import Server.GameClient;
import Server.GameServer;
///////////////////////////////////////////
//
//  Sid: 1955004
//
///////////////////////////////////////////

public class Packet00Login extends Packet{
    private int pNum;
    private int x,y;

    //Receive player number from the server
    public Packet00Login(byte[] data){
        super(00);

        String[] dataArray = readData(data).split(",");
        this.pNum = Integer.parseInt(dataArray[0]);
        this.x = Integer.parseInt(dataArray[1]);
        this.y = Integer.parseInt(dataArray[2]);
    }
    //send player number from the server
    public Packet00Login(int pNum, int x, int y){
        super(00);
        this.pNum = pNum;
        this.x = x;
        this.y = y;
    }
    public Packet00Login(){
        super(00);
    }

    //TODO consider to use username or if the pnum can be done on the server or if the user shall choose
    @Override
    public void writeData(GameClient client) {
        client.sendData(getData());
    }

    @Override
    public void writeData(GameServer server) {
        server.sendDataToAllClients(getData());
    }

    @Override
    public byte[] getData() {
        return ("00"+this.pNum + "," + getX() + "," + getY()).getBytes();
    }

    public int getpNum(){
        return pNum;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
