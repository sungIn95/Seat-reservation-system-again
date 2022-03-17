package readingRoom;

public class Customer {
	private String customerName;
	private int customerID;
	private boolean right;//���� ������ �ڸ��� �ִ��� ����
	private Seat useSeat;//���� �̿� ���� �¼�
	
	public Customer(int ID,String name) {//ID, �̸� ���� ����
		this.right = true;
		this.customerID = ID;
		this.customerName = name;
		System.out.println(this.customerName + " ������ ID�� " + this.customerID + "�Դϴ�.");
	}

	public void choiceSeat(Seat seat) {//�¼� ����: ����ڴ� �̿��� ��ȯ, �¼��� ����� ��ȯ
		if(seat.seatOX == true) {
			if(this.right == true) {
				seat.useing();
				this.right = false;
				System.out.println(seat.seatNumber + "���ڸ� ������ �Ϸ� �Ǿ����ϴ�.");
				useSeat = seat; //���� �̿� ���� �¼� ����!! 
			}
			else {
				System.out.println("�̹� �����Ͻ� �¼��� �ֽ��ϴ�.");
			}
		}
		else {
			System.out.println("�ش��ڸ��� ������Դϴ�.");
		}
	}

	public void endSeat() {//�¼� ���: ����ڴ� ���̿��� ��ȯ, �¼��� ��� ���� ��ȯ
		if(this.right == false) {
			(this.useSeat).unuseing();//����� �¼� ������ �ٷ� ���.
			this.right = true;
			System.out.println(customerName + "�� " + (this.useSeat).seatNumber + "�� �ڸ� ���� ��� ó�� �Ǿ����ϴ�.");
		}
		else {
			System.out.println(customerName + "�� ���� ���� ��� �¼��� �����ϴ�.");
			
		}
	}
	
	public void showCustomerInfo() {//���� �� ��Ȳ
		if(this.right == false) {
			System.out.println("���� " + this.customerName + "���� " + (this.useSeat).seatNumber + "�� �ڸ� �̿����Դϴ�.");
		}
		else {
			System.out.println(customerName + "�� �̿����� �¼��� �����ϴ�.");
		}
	}
	
	
}
	