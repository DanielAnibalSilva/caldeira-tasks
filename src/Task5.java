public class Task5 {
    public static void main(String[] args) {
        int notificacoes = 0;

        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                notificacoes += 2;
            } else {
                notificacoes++;
            }
            System.out.println("NOTIFICACOES: " + notificacoes);
        }

        System.out.println("FINAL: " + notificacoes);
    }
}