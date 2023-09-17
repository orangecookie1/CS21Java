import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Twenty48 extends JPanel implements KeyListener{
	int[][] board = new int[4][4];
	int score = 0;
	JFrame frame;
	public Twenty48(){
		frame = new JFrame("2048 - The Game");
		frame.add(this);
		frame.setSize(600,600);
		frame.addKeyListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		placeTwo();
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//g.setFont();
		g.setColor(Color.BLACK);
		g.fillRect(0,0,frame.getWidth(),frame.getHeight());
		g.setColor(Color.GREEN);
		g.drawString("Score: " + score, 50,50);
		for(int x = 0; x < 4; x++){
			for(int y = 0; y < 4; y++){
				g.drawRect((x*100)+frame.getWidth()/7,(y*100)+frame.getHeight()/7,100,100);
			}
		}

		for(int r = 0; r < 4; r++){
			for(int c = 0; c < 4; c++){
				if(board[r][c] != 0)
					g.drawString("" + board[r][c],(c*100) + 130,(r*100)+140);
			}
		}

		if(!canMove()){
			g.drawString("You lost! D: D: D: D:",400,400);
			score = 0;
		}
	}

	public void placeTwo(){
		int r = 0;
		int c = 0;
		if(notFull()){
		do{
			r = (int)(Math.random() * 4);
			c = (int)(Math.random() * 4);
		}while(board[r][c] != 0);
			board[r][c] = 2;
		}
	}

		public void keyPressed(KeyEvent e){
			System.out.print(e.getKeyCode());
			//left

			switch(e.getKeyCode()){
				case 37:
					for(int r = 0; r < 4; r++){
						for(int c = 0; c < 4; c++){
							int x = c;
							while(x > 0 && board[r][x - 1] == 0 && board[r][x] != 0){
								board[r][x-1] = board[r][x];
								board[r][x] = 0;
								x--;
							}

							if(x > 0 && board[r][x] == board[r][x-1]){
								board[r][x-1] = board[r][x]*2;
								score += board[r][x]*2;
								board[r][x] = 0;
							}
						}
					}
					break;
				//up
				case 38:
					for(int r = 0; r < 4; r++){
						for(int c = 0; c < 4; c++){
							int x = r;
							while(x > 0 && board[x - 1][c] == 0 && board[x][c] != 0){
								board[x-1][c] = board[x][c];
								board[x][c] = 0;
								x--;
							}

							if(x > 0 && board[x][c] == board[x-1][c]){
								board[x-1][c] = board[x][c]*2;
								score += board[x][c]*2;
								board[x][c] = 0;
							}
						}
					}
					break;
				//right
				case 39:
					for(int r = 0; r < 4; r++){
						for(int c = 0; c < 4; c++){
							int x = c;
							while(x < 3 && board[r][x+1] == 0 && board[r][x] != 0){
								board[r][x+1] = board[r][x];
								board[r][x] = 0;
								x++;
							}

							if(x < 3 && board[r][x] == board[r][x+1]){
								board[r][x+1] = board[r][x]*2;
								score += board[r][x]*2;
								board[r][x] = 0;
							}
						}
					}
					break;
				//down
				case 40:
					for(int r = 0; r < 4; r++){
						for(int c = 0; c < 4; c++){
							int x = r;
							while(x < 3 && board[x+1][c] == 0 && board[x][c] != 0){
								board[x+1][c] = board[x][c];
								board[x][c] = 0;
								x++;
							}

							if(x < 3 && board[x][c] == board[x+1][c]){
								board[x+1][c] = board[x][c]*2;
								score += board[x][c]*2;
								board[x][c] = 0;
							}
						}
					}

					break;
				}
				placeTwo();
				repaint();
			}

		public boolean canMove(){
			for(int r = 0; r < 4; r++){
				for(int c = 0; c < 3; c++){
					if(board[r][c] == board[r][c] || board[r][c] == 0)
						return true;
				}
			}
			return false;
		}

		public boolean notFull(){
			for(int r = 0; r < 4; r++){
				for(int c = 0; c < 4; c++){
					if(board[r][c] == 0)
						return true;
				}
			}
			return false;
		}
	public static void main(String[] args){
		Twenty48 app = new Twenty48();
	}

	public void keyReleased(KeyEvent e){}
	public void keyTyped(KeyEvent e){}
}