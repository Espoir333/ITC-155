import java.awt.*;

public class book {

	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(450,180);
		panel.setBackground(Color.WHITE);
		Graphics g = panel.getGraphics();
		
		drawBook(g,20,35,25);
		drawBook(g,150,70,30);
		drawBook(g,300,10,20);
		}

	
	public static void drawBook(Graphics g, int x, int y, int size) {
		g.setColor(Color.CYAN);
		g.fillRect(x, y, size, size);
		
		g.setColor(Color.BLACK);
		g.drawString("BJP", x+size/2, y+size/5);
		
		g.setColor(new Color(191, 118, 73));
		for(int i = 0; i < 10; i++) {
			g.fillRect(x, y+size/10*i, size/10*(i+1), size/10-1);
		}
	}
}