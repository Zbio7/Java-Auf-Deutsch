package exer8;

import java.util.Random;

class RandomNumber2 {
    SecretRandomNumber rand;
    
    public RandomNumber() {
        rand = new SecretRandomNumber();
    }

    int giveNumber() {
        return rand.giveNumber();
    }
}
