
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Polygon implements Sprite {

    private int[] pointX;
    private int[] pointY;
    private int pointNum;
    private int width;
    private int height;
    private Color color;

    public Polygon(int[] pointX, int[] pointY, int pointNum, Color color) {
        this.pointNum = pointNum;
        this.pointX = pointX;
        this.pointY = pointY;
        this.color = color;
        int leftX = pointX[0];
        int topY = pointY[0];
        for (int i = 1; i < pointNum; i++) {
            leftX = Integer.min(leftX, pointX[i]);
            topY = Integer.min(topY, pointY[i]);
        }
        for (int i = 0; i < pointNum; i++) {
            pointX[i] -= leftX;
            pointY[i] -= topY;
        }
        int rightX = pointX[0];
        int downY = pointY[0];
        for (int i = 1; i < pointNum; i++) {
            rightX = Integer.max(rightX, pointX[i]);
            downY = Integer.max(downY, pointY[i]);
        }
        this.width = rightX;
        this.height = downY;
    }

    public void draw(Graphics surface, int leftX, int topY) {
        int[] x = new int[pointNum];
        int[] y = new int[pointNum];
        for (int i = 0; i < pointNum; i++) {
            x[i] = pointX[i] + leftX;
            y[i] = pointY[i] + topY;
        }
        surface.setColor(color);
        surface.fillPolygon(x, y, pointNum);
        surface.setColor(Color.BLACK);
        ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
        surface.drawPolygon(x, y, pointNum);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
