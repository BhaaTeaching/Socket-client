import socket.Configurations;
import socket.MessageService;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Socket socket = Configurations.openSocket();
        while (true) {
            System.out.println("Enter you name: ");
            Scanner scanner = new Scanner(System.in);
            String message = scanner.nextLine();
            MessageService.sendMessage(socket, message);
            MessageService.receiveMessage(socket);
        }
    }
}