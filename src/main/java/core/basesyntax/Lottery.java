package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final Ball ball = new Ball();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public String getRandomBall() {
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(100));
        System.out.println(ball.toString());
        return ball.toString();
    }
}

