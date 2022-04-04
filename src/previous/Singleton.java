package previous;

public class Singleton {
    private static Singleton instance;
    private static Object lock;
    private Singleton(){

    }

    public static Singleton getInstance(){
       synchronized (lock) {
           if (instance == null) {
               instance = new Singleton();
           }
       }
        return instance;
    }

    public static void main(String[] args){

    }



}
