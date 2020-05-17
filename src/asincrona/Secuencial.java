package asincrona;

public class Secuencial {
    public static void main(String[] args) {
        // TODO code application logic here
        tarea1();
        tarea2();
        tarea3();
    }
    public static void tarea1(){
        for (int i = 0; i < 2; i++){
            System.out.println("Tarea a " + i);
        }
    }
    public static void tarea2(){
        for (int i = 0; i < 2; i++){
            System.out.println("Tarea b " + i);
        }
    }
    public static void tarea3(){
        for (int i = 0; i < 2; i++){
            System.out.println("Tarea c " + i);
        }
    }
}
