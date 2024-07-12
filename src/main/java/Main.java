import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String host = "netology.homework";
        int port = 8089;

        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            Scanner scanner = new Scanner(System.in);

            String resp1 = in.readLine();
            String resp2 = in.readLine();
            System.out.println(resp1);
            System.out.println(resp2);

            String number = scanner.nextLine();// 1 - Спрашиваем у клиента за каким столиком он будет размещаться
            out.println(number);

            String numberTable = in.readLine(); // 2 - Даем ответ можно ли сесть за этот столик
            System.out.println(numberTable);

            String resp3 = in.readLine(); // 3 - Узнаем нужно ли детское меню
            System.out.println(resp3);

            String answer = scanner.nextLine();// 4 - Даем ответ на счет детского меню
            out.println(answer);

            String resp4 = in.readLine(); // 5 - Выводим ответ нужно ли детское меню
            System.out.println(resp4);

            String juice = in.readLine(); // 6 - Спрашиваем нужент ли сок
            System.out.println(juice);

            String juice2 = scanner.nextLine();// 7 - Даем ответ на счет сока
            out.println(juice2);

            String resp5 = in.readLine(); // 5 - Выводим ответ на счет сока
            System.out.println(resp5);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}