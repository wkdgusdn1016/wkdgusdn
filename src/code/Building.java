package code;

import java.util.Random;
import java.util.Scanner;

public class Building {
	public static void main(String[] args) {
		Elevator e=new Elevator();
		Random r=new Random();
		String check = "";
		int cnt =r.nextInt(16);		
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
			check="N";
		}
		else {
			System.out.println("���� ž�� �ο�:"+cnt+"��(�ִ� 15��)");
			System.out.println("���������͸� �̿��ϽǷ��� YŰ�� �����ÿ�");
			check=new Scanner(System.in).next();
	}
		
		if(check.equals("Y")){
			cnt++;
			Elevator.floor=floor;
			Elevator.floor2=floor2;
			e.go1();
			}
		else 
			System.out.println("���� �ʰ�");
			
			
		
		//�մ԰� ���� ������������ ��ġ�� ���Ͻ� ��Ű�� ����
		if(check.equals("N")) {
			System.out.println("������ �̿� ��Ź�帳�ϴ�.");	
		}
		else 
			System.out.println("���� ž�� �ο�:"+cnt+"��(�ִ� 15��)");
		if(check.equals("Y")){
			Elevator.floor2=floor2;
			e.go2();	
		}
		
	   
	}
}
