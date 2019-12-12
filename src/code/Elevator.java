package code;

import java.util.Scanner;

public class Elevator extends Lift{
	
	int maxFloor=15;//최고 층수
	int minFloor=-3;//최저 층수
	
	void up() {     //층수를 한칸씩 증가시킨다.      
 		floor++;
	}
	void down() {   //층수를 한칸씩 감소시킨다.
		floor--;
	}
	void up2() {     //층수를 한칸씩 증가시킨다.      
 		floor2++;
	}
	void down2() {   //층수를 한칸씩 감소시킨다.
		floor2--;
	}
	void stop() {
		System.out.println("도착하였습니다");
		
	}
	
	
	void go1() {
		String msg="";
		while(true){
			msg="현재 엘리베이터는"+floor+"층 (현재 손님이 있는 층:"+floor2+ ")";
			System.out.println(msg);
			if(floor2>maxFloor||floor2<minFloor) {
				System.out.println("지하 3층부터 15층까지만 가능합니다.");
				
			}
			else {
				break;
			}
		}
		start1(floor2);
		
	}
	void start1(int choice2) {
		if(choice2<floor) {   //현재 층수가 가고자하는 층수보다 커야지만 
			for (int i = 0; i <= floor-choice2+i; i++) {
				if(floor!=0) {
					System.out.println(floor+"층");//0층을 없애준다.
					try {
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) {}
						// TODO Auto-generated catch block
				}
				down();
				
			}
			stop();
			System.out.println("탑승 부탁드립니다.");
		}
		else if(floor!=choice2) {
			for (int i = 0; i <= choice2-floor+i; i++) {
				if(floor!=0) {
					System.out.println(floor+"층");
					try {
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) {}
						// TODO Auto-generated catch block
					
				}
				up();
				
			}
			stop();
			System.out.println("탑승 부탁드립니다.");
		
		}
		else
			System.out.println("현재 엘리베이터가 손님 층에 위치해 있습니다. 탑승 부탁드립니다.");
	}
	void go2() {
		int choice2=0;
		String msg="";
		while(true){
			msg="층수를 입력하세요(현재 손님이 있는 층:"+floor2+ ")";
			System.out.println(msg);
			choice2=new Scanner(System.in).nextInt();
			if(choice2>maxFloor||choice2<minFloor) {
				System.out.println("지하 3층부터 15층까지만 가능합니다.");
					
			}
			else if(choice2==floor2) {
				System.out.println("같은 층 선택 불가");
				continue;
			}
			else {
				break;
			}
		}
		start2(choice2);
			
		}
	void start2(int choice2) {
		if(choice2<floor2) {   //현재 층수가 가고자하는 층수보다 커야지만 
			for (int i = 0; i <= floor2-choice2+i; i++) {
				if(floor2!=0) {
					System.out.println(floor2+"층");//0층을 없애준다.
					try {
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) {}
						// TODO Auto-generated catch block
				}
				down2();
				
			}
			stop();
			System.out.println("문이열립니다");
		}
		else if(floor2!=choice2) {
			for (int i = 0; i <= choice2-floor2+i; i++) {
				if(floor2!=0) {
					System.out.println(floor2+"층");
					try {
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) {}
						// TODO Auto-generated catch block
					
				}
				up2();
				
			}
			stop();
			System.out.println("문이열립니다");
		
		}
	
		
		
	}
	
}
		
		
	


	
	
	