package hilos;

public class StarVSRun {

    public static void main(String[] args) {

        Runnable tarea = () ->
                System.out.println("Ejecutando en: "
                        + Thread.currentThread().getName());

        Thread t = new Thread(tarea);

        t.run();
        t.start();
    }
}

