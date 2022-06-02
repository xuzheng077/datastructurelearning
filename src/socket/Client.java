package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author Xu Zheng
 * @description
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 8888);
        InputStream inputStream = s.getInputStream();
        InputStreamReader reader = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(reader);
        String line = br.readLine();
        System.out.println(line);
        s.close();
    }
}
