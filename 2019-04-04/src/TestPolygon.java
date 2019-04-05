import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class TestPolygon{

	public static void main(String[] args) {
		
		DrawingPanel p = new DrawingPanel(1000,1000);
		Graphics g = p.getGraphics();
		
		Triangle(g, 50, 50, 10);
		Triangle(g, 90, 200, 50);
		Triangle(g, 500, 500, 200);
		Triangle(g, 900, 900, 30);
	}
	
	public static void Triangle(Graphics g, int x, int y, int size) {
		g.setColor(Color.BLUE);
		Polygon poly = new Polygon();
		poly.addPoint(x-size,y+size);
		poly.addPoint(x,y-size);
		poly.addPoint(x+size,y+size);
		g.fillPolygon(poly);
	}

}
