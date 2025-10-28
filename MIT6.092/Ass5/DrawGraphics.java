
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {

    BouncingBox box;
    ArrayList<BouncingBox> boxs;

    /**
     * Initializes this class for drawing.
     */
    public DrawGraphics() {
        box = new BouncingBox(200, 50, Color.RED);
        box.setMovementVector(-1, 1);
        boxs = new ArrayList<>();
        boxs.add(new BouncingBox(150, 150, Color.BLUE));
        boxs.add(new BouncingBox(150, 150, Color.GREEN));
        boxs.add(new BouncingBox(150, 150, Color.RED));
        boxs.get(0).setMovementVector(1, 1);
        boxs.get(1).setMovementVector(-1, 3);
        boxs.get(2).setMovementVector(-1, -2);
    }

    /**
     * Draw the contents of the window on surface. Called 20 times per second.
     */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        // box.draw(surface);
        for (BouncingBox perbox : boxs) {
            perbox.draw(surface);
        }
        // surface.drawRect(50, 100, 200, 100);
        // surface.drawArc(50, 100, 200, 100, 0, 360);
        surface.drawOval(50, 100, 200, 100);
        int[] polygonX = {100, 250, 200, 50};
        int[] polygonY = {50, 100, 250, 200};
        surface.drawPolygon(polygonX, polygonY, 4);
    }
}
