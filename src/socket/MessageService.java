package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MessageService {
    public static void sendMessage(Socket socket, String message) throws IOException {
        OutputStream outputStream = socket.getOutputStream();
        // Send a message to the server
        outputStream.write(message.getBytes());
    }

    public static void receiveMessage(Socket socket) throws IOException {
        // Get the input stream of the socket
        InputStream inputStream = socket.getInputStream();
        // Receive a response from the server
        byte[] buffer = new byte[1024];
        int bytesRead = inputStream.read(buffer);
        String response = new String(buffer, 0, bytesRead);
        System.out.println("Server response: " + response);
    }
}
