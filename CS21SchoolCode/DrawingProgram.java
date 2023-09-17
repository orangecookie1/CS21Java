import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

	public class DrawingProgram extends JPanel implements KeyListener{
	JFrame frame;

		public DrawingProgram(){
			frame = new JFrame("My Fabulous Painting");
			frame.add(this);
			frame.setSize(1200, 200);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			frame.addKeyListener(this);

			frame.setVisible(true);
		}

		public void paintComponent(Graphics g){
		super.paintComponent(g);

		for(int o = 0; o < 100; o++){
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);

			int x = (int)(Math.random() * 1100) + 50;
			int y = (int)(Math.random() * 700) + 50;

			int l = (int)(Math.random() * 190) + 10;
			int w = (int)(Math.random() * 190) + 10;

			//g.setColor(Color.blue);
			g.setColor(new Color(red, green, blue));

			g.fillRect(x, y, l, w);
		}


		//g.fillRect(100, 700, 100, 100);
		//g.fillRect(300, 700, 100, 100);
		//g.fillRect(200, 300, 100, 400);

		g.setFont(new Font("Vladimir Script Regular", Font.BOLD, 40));
		g.drawString("My Drawing", 100, 50);
		}

		public void keyPressed(KeyEvent e){
				repaint();
			}
		public void keyReleased(KeyEvent e){

			}
		public void keyTyped(KeyEvent e){

			}



	public static void main(String[] args){
		DrawingProgram app = new DrawingProgram();
		}
}

