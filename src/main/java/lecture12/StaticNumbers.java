package lecture12;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class StaticNumbers {

    private static int currentValue = 0;
    static int[] numArray = new int[10];
    private static final int NUMBER = 1;

    static {
        log.info("Running static initializing");
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (int) (100*Math.random());
        }
    }

    public StaticNumbers(){}

    public static int nextValue(){
        currentValue++;
        return currentValue;
    }

    void printArray(){
        for (int i = 0; i < numArray.length; i++) {
            log.info(numArray[i]+" ");
        }
    }


}
