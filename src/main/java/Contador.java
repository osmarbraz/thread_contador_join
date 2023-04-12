
public class Contador implements Runnable {

    private static int i = 0;
    private String nome;
    private int tempo;

    public Contador(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
    }

    private void conta() {
        i = i + 1;
        System.out.println("Contador e: " + i + ", atualizado por: " + nome);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            conta();
            try {
                Thread.sleep((long) (Math.random() * tempo));
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Terminei " + nome);
    }
}
