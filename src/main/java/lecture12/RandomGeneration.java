package lecture12;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j

public class RandomGeneration {

    private static final String CAPITAL_LETTERS = "QWERTYUIOP";
    private static final String SMALL_LETTER = "qwertyuiop";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&";

    Random random = new Random();

    public void toto5From35(){

        for (int num = 1; num <= 5; num++) {
            int randomNumber = random.nextInt(35)+1;
            log.info("Number is " + randomNumber);
        }
    }

    //from 10 to 50
    public void randomNumberRange(int min, int max){
        int number = random.nextInt(max - min) + min;
        log.info("Number between range is " + number);
    }

    public String generateRandomId(int length){
        char[] uniqueId = new char[length];
        String characters = "0123456789sdfgkjft";

        for (int i = 0; i < length; i++) {
            uniqueId[i] = characters.toCharArray()[random.nextInt(18)];
        }

        log.info("Generated random number is: " + new String(uniqueId));
        return new String(uniqueId);
    }

    public void generateRandomPassword(){
        StringBuilder password = new StringBuilder();

        //Generate 2 random capital letters
        for (int i = 1; i <= 2; i++) {
            char generatedChar = generateChar(CAPITAL_LETTERS);
            insertRandomPosition(password, generatedChar);
        }

        //Generate 2 random small letters
        for (int i = 1; i <= 2; i++) {
            char generatedChar = generateChar(SMALL_LETTER);
            insertRandomPosition(password, generatedChar);
        }

        //Generate 2 random digits
        for (int i = 1; i <= 2; i++) {
            char generatedChar = generateChar(DIGITS);
            insertRandomPosition(password, generatedChar);
        }

        //Generate 2 random special characters
        for (int i = 1; i <= 2; i++) {
            char generatedChar = generateChar(SPECIAL_CHARACTERS);
            insertRandomPosition(password, generatedChar);
        }

        log.info("Generated password is: " + password);
    }

    private char generateChar(String availableChars){
        int randomIndex = random.nextInt(availableChars.length());
        return availableChars.charAt(randomIndex);
    }

    private void insertRandomPosition (StringBuilder password, char character){
        int randomPosition = random.nextInt(password.length() + 1);
//        password.append(character); // no randomness
        password.insert(randomPosition, character); //randomness
    }
}
