package code;

import java.util.Scanner;

public class Elevator extends Lift{
	
	int maxFloor=15;//�ְ� ����
	int minFloor=-3;//���� ����
	
	void up() {     //������ ��ĭ�� ������Ų��.      
 		floor++;
	}
	void down() {   //������ ��ĭ�� ���ҽ�Ų��.
		floor--;
	}
	void up2() {     //������ ��ĭ�� ������Ų��.      
 		floor2++;
	}
	void down2() {   //������ ��ĭ�� ���ҽ�Ų��.
		floor2--;
	}
	void stop() {
		System.out.println("�����Ͽ����ϴ�");
		
	}
	
	
	void go1() {
		String msg="";
		while(true){
			msg="���� ���������ʹ�"+floor+"�� (���� �մ��� �ִ� ��:"+floor2+ ")";
			System.out.println(msg);
			if(floor2>maxFloor||floor2<minFloor) {
				System.out.println("���� 3������ 15�������� �����մϴ�.");
				
			}
			else {
				break;
			}
		}
		start1(floor2);
		
	}
	void start1(int choice2) {
		if(choice2<floor) {   //���� ������ �������ϴ� �������� Ŀ������ 
			for (int i = 0; i <= floor-choice2+i; i++) {
				if(floor!=0) {
					System.out.println(floor+"��");//0���� �����ش�.
					try {
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) {}
						// TODO Auto-generated catch block
				}
				down();
				
			}
			stop();
			System.out.println("ž�� ��Ź�帳�ϴ�.");
		}
		else if(floor!=choice2) {
			for (int i = 0; i <= choice2-floor+i; i++) {
				if(floor!=0) {
					System.out.println(floor+"��");
					try {
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) {}
						// TODO Auto-generated catch block
					
				}
				up();
				
			}
			stop();
			System.out.println("ž�� ��Ź�帳�ϴ�.");
		
		}
		else
			System.out.println("���� ���������Ͱ� �մ� ���� ��ġ�� �ֽ��ϴ�. ž�� ��Ź�帳�ϴ�.");
	}
	void go2() {
		int choice2=0;
		String msg="";
		while(true){
			msg="������ �Է��ϼ���(���� �մ��� �ִ� ��:"+floor2+ ")";
			System.out.println(msg);
			choice2=new Scanner(System.in).nextInt();
			if(choice2>maxFloor||choice2<minFloor) {
				System.out.println("���� 3������ 15�������� �����մϴ�.");
					
			}
			else if(choice2==floor2) {
				System.out.println("���� �� ���� �Ұ�");
				continue;
			}
			else {
				break;
			}
		}
		start2(choice2);
			
		}
	void start2(int choice2) {
		if(choice2<floor2) {   //���� ������ �������ϴ� �������� Ŀ������ 
			for (int i = 0; i <= floor2-choice2+i; i++) {
				if(floor2!=0) {
					System.out.println(floor2+"��");//0���� �����ش�.
					try {
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) {}
						// TODO Auto-generated catch block
				}
				down2();
				
			}
			stop();
			System.out.println("���̿����ϴ�");
		}
		else if(floor2!=choice2) {
			for (int i = 0; i <= choice2-floor2+i; i++) {
				if(floor2!=0) {
					System.out.println(floor2+"��");
					try {
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) {}
						// TODO Auto-generated catch block
					
				}
				up2();
				
			}
			stop();
			System.out.println("���̿����ϴ�");
		
		}
	
		
		
	}
	
}
		
		
	


	
	
	