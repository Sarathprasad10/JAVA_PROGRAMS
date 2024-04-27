import java.io.*;
import java.util.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        Socket cs;
        DataInputStream sin;
        DataOutputStream sout;
        Scanner s = new Scanner(System.in);
        try {
            cs = new Socket("localhost", 1234);
            System.out.println("Connected to the server ");
            sin = new DataInputStream(cs.getInputStream());
            sout = new DataOutputStream(cs.getOutputStream());
            String send;
            String received;
            while (true) {
                System.out.println("client ");
                send = s.nextLine();
                sout.writeUTF(send);
                if (send.equals("quit")) {
                    System.out.println("Client is closing");
                    break;
                }
                received = sin.readUTF();
                System.out.println("Server says: " + received);
                if (received.equals("quit")) {
                    System.out.println("server is stopping");
                    break;
                }
            }
            cs.close();
            sin.close();
            sout.close();
            s.close(); // Closing Scanner here
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
