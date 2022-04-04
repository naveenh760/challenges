package previous;

public class Singleton_SubEx {
    private static Singleton_SubEx instance;
    private Singleton_SubEx(){
        System.out.println("object created");
    }

    synchronized public static Singleton_SubEx getInstance(){
        if(instance == null){
            instance = new Singleton_SubEx();
        }
        return instance;
    }

    public static void  main(String[] args){
        Singleton_SubEx.getInstance();
        Singleton_SubEx.getInstance();
    }


}
