package readingRoom;

public class Customer {
	private String customerName;
	private int customerID;
	private boolean right;//현재 예약한 자리가 있는지 여부
	private Seat useSeat;//현재 이용 중인 좌석
	
	public Customer(int ID,String name) {//ID, 이름 같이 생성
		this.right = true;
		this.customerID = ID;
		this.customerName = name;
		System.out.println(this.customerName + " 고객님의 ID는 " + this.customerID + "입니다.");
	}

	public void choiceSeat(Seat seat) {//좌석 선택: 사용자는 이용중 전환, 좌석은 사용적 전환
		if(seat.seatOX == true) {
			if(this.right == true) {
				seat.useing();
				this.right = false;
				System.out.println(seat.seatNumber + "번자리 예약이 완료 되었습니다.");
				useSeat = seat; //현재 이용 중인 좌석 저장!! 
			}
			else {
				System.out.println("이미 예약하신 좌석이 있습니다.");
			}
		}
		else {
			System.out.println("해당자리는 사용중입니다.");
		}
	}

	public void endSeat() {//좌석 퇴실: 사용자는 미이용중 전환, 좌석은 사용 가능 전환
		if(this.right == false) {
			(this.useSeat).unuseing();//저장된 좌석 정보로 바로 퇴실.
			this.right = true;
			System.out.println(customerName + "님 " + (this.useSeat).seatNumber + "번 자리 정산 퇴실 처리 되었습니다.");
		}
		else {
			System.out.println(customerName + "님 현재 쓰고 계신 좌석이 없습니다.");
			
		}
	}
	
	public void showCustomerInfo() {//현재 고객 상황
		if(this.right == false) {
			System.out.println("현재 " + this.customerName + "님은 " + (this.useSeat).seatNumber + "번 자리 이용중입니다.");
		}
		else {
			System.out.println(customerName + "님 이용중인 좌석이 없습니다.");
		}
	}
	
	
}
	