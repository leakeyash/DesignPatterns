package singleton;

public class SampleSingleton {
    private static SampleSingleton instance;

    private SampleSingleton()
    {

    }

    public static SampleSingleton getInstance()
    {
        if(instance==null){
            return new SampleSingleton();
        }
        return instance;
    }
}
