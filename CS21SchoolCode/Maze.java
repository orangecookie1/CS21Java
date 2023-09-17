import javax.swing.*;import java.awt.*;import java.awt.event.*;import java.io.*;import java.awt.image.*;import javax.imageio.ImageIO;
public class Maze extends JPanel implements KeyListener{
	JFrame frame;
	String[][] maze = new String[25][];
	int[] monsterMove = {1,1,2,2};
	int dim = 20;int pRow = 7;int pCol = 7;int endRow, endCol;int startRow, startCol; int mazeCounter = 0; int bRow; int bCol; int count = 0; int yAdj = 500; int xAdj = 500; int keyCol = 0; int keyRow = 0; boolean keyPicked = false; boolean keyPicked2 = false;int keyCol2 = 0; int keyRow2 = 0; int dRow = 0; int dCol = 0; int mRow1 = 0; int mCol1 = 0; int mRow2 = 0; int mCol2 = 0; boolean gameOver = false; int monsterCounter = 0; int bRow2=0; int bCol2=0; boolean youWin = false;
	BufferedImage rightWalk, rightStand;

	public Maze(){
		frame = new JFrame("THE AMAZING Maze Game");frame.add(this);frame.setSize(1200,1200);frame.addKeyListener(this);frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try{
			rightWalk = ImageIO.read(new File("rightWalk.png"));
			rightStand = ImageIO.read(new File("rightStand.png"));
		}catch(IOException e){}

		rightWalk = resize(rightWalk, dim, dim);
		rightStand = resize(rightStand, dim,dim);

		createMaze("Maze1.txt");
		frame.setVisible(true);
	}

	public BufferedImage resize(BufferedImage image, int width, int height){
		Image temp = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		BufferedImage scaledVersion = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = scaledVersion.createGraphics();
		g2.drawImage(temp, 0, 0,null);
		g2.dispose();
		return scaledVersion;
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(new Color(128, 128, 128));
		g.fillRect(0,0,frame.getWidth(),frame.getHeight());
		g.setColor(Color.WHITE);

		for(int x = -13; x <=13; x++){
			for(int y =-13; y <=13; y++){
				try{
					if(maze[pRow+x][pCol+y].equals("*")){
						g.setColor(new Color(64, 64, 64));
						g.fillRect((y*dim) + xAdj,(x*dim) + yAdj, dim , dim);
						g.setColor(new Color(128, 128, 128));
						g.fillRect((y*dim) + xAdj + 5,(x*dim) + yAdj + 5, dim - 10, dim - 10);
					}
					if(maze[pRow+x][pCol+y].equals("E")){
						g.setColor(Color.PINK);
						g.fillRect((y*dim) + xAdj,(x*dim) + yAdj, dim, dim);
					}
					if(maze[pRow+x][pCol+y].equals("D")){
						g.setColor(new Color(120,51,0));
						g.fillRect((y*dim) + xAdj,(x*dim) + yAdj, dim, dim);
					}
					if(maze[pRow+x][pCol+y].equals("K")){
						g.setColor(Color.YELLOW);
						g.fillRect((y*dim) + xAdj,(x*dim) + yAdj, dim, dim);
					}
					if(maze[pRow+x][pCol+y].equals("d")){
						g.setColor(new Color(120,51,0));
						g.fillRect((y*dim) + xAdj,(x*dim) + yAdj, dim, dim);
					}
					if(maze[pRow+x][pCol+y].equals("M")){
						g.setColor(new Color(204,0,0));
						g.fillRect((y*dim) + xAdj,(x*dim) + yAdj, dim, dim);
					}
					if(maze[pRow+x][pCol+y].equals("m")){
						g.setColor(new Color(204,0,0));
						g.fillRect((y*dim) + xAdj,(x*dim) + yAdj, dim, dim);
					}
					if(maze[pRow+x][pCol+y].equals("k")){
						g.setColor(Color.YELLOW);
						g.fillRect((y*dim) + xAdj,(x*dim) + yAdj, dim, dim);
					}
					if(maze[pRow + x][pCol + y].equals("b")){
						g.setColor(new Color(120,51,0));
						g.fillRect((y*dim) + xAdj,(x*dim) + yAdj, dim, dim);
					}
					if(maze[pRow + x][pCol + y].equals("B")){
						g.setColor(new Color(120,51,0));
						g.fillRect((y*dim) + xAdj,(x*dim) + yAdj, dim, dim);
					}
				}catch(ArrayIndexOutOfBoundsException e)
				{}
			}
		}
		if(count%2 == 0)
			g.drawImage(rightStand, xAdj, yAdj, this);
		else g.drawImage(rightWalk, xAdj, yAdj, this);

		if(youWin){
				g.setColor(new Color(128, 128, 128));
				g.fillRect(0,0,frame.getWidth(),frame.getHeight());
				g.setFont(new Font("Vladimir Script Regular", Font.BOLD, 100));
				g.setColor(Color.WHITE);
				g.drawString("YOU WIN!!", 300,300);
		}
		if(gameOver){
				g.setColor(new Color(128, 128, 128));
				g.fillRect(0,0,frame.getWidth(),frame.getHeight());
				g.setFont(new Font("Vladimir Script Regular", Font.BOLD, 100));
				g.setColor(Color.WHITE);
				g.drawString("GAME OVER >:C", 300,300);
		}

	}

