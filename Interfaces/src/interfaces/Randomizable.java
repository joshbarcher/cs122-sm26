package interfaces;

//this is a contract for classes to follow
public interface Randomizable {
    //a randomizable object should be able to change state
    void randomize();

    //a randomizable object should be able to report state
    String getState();
}
