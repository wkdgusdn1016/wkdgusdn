package code;

import java.util.Random;
import java.util.Scanner;

public class Building {
	public static void main(String[] args) {
		Elevator e=new Elevator();
		Random r=new Random();
		String check = "";
		int [] arElevator=new int[15];
		
		int cnt = r.nextInt(16);
	
		for (int i = 0; i < cnt; i++) {
			arElevator[i]=1;
			
		}
		int floor;//�մ��� Ÿ�� �� ���������Ͱ� �ִ� �� 
		int floor2;//���� �մ��� �ִ� ��
		while(true) {
			floor=r.nextInt(e.maxFloor+(e.minFloor*-1)+1)+e.minFloor;
			if(floor!=0)
				break;
		}
		
		while(true) {
			floor2=r.nextInt(e.maxFloor+(e.minFloor*-1)+1)+e.minFloor;
			if(floor2!=0)
				break;
		}
		if(cnt==0) {
			System.out.println("���� ž�� �ο�: ����(�ִ� 15��)");
			System.out.println("���������͸� �̿��ϽǷ��� YŰ�� �����ÿ�");
			check=new Scanner(System.in).next();
		}
		else if (cnt>=15) {
			System.out.println("���� ž�� �ο�:"+cnt+"(�ִ� 15��)");
			System.out.println("�����ʰ��� ���Ͽ� ž���Ͻ� �� �����ϴ�.");
			check="N";
		}
		else {
			System.out.println("���� ž�� �ο�:"+cnt+"��(�ִ� 15��)");
			System.out.println("���������͸� �̿��ϽǷ��� YŰ�� �����ÿ�");
			check=new Scanner(System.in).next();
	}
		
		if(check.equals("Y")){
			cnt++;
			try {
				arElevator[cnt-1]=1;//�̻������� ĳġ�� ����
				Elevator.floor=floor;
				Elevator.floor2=floor2;
				e.go1();
			}
			catch(Exception e1) {
				System.out.println("���� �ʰ�");
			}
			
		}
		//�մ԰� ���� ������������ ��ġ�� ���Ͻ� ��Ű�� ����
		if(check.equals("N")) {
			System.out.println("������ �̿� ��Ź�帳�ϴ�.");
			
		}
		else {
			System.out.println("���� ž�� �ο�:"+cnt+"��(�ִ� 15��)");
			System.out.println("���������͸� �̿��ϽǷ��� YŰ�� �����ÿ�");
		
	}
		check=new Scanner(System.in).next();
		if(check.equals("Y")){
			
			try {
				arElevator[cnt-1]=1;//�̻������� ĳġ�� ����
				Elevator.floor2=floor2;
				e.go2();
			}
			catch(Exception e1) {
				System.out.println("���� �ʰ�");
			}
			
		}
		
	   
	}
}
