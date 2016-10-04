package foo;

import java.util.Random;

public class SampleService {
    public void printRandomValue() {
        System.out.println("randomValue: " + new Random().nextDouble());
    }
}
