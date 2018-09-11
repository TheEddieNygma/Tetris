import java.awt.Color;

public class LShape extends AbstractPiece{

	public LShape(int r, int c, Grid g) {
		setGrid(g);
		square = new Square[PIECE_COUNT];
		ableToMove = true;

		// Create the squares
		square[0] = new Square(g, r - 1, c, Color.magenta, true);
		square[1] = new Square(g, r, c, Color.magenta, true);
		square[2] = new Square(g, r + 1, c, Color.magenta, true);
		square[3] = new Square(g, r + 1, c + 1, Color.magenta, true);
		i = 1;
	}


	public Grid getGrid() {
		return grid;
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}
	
	/**
	* Rotate the Piece
	*/	
	public void rotate(){
		
		switch(i){
		case 1:
			this.square[0].setRow(this.square[0].getRow() + 1);
			this.square[0].setCol(this.square[0].getCol() + 1);
			this.square[2].setRow(this.square[2].getRow() - 1);
			this.square[2].setCol(this.square[2].getCol() - 1);
			this.square[3].setRow(this.square[3].getRow() * 1);
			this.square[3].setCol(this.square[3].getCol() - 2);
			i++;
			break;
		case 2:
			this.square[0].setRow(this.square[0].getRow() + 1);
			this.square[0].setCol(this.square[0].getCol() - 1);
			this.square[2].setRow(this.square[2].getRow() - 1);
			this.square[2].setCol(this.square[2].getCol() + 1);
			this.square[3].setRow(this.square[3].getRow() - 2);
			this.square[3].setCol(this.square[3].getCol() * 1);
			i++;
			break;
		case 3:
			this.square[0].setRow(this.square[0].getRow() - 1);
			this.square[0].setCol(this.square[0].getCol() - 1);
			this.square[2].setRow(this.square[2].getRow() + 1);
			this.square[2].setCol(this.square[2].getCol() + 1);
			this.square[3].setRow(this.square[3].getRow() * 1);
			this.square[3].setCol(this.square[3].getCol() + 2);
			i++;
			break;
		case 4:
			this.square[0].setRow(this.square[0].getRow() - 1);
			this.square[0].setCol(this.square[0].getCol() + 1);
			this.square[2].setRow(this.square[2].getRow() + 1);
			this.square[2].setCol(this.square[2].getCol() - 1);
			this.square[3].setRow(this.square[3].getRow() + 2);
			this.square[3].setCol(this.square[3].getCol() * 1);
			i++;
			break;
		default: 
			i = 1;
			break;
		}
	}
}