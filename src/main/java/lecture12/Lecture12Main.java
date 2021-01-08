package lecture12;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class Lecture12Main {

    public static void main(String[] args) {
//        log.info("Number with static call {}", StaticNumbers.nextValue());
//        log.info("First object");
//        StaticNumbers obj1 = new StaticNumbers();
//        obj1.printArray();
//        log.info("Second object");
//        StaticNumbers obj2 = new StaticNumbers();
//        obj2.printArray();

//        MathOperations mathOperations = new MathOperations();
//        mathOperations.calculateFace(2,2,60);

        RandomGeneration randomGeneration = new RandomGeneration();
//        randomGeneration.toto5From35();
//        randomGeneration.randomNumberRange(10,50);
//        randomGeneration.generateRandomId(14);
        randomGeneration.generateRandomPassword();
    }
}
