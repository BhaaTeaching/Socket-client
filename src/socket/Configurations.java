package socket;

import java.io.IOException;
import java.net.Socket;

public class Configurations {
    public static Socket openSocket() throws IOException {
        try {
            // Connect to a server running on localhost:1234
            Socket socket = new Socket("localhost", 1234);
            System.out.println("Connected to server");

            // Do something with the socket here...
            // Get the output stream of the socket
            return socket;
            // socket.close(); // Close the socket when done
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        }
    }
}
