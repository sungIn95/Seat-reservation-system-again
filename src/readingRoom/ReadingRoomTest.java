package readingRoom;

public class ReadingRoomTest {

	public static void main(String[] args) {

		
		Seat seat1 = new Seat(1);// �ڸ�1 ����
		Seat seat2 = new Seat(2);// �ڸ�2 ����
		Seat seat3 = new Seat(3);// �ڸ�3 ����
	
		Customer customer1 = new Customer(111,"One Bin"); //��1 ����
		Customer customer2 = new Customer(222,"Two Bin"); //��2 ����
		Customer customer3 = new Customer(333,"Three Bin"); //��3 ����
		
		System.out.println();
		System.out.println();
		System.out.println();

		customer1.choiceSeat(seat1);//�� �ڸ� ����
		customer1.showCustomerInfo();//�� ���� ��Ȳ
		seat1.showSeatInfo();//�ڸ� ���� ��Ȳ

		System.out.println("======1======");//1�� �� 1���ڸ� ���� 
		
		customer2.choiceSeat(seat1);//�� �ڸ� ����
		customer2.showCustomerInfo();//�� ���� ��Ȳ
		seat1.showSeatInfo();//

		System.out.println("======2======");//2�� �� 1���ڸ� ����(�ڸ� �ִ� �ڸ� ����)
		
		customer2.choiceSeat(seat2);//��� ó��
		customer2.showCustomerInfo();//
		seat2.showSeatInfo();//

		System.out.println("======3======");//2�� �� 2�� �ڸ� ����
		
		customer1.endSeat();//��� ó��
		customer1.showCustomerInfo();//
		seat1.showSeatInfo();//

		System.out.println("======4======");//1�� �� ����(1���ڸ�)
		
		customer3.choiceSeat(seat1);//�� �ڸ� ����
		customer3.showCustomerInfo();//�� ���� ��Ȳ
		seat1.showSeatInfo();//�ڸ� ���� ��Ȳ

		System.out.println("======5======");//3�� �� 1���ڸ� ����
		
		customer3.choiceSeat(seat3);//�� �ڸ� ����
		customer3.showCustomerInfo();//�� ���� ��Ȳ
		seat3.showSeatInfo();//�ڸ� ���� ��Ȳ

		System.out.println("======6======");//3�� �� 3���ڸ� ����(�ι� ����)
		

	}
}