package lecture12;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class MathOperations {

    public void calculateFace (double a, double b, int angle){
        double triangleFace = 0.5 * a * b * Math.sin(Math.toRadians(angle));
        log.info("Triangle face is: " + triangleFace);
    }
}
