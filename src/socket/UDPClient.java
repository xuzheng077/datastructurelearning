package socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author Xu Zheng
 * @description
 */
public class UDPClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(9998);
        String str = "abcdddddd";
        DatagramPacket dp = new DatagramPacket(str.getBytes(),0,str.length(), InetAddress.getByName("localhost"),9999);
        ds.send(dp);
        ds.close();
    }
}
