import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Socket socket = new Socket("127.0.0.1", 8000); //подключаемся к серверу
            BufferedWriter bufferedWriter = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream())
            );
            String str = scanner.nextLine();
            bufferedWriter.write(str);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            BufferedReader buffedReader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            System.out.println(buffedReader.readLine());
        }

    }
}

