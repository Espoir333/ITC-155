import java.awt.*;

public class Exercise1 {
	public static void main(String[] args) {
		
		DrawingPanel p = new DrawingPanel(220,150);
		Graphics g = p.getGraphics();
		
		p.setBackground(Color.YELLOW);
		
		g.setColor(Color.BLUE);
		g.fillOval(50, 25, 40, 40);
		g.fillOval(130, 25, 40, 40);
		
		g.setColor(Color.RED);
		g.fillRect(70, 45, 80, 80);
		
		g.setColor(Color.BLACK);
		g.drawLine(70, 85, 149, 85);
	}
}
