package Singleton;

public class LazySingleton {
    private static LazySingleton instace;

    private LazySingleton(){

    }

    private static LazySingleton getInstance(){
        if(instace == null){
            instace = new LazySingleton();
            
        }
        return instace;
    }
}
