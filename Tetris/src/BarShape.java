import java.awt.Color;

public class BarShape extends AbstractPiece{
	
	public BarShape(int r, int c, Grid g) {
		setGrid(g);
		square = new Square[PIECE_COUNT];
		ableToMove = true;

	    // Create the squares
		square[0] = new Square(g, r, c - 1, Color.cyan, true);
	    square[1] = new Square(g, r, c, Color.cyan, true);
		square[2] = new Square(g, r, c + 1, Color.cyan, true);
		square[3] = new Square(g, r, c + 2, Color.cyan, true);
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
	public void rotate()
	{
		for(int count = 0; count < 3; count++){
			if(((square[count].getRow() >= 0) && (square[count].getRow() < Grid.HEIGHT))
					&& ((square[count].getCol() >= 0) &&(square[count].getCol() < Grid.WIDTH))) {
				if(i % 2 == 0){
					this.square[0].setRow(this.square[0].getRow() + 1);
					this.square[0].setCol(this.square[0].getCol() - 1);
					this.square[2].setRow(this.square[2].getRow() - 1);
					this.square[2].setCol(this.square[2].getCol() + 1);
					this.square[3].setRow(this.square[3].getRow() - 2);
					this.square[3].setCol(this.square[3].getCol() + 2);
					
				}
				else{
					this.square[0].setRow(this.square[0].getRow() - 1);
					this.square[0].setCol(this.square[0].getCol() + 1);
					this.square[2].setRow(this.square[2].getRow() + 1);
					this.square[2].setCol(this.square[2].getCol() - 1);
					this.square[3].setRow(this.square[3].getRow() + 2);
					this.square[3].setCol(this.square[3].getCol() - 2);
				}
				i++;
			}
		}
	}
}