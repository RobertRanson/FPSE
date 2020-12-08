import java.util.Random;

public class Singleton{

    //static variable to hold the one instance
    private static Singleton uniqueInstance;
    
    //Other useful instance variables
    private static int id;

    //Constructor is private so only class can instanciate
    private Singleton(){
        Random ran = new Random();
        id = ran.nextInt(100) + 1;
    }

    //getInstance() method instanciates the class and returns it
    public static Singleton getInstance() {
        if (uniqueInstance==null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    //Other usefull methods
    public int getId() {
        return id;
        
    }
    public void setId(int id){
        Singleton.id = id;
    }

    public static void main(String[] args) {
        Singleton mySingleton = Singleton.getInstance();
        Singleton mySingleton2 = Singleton.getInstance();
        System.out.println(mySingleton.getId());
        System.out.println(mySingleton2.getId());
        mySingleton.setId(2);
        System.out.println(mySingleton.getId());
        System.out.println(mySingleton2.getId());

        
    }
}