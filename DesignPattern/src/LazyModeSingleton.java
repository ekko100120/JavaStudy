
public class LazyModeSingleton {

    private static LazyModeSingleton lazyModeSingleton =null;
    private LazyModeSingleton(){

    }
    public LazyModeSingleton getInstance(){
        if (lazyModeSingleton==null){
            lazyModeSingleton = new LazyModeSingleton();
        }
        return  lazyModeSingleton;
    }

}