	public double distanceFormula(double x1, double x2, double y1, double y2){
		return Math.sqrt(Math.pow ((x1-x2), 2) + Math.pow((y1-y2), 2));
	}

	public void moveMonster(){
		if(pRow == mRow1 && pCol == mCol1 || pRow == mRow2 && pCol == mCol2){
			gameOver = true;
		}
		double left = distanceFormula(pRow, mRow1, pCol, mCol1 - 1);
		double up = distanceFormula(pRow, mRow1 - 1, pCol, mCol1);
		double right =  distanceFormula(pRow, mRow1, pCol, mCol1 + 1);
		double down = distanceFormula(pRow, mRow1 + 1, pCol, mCol1);
		double player = distanceFormula(pRow, mRow1, pCol, mCol1);

		//left
		if(up > left && right > left && down > left && maze[mRow1][mCol1 - 1].equals(" ")){
			maze[mRow1][mCol1] = " ";
			mCol1 -= 1;
			maze[mRow1][mCol1] = "M";
		}
		//up
		else if(left > up && right > up && down > up && maze[mRow1 - 1][mCol1].equals(" ")){
			maze[mRow1][mCol1] = " ";
			mRow1 -= 1;
			maze[mRow1][mCol1] = "M";
		}
		//right
		else if(left > right && up > right && down > right && maze[mRow1][mCol1 + 1].equals(" ")){
			maze[mRow1][mCol1] = " ";
			mCol1 += 1;
			maze[mRow1][mCol1] = "M";
		}
		//down
		else if(left > down && up > down && right > down && maze[mRow1 + 1][mCol1].equals(" ")){
			maze[mRow1][mCol1] = " ";
			mRow1 += 1;
			maze[mRow1][mCol1] = "M";
		}


		//left
		else if(player > left && maze[mRow1][mCol1 - 1].equals(" ")){
			maze[mRow1][mCol1] = " ";
			mCol1 -= 1;
			maze[mRow1][mCol1] = "M";
		}
		//up
		else if(player > up && maze[mRow1 - 1][mCol1].equals(" ")){
			maze[mRow1][mCol1] = " ";
			mRow1 -= 1;
			maze[mRow1][mCol1] = "M";
		}
		//right
		else if(player > right && maze[mRow1][mCol1 + 1].equals(" ")){
			maze[mRow1][mCol1] = " ";
			mCol1 += 1;
			maze[mRow1][mCol1] = "M";
		}
		//down
		else if(player > down && maze[mRow1 + 1][mCol1].equals(" ")){
			maze[mRow1][mCol1] = " ";
			mRow1 += 1;
			maze[mRow1][mCol1] = "M";
		}


		//left
		else if(maze[mRow1][mCol1 - 1].equals(" ")){
			maze[mRow1][mCol1] = " ";
			mCol1 -= 1;
			maze[mRow1][mCol1] = "M";
		}
		//up
		else if(maze[mRow1 - 1][mCol1].equals(" ")){
			maze[mRow1][mCol1] = " ";
			mRow1 -= 1;
			maze[mRow1][mCol1] = "M";
		}
		//right
		else if(maze[mRow1][mCol1 + 1].equals(" ")){
			maze[mRow1][mCol1] = " ";
			mCol1 += 1;
			maze[mRow1][mCol1] = "M";
		}
		//down
		else if(maze[mRow1 + 1][mCol1].equals(" ")){
			maze[mRow1][mCol1] = " ";
			mRow1 += 1;
			maze[mRow1][mCol1] = "M";
		}


		//MONSTER 2 AHAHHAHAHHAHHAH
		if(monsterMove[monsterCounter] == 1){
			maze[mRow2][mCol2] = " ";
			mCol2 += 1;
			maze[mRow2][mCol2] = "m";
		}else if(monsterMove[monsterCounter] == 2){
			maze[mRow2][mCol2] = " ";
			mCol2 -= 1;
			maze[mRow2][mCol2] = "m";
		}
		monsterCounter++;
		if(monsterCounter == 4){
			monsterCounter = 0;
		 }
		if(pRow == mRow1 && pCol == mCol1 || pRow == mRow2 && pCol == mCol2){
			gameOver = true;
		}
	}

