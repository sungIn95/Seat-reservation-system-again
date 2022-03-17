package readingRoom;

public class ReadingRoomTest {

	public static void main(String[] args) {

		
		Seat seat1 = new Seat(1);// 자리1 생성
		Seat seat2 = new Seat(2);// 자리2 생성
		Seat seat3 = new Seat(3);// 자리3 생성
	
		Customer customer1 = new Customer(111,"One Bin"); //고객1 생성
		Customer customer2 = new Customer(222,"Two Bin"); //고객2 생성
		Customer customer3 = new Customer(333,"Three Bin"); //고객3 생성
		
		System.out.println();
		System.out.println();
		System.out.println();

		customer1.choiceSeat(seat1);//고객 자리 예약
		customer1.showCustomerInfo();//고객 예약 현황
		seat1.showSeatInfo();//자리 예약 현황

		System.out.println("======1======");//1번 고객 1번자리 예약 
		
		customer2.choiceSeat(seat1);//고객 자리 예약
		customer2.showCustomerInfo();//고객 예약 현황
		seat1.showSeatInfo();//

		System.out.println("======2======");//2번 고객 1번자리 예약(자리 있는 자리 예약)
		
		customer2.choiceSeat(seat2);//퇴실 처리
		customer2.showCustomerInfo();//
		seat2.showSeatInfo();//

		System.out.println("======3======");//2번 고객 2번 자리 예약
		
		customer1.endSeat();//퇴실 처리
		customer1.showCustomerInfo();//
		seat1.showSeatInfo();//

		System.out.println("======4======");//1번 고객 퇴장(1번자리)
		
		customer3.choiceSeat(seat1);//고객 자리 예약
		customer3.showCustomerInfo();//고객 예약 현황
		seat1.showSeatInfo();//자리 예약 현황

		System.out.println("======5======");//3번 고객 1번자리 예약
		
		customer3.choiceSeat(seat3);//고객 자리 예약
		customer3.showCustomerInfo();//고객 예약 현황
		seat3.showSeatInfo();//자리 예약 현황

		System.out.println("======6======");//3번 고객 3번자리 예약(두번 예약)
		

	}
}