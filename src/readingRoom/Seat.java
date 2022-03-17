package readingRoom;

public class Seat {

	public boolean seatOX; //좌석 사용중 여부
	public int seatNumber;

	
	public Seat(int sN){
		this.seatOX = true;
		this.seatNumber = sN;
	}
	
	
	public void useing() {
		this.seatOX = false;
	}
	
	
	public void unuseing() {
			this.seatOX = true;
		}

	
	public void showSeatInfo() {//자리 여부
		if(this.seatOX == false) {
			System.out.println(seatNumber + "번자리는 사용중입니다. ");
		}
		else {
			System.out.println(seatNumber + "번자리는 사용 가능합니다. ");
		}
	}
	}
	
	
	
	
	
	
	