	public void createMaze(String name){
		try{
			File file = new File(name);
			BufferedReader input = new BufferedReader(new FileReader(file));
			String st;
			int row =0;
			while((st = input.readLine()) != null){
				maze[row] = st.split("");
				for(int col=0;col<maze[row].length;col++)
				{
					if(maze[row][col].equals("S")){
						pRow=row;pCol=col;
					}
					if(maze[row][col].equals("E")){
						endRow=row;endCol=col;
					}
					if(maze[row][col].equals("K")){
						keyRow=row;keyCol=col;
					}
					if(maze[row][col].equals("k")){
						keyRow2=row;keyCol2=col;
					}
					if(maze[row][col].equals("D")){
						dRow=row;dCol=col;
					}
					if(maze[row][col].equals("M")){
						mRow1=row;mCol1=col;
					}
					if(maze[row][col].equals("m")){
						mRow2=row;mCol2=col;
					}
					if(maze[row][col].equals("B")){
						bRow2=row;bCol2=col;
					}
				}
				row++;
			}
		keyPicked = false;
		keyPicked2 = false;
		}
		catch(IOException e){}

		for(int r = 0; r < maze.length; r++){
			for(int c = 0; c < maze[0].length; c++){
				System.out.print(maze[r][c]);
			}
			System.out.println();
		}
	}

	public void keyPressed(KeyEvent e){
		if(gameOver != true){
			count++;
			switch(e.getKeyCode()){
					//left
					case 37:
						if(maze[pRow][pCol-1].equals(" ") || maze[pRow][pCol-1].equals("E") || maze[pRow][pCol-1].equals("K") || maze[pRow][pCol-1].equals("d") || maze[pRow][pCol-1].equals("M") || maze[pRow][pCol-1].equals("m") || maze[pRow][pCol-1].equals("b") || maze[pRow][pCol-1].equals("k")){
							maze[pRow][pCol] = " ";
							pCol = pCol-1;
							moveMonster();
						}
						break;
					//up
					case 38:
						if(maze[pRow-1][pCol].equals(" ") || maze[pRow-1][pCol].equals("E") || maze[pRow-1][pCol].equals("K") || maze[pRow-1][pCol].equals("d") || maze[pRow-1][pCol].equals("M") || maze[pRow-1][pCol].equals("m") || maze[pRow-1][pCol].equals("b") || maze[pRow-1][pCol].equals("k")){
							maze[pRow][pCol] = " ";
							pRow = pRow-1;
							moveMonster();
						}
						break;
					//right
					case 39:
						if(maze[pRow][pCol+1].equals(" ") || maze[pRow][pCol+1].equals("E") || maze[pRow][pCol+1].equals("K") || maze[pRow][pCol+1].equals("d") || maze[pRow][pCol+1].equals("M") || maze[pRow][pCol+1].equals("m") || maze[pRow][pCol+1].equals("b") || maze[pRow][pCol+1].equals("k")){
							maze[pRow][pCol] = " ";
							pCol = pCol+1;
							moveMonster();
						}
						break;
					//down
					case 40:
						if(maze[pRow + 1][pCol].equals(" ") || maze[pRow + 1][pCol].equals("E") || maze[pRow + 1][pCol].equals("K") || maze[pRow + 1][pCol].equals("d") || maze[pRow + 1][pCol].equals("m") || maze[pRow + 1][pCol].equals("M") || maze[pRow+1][pCol].equals("b") || maze[pRow+1][pCol].equals("k")){
							maze[pRow][pCol] = " ";
							pRow += 1;
							moveMonster();

						}
						break;
			}
			if(pRow == endRow && pCol == endCol && mazeCounter == 2){
				youWin = true;
			}
			if(pRow == endRow && pCol == endCol ){
				mazeCounter++;
				if(mazeCounter==1){
					createMaze("Maze2.txt");
				}
				else if(mazeCounter==2){
					createMaze("Maze3.txt");
				}
			}
			if(pRow == keyRow && pCol == keyCol){
				keyPicked = true;
			}
			if(pRow == keyRow2 && pCol == keyCol2){
				keyPicked2 = true;
			}
			if(pRow == mRow1 && pCol == mCol1 || pRow == mRow2 && pCol == mCol2){
				gameOver = true;
			}
			if(keyPicked){
				maze[dRow][dCol] = "d";
			}
			if(keyPicked2){
				maze[bRow2][bCol2] = "b";
			}
			repaint();
		}
	}
	public static void main(String[] args){
		Maze app = new Maze();
	}

public void keyReleased(KeyEvent e){}
public void keyTyped(KeyEvent e){}
}