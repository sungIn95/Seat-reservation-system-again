package readingRoom;

public class Seat {

	public boolean seatOX; //�¼� ����� ����
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

	
	public void showSeatInfo() {//�ڸ� ����
		if(this.seatOX == false) {
			System.out.println(seatNumber + "���ڸ��� ������Դϴ�. ");
		}
		else {
			System.out.println(seatNumber + "���ڸ��� ��� �����մϴ�. ");
		}
	}
	}
	
	
	
	
	
	
	


