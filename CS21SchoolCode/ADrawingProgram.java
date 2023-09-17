import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

	public class ADrawingProgram extends JPanel implements KeyListener{
	JFrame frame;

		public ADrawingProgram(){
			frame = new JFrame("My Fabulous Painting");
			frame.add(this);
			frame.setSize(1200, 200);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			frame.addKeyListener(this);

			frame.setVisible(true);
		}

		public void paintComponent(Graphics g){
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D)g;

		//for(int o = 0; o < 100; o++){
			//int red = (int)(Math.random() * 256);
			//int green = (int)(Math.random() * 256);
			//int blue = (int)(Math.random() * 256);

			//int x = (int)(Math.random() * 1100) + 50;
			//int y = (int)(Math.random() * 700) + 50;

			//int l = (int)(Math.random() * 190) + 10;
			//int w = (int)(Math.random() * 190) + 10;

			//g.setColor(Color.blue);
			//g.setColor(new Color(red, green, blue));
			//g.fillRect(100, 700, 100, 100);
		//g.fillRect(300, 700, 100, 100);
		//g.fillRect(200, 300, 100, 400);

		//g.setFont(new Font("Vladimir Script Regular", Font.BOLD, 40));
		//g.drawString("My Drawing", 100, 50);


			//g.setColor(Color.blue);
			g2.setPaint(new GradientPaint(0,0, new Color(245, 125, 0), frame.getWidth(), frame.getHeight(), new Color(125, 0, 225)));

			g.fillRect(0, 0, frame.getWidth(), frame.getHeight());

			g.setColor(new Color(0,0,0));
			//g.drawOval(100, 100, 100, 100);
			//g2.setStroke(new BasicStroke(5));
			int circleSize = 20;

			int startX = 0;
			int startY = 0;
			int endX = frame.getWidth()/circleSize;
			int endY = frame.getWidth()/circleSize;

			//while(true)
			{
				for(int x = startX; x < endX; x++){
					g.fillOval(x*circleSize,startY, circleSize, circleSize);
					}
				startY++;
			}

				for(int y = startY; y < endY; y++){
					g.fillOval((endX*circleSize)-circleSize,circleSize*y, circleSize, circleSize);
				}
				startY++;








			/*
			int centX = frame.getWidth()/2-17;
			int centY = frame.getHeight()/2-17;
			int y = 0;
			int x = 0;
			int xy = 0;

			for(y = 0; y < frame.getWidth()/circleSize/2; y++){
				g.setColor(new Color(120, 0, 255));
				g.fillOval(centX, centY-y*circleSize, circleSize, circleSize);
					}

			for(y = 0; y < frame.getWidth()/circleSize/2;y++){
				g.setColor(new Color(120, 0, 255));
				g.fillOval(centX, centY+y*circleSize, circleSize, circleSize);
					}

			for(x = 0; x < frame.getWidth()/circleSize/2;x++){
				g.setColor(new Color(120, 0, 255));
				g.fillOval(centX+x*circleSize, centY, circleSize, circleSize);
					}

			for(x = 0; x < frame.getWidth()/circleSize/2;x++){
				g.setColor(new Color(120, 0, 255));
				g.fillOval(centX-x*circleSize, centY, circleSize, circleSize);
					}

			for(xy = 0; xy < frame.getWidth()/circleSize/2;xy++){
				g.setColor(new Color(120, 0, 255));
				g.fillOval(centX+xy*circleSize, centY+xy*circleSize, circleSize, circleSize);
					}

			for(xy = 0; xy < frame.getWidth()/circleSize/2; xy++){
				g.setColor(new Color(120, 0, 255));
				g.fillOval(centX-xy*circleSize, centY-xy*circleSize, circleSize, circleSize);
					}

			for(xy = 0; xy < frame.getWidth()/circleSize/2;xy++){
				g.setColor(new Color(120, 0, 255));
				g.fillOval(centX-xy*circleSize, centY+xy*circleSize, circleSize, circleSize);
					}

			for(xy = 0; xy < frame.getWidth()/circleSize/2; xy++){
				g.setColor(new Color(120, 0, 255));
				g.fillOval(centX+xy*circleSize, centY-xy*circleSize, circleSize, circleSize);
					}
		*/

		/*
			int x = 0;
			int y = 0;

			for(int a = 0; a < frame.getWidth()/50; a++){
			g.setColor(Color.BLACK);
			g.fillOval(x, 0, 50, 50);

			for(int b = 0; b < 1; b++){
				g.setColor(Color.BLACK);
				g.fillOval(x, 800, 50, 50);
				x = x + 50;
					}
			}

			for(int c = 0; c < frame.getHeight()/50; c++){
			g.setColor(Color.BLACK);
			g.fillOval(0, y, 50, 50);

			for(int d = 0; d < 1; d++)
				g.setColor(Color.BLACK);
				g.fillOval(1550, y, 50, 50);
				y = y + 50;
					}
					*/
			}


		public void keyPressed(KeyEvent e){
				repaint();
			}
		public void keyReleased(KeyEvent e){

			}
		public void keyTyped(KeyEvent e){

			}



	public static void main(String[] args){
		ADrawingProgram app = new ADrawingProgram();
		}
}

