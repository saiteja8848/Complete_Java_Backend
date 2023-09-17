

interface Pen{
	void write();
}

class BluePen implements Pen {

	public void write() {
		System.out.println("Writing using blue pen on board");
	}
}

class BlackPen  implements Pen {

	public void write() {
		System.out.println("Writing using black pen on board");
	}
}

class Board {

	// fields - properties
     Pen pen;

	// constructor - initial setup
	Board(Pen pen) {
		this.pen = pen;
	}

	// Actions
	void writeOnboard() {
		this.pen.write();
	}

	static void colorOfBaord() {
		System.out.println("white color board");
	}
}

class Demo {

	public static void main(String[] args) {
		BluePen bluePen = new BluePen();
		BlackPen blackPen = new BlackPen();
		
		int userChoice=1;
		
//		if(userChoice==1) {
//			Board board = new Board(blackPen);
//		}else if() {
//			board.writeOnboard();
//		}
//		
		
		
		
		
		 Board.colorOfBaord();

	}
}
