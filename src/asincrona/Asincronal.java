package asincrona;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Asincronal {
    public static void main(String[] args) {
        // TODO code application logic here
        ExecutorService exec1 = Executors.newSingleThreadExecutor();
        exec1.submit (()-> {
            tarea1();
            exec1.shutdown();
        });
        ExecutorService exec2 = Executors.newSingleThreadExecutor();
        exec2.submit (()-> {
            tarea2();
            exec2.shutdown();
        });
        ExecutorService exec3 = Executors.newSingleThreadExecutor();
        exec3.submit (()-> {
            tarea3();
            exec3.shutdown();
        });
    }
    public static void tarea1(){
        for (int i = 0; i < 15; i++){
            System.out.println("Tarea a " + i);
        }
    }
    public static void tarea2(){
        for (int i = 0; i < 15; i++){
            System.out.println("Tarea b " + i);
        }
    }
    public static void tarea3(){
        for (int i = 0; i < 15; i++){
            System.out.println("Tarea c " + i);
        }
    }
}
