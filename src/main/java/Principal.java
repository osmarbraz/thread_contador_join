
/**
 * Programa principal.
 *
 * @author osmar
 */
public class Principal {

    public static void main(String args[]) {

        Runnable r1 = new Contador("t1", 100);
        Runnable r2 = new Contador("t2", 200);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        
        t1.start();
        t2.start();

        // Aguarda a conclusão de todas as Threads
        try {
            t1.join();
            t2.join();
            System.out.println("Todas as threads terminaram!");

        } catch (InterruptedException ie) {
            System.out.println("Exececao:" + ie.getMessage());
        }
    }
}
