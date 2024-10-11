package co.edu.cue.singletonadapter.Singleton;

public class ChurrosFactory {
    private static ChurrosFactory factory = null;
    private int ChurrosNumber;

    private ChurrosFactory(){}

    public static ChurrosFactory getFactory(){
        if(factory == null){
            factory = new ChurrosFactory();
        }
        return factory;
    }
    public void setChurrosNumber(int cn){
        ChurrosNumber = cn;
    }
    public int returnChurrosNumber(){
        return ChurrosNumber;
    }
}
