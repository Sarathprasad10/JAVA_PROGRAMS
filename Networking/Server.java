import java.io.*;
import java.util.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        ServerSocket ss;
        Socket as;
        DataInputStream sin;
        DataOutputStream sout;
        Scanner s = new Scanner(System.in);
        try {
            ss = new ServerSocket(1234);
            as = ss.accept();
            System.out.println("welcome client ..");
            sin = new DataInputStream(as.getInputStream());
            sout = new DataOutputStream(as.getOutputStream());
            String received;
            String send;
            while (true) {
                received = sin.readUTF();
                System.out.println("client says " + received);
                if (received.equals("quit")) {
                    System.out.println("client is closing");
                    break;
                }
                System.out.println("Server ");
                send = s.nextLine();
                sout.writeUTF(send);
                if (send.equals("quit")) {
                    System.out.println("server is stopping");
                    break;
                }
            }
            sin.close();
            sout.close();
            as.close();
            ss.close();
            s.close(); // Closing Scanner here
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
