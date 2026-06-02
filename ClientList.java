import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ClientList {
    public static final double CONSTANT = 0.5;// 50 процентов вероятности

    public static void main(String[] args) {
        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Aleksandra", "Ruslana", "Olesya", "Vika");
        Queue<String> thisClients = new LinkedList<>(firstClients);
        System.out.println("Начинаем прием клиентов");
        while (!thisClients.isEmpty()) {
            // вынимаем клиента из очереди
            String currentClient = thisClients.poll();
            System.out.println(currentClient + " сделала новый маникюр");

            if (Math.random() < CONSTANT) {
                String newFriend = "a friend of " + currentClient;
                thisClients.offer(newFriend);
                System.out.println("  → " + currentClient + " привела друга: " + newFriend);
            }
            else {
                System.out.println("  → " + currentClient + " не привела друга.");
            }
            System.out.println();

        }
        System.out.println("Все клиенты обслужены, очередь пуста");
    }
}