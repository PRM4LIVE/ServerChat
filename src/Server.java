import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);
        Scanner scanner = new Scanner(System.in);
        while (true){
            Socket socket = serverSocket.accept();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            System.out.println(in.readLine());
            BufferedWriter out = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream())
            );
            String str = scanner.nextLine();
            out.write(str);
            out.newLine();
            out.flush();

        }
    }
}


