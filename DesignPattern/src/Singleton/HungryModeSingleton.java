package Singleton;

public class HungryModeSingleton {
    private static HungryModeSingleton hungryModeSingleton = new HungryModeSingleton();
    private HungryModeSingleton(){

    }

    public static HungryModeSingleton getInstance(){
        return hungryModeSingleton;
    }

}
