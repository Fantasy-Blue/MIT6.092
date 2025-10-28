
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {

    // Bouncer movingSprite;
    ArrayList<Mover> movingSprites;

    /**
     * Initializes this class for drawing.
     */
    public DrawGraphics() {
        movingSprites = new ArrayList<>();
        Rectangle box = new Rectangle(15, 20, Color.RED);
        Bouncer movingSprite1 = new Bouncer(100, 170, box);
        movingSprite1.setMovementVector(3, 1);
        movingSprites.add(movingSprite1);

        int[] x = {10, 0, -10, 0};
        int[] y = {0, -10, 0, 10};
        Polygon polygon = new Polygon(x, y, 4, Color.BLUE);
        Bouncer movingSprite2 = new Bouncer(200, 100, polygon);
        movingSprite2.setMovementVector(1, -3);
        movingSprites.add(movingSprite2);

        Rectangle box2 = new Rectangle(15, 20, Color.GREEN);
        StraightMover movingSprite3 = new StraightMover(0, 0, box2);
        movingSprite3.setMovementVector(1, 1);
        movingSprites.add(movingSprite3);

        int[] x2 = {10, 0, -10, 0};
        int[] y2 = {0, -20, 0, 10};
        Polygon polygon2 = new Polygon(x2, y2, 4, Color.YELLOW);
        StraightMover movingSprite4 = new StraightMover(30, 270, polygon2);
        movingSprite4.setMovementVector(1, -1);
        movingSprites.add(movingSprite4);
    }

    /**
     * Draw the contents of the window on surface.
     */
    public void draw(Graphics surface) {
        for (Mover movingSprite : movingSprites) {
            movingSprite.draw(surface);
        }
    }
}
