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
		int floor;//손님이 타기 전 엘리베이터가 있는 층 
		int floor2;//현재 손님이 있는 층
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
			System.out.println("현재 탑승 인원: 없음(최대 15명)");
			System.out.println("엘리베이터를 이용하실려면 Y키를 누르시오");
			check=new Scanner(System.in).next();
		}
		else if (cnt>=15) {
			System.out.println("현재 탑승 인원:"+cnt+"(최대 15명)");
			System.out.println("정원초과로 인하여 탑승하실 수 없습니다.");
			check="N";
		}
		else {
			System.out.println("현재 탑승 인원:"+cnt+"명(최대 15명)");
			System.out.println("엘리베이터를 이용하실려면 Y키를 누르시오");
			check=new Scanner(System.in).next();
	}
		
		if(check.equals("Y")){
			cnt++;
			try {
				arElevator[cnt-1]=1;//이상있으면 캐치문 실행
				Elevator.floor=floor;
				Elevator.floor2=floor2;
				e.go1();
			}
			catch(Exception e1) {
				System.out.println("정원 초과");
			}
			
		}
		//손님과 현재 엘리베이터의 위치를 동일시 시키기 위함
		if(check.equals("N")) {
			System.out.println("다음에 이용 부탁드립니다.");
			
		}
		else {
			System.out.println("현재 탑승 인원:"+cnt+"명(최대 15명)");
			System.out.println("엘리베이터를 이용하실려면 Y키를 누르시오");
		
	}
		check=new Scanner(System.in).next();
		if(check.equals("Y")){
			
			try {
				arElevator[cnt-1]=1;//이상있으면 캐치문 실행
				Elevator.floor2=floor2;
				e.go2();
			}
			catch(Exception e1) {
				System.out.println("정원 초과");
			}
			
		}
		
	   
	}
}
