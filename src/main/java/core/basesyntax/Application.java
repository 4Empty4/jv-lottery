package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Lottery lottery1 = new Lottery();
        Lottery lottery2 = new Lottery();

        lottery.getRandomBall();
        lottery1.getRandomBall();
        lottery2.getRandomBall();
        // create three balls using class Lottery and print information about them in console
    }

}
