import java.awt.*;

public class Animation {

	public static void main(String[] args) {
		
		DrawingPanel panel = new DrawingPanel(1000,1000);
		Graphics g = panel.getGraphics();
		
		g.setColor(Color.CYAN);
		for (int i = 1; i <= 1000; i++) {
			g.fillOval(-25+1*i, -25+1*i, 30, 30);
			panel.sleep(10);
		}

	}

}
