package socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * @author Xu Zheng
 * @description
 */
public class Server {
    // single thread
//    public static void main(String[] args) throws IOException {
//        ServerSocket ss = new ServerSocket(8888);
//        Socket s = ss.accept();
//        OutputStream outputStream = s.getOutputStream();
//        PrintWriter pw = new PrintWriter(outputStream);
//        pw.println("now date: " + new Date());
//        pw.flush();
//        pw.close();
//        s.close();
//        ss.close();
//    }
    // multi thread
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket s = null;
        while ((s = ss.accept())!=null){
            new MyThread(s).start();
        }
        ss.close();
    }
}

class MyThread extends Thread {
    private Socket socket;

    public MyThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try{
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(outputStream);
            pw.write("now date: " + new Date());
            pw.flush();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}