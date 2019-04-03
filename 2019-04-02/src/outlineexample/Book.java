package outlineexample;

import java.awt.*;

public class Book {

	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(200,200);
		panel.setBackground(Color.WHITE);
		Graphics g = panel.getGraphics();

		g.setColor(Color.CYAN);
		g.fillRect(20, 35, 100, 100);
		
		g.setColor(Color.BLACK);
		g.drawString("BJP", 70, 55);
		
		g.setColor(new Color(191, 118, 73));
		for(int i = 0; i < 10; i++) {
			g.fillRect(20, 35+10*i, 10+20*i, 9);
		}
	}

}
