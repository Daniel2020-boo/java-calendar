package daenim.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month -1];
	}
	
	public void printSampleCalendar() {
		System.out.println("일  월  화  수  목  금  토"); 
		System.out.println("--------------------"); 
		System.out.println(" 1  2  3  4  5  6  7");  
		System.out.println(" 8  9 10 11 12 13 14");  
		System.out.println("15 16 17 18 19 20 21");  
		System.out.println("22 23 24 25 26 27 28");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		String PROMPT = "cal>";
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		System.out.println("반복 횟수를 입력하세요.");
		
		int number = sc.nextInt();
		
		for(int i=0; i < number; i++) {
			
			System.out.println("월을 입력하세요");
			System.out.print(PROMPT);
			int month = sc.nextInt();
			if (month > 0 && month < 13) {

				System.out.printf("%d월은 %d까지 입니다.", month, cal.getMaxDaysOfMonth(month));

			} else {
				System.out.println("1~12까지의 월 만 입력하세요");
			}
		}
		System.out.println("Bye~");
		sc.close();
	}

}