package kh.vari.function;
import java.util.Scanner;

public class VariExample {
	
	Scanner sc = new Scanner(System.in);
	
	public void  Example() {
		//정수 두개를 입력받아 두 수의 합, 차, 곱, 나누기 출력.
		System.out.println("===정수 두 개로 합, 차, 곱, 나누기 출력하기===");
		System.out.print("첫번째 정수를 입력해주세요. : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두번째 정수를 입력해주세요. : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		sc.close();
		System.out.printf("합 :%d, 차 :%d, 곱 :%d, 나누기 :%d", 
				num1+num2, num1-num2, num1 * num2, num1 / num2);
		System.out.println();
		System.out.println();
	}
	
	public void Example2() {
		//사각형의 면적과 둘레를 계산. 실수형.
		System.out.println("===사각형의 면적과 둘레를 계산===");
		System.out.print("사각형의 가로길이는 ? 단위를 빼고 입력해주세요. : ");
		double num1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("사각형의 세로길이는? 단위를 빼고 입력해주세요. : ");
		double num2 = sc.nextDouble();
		sc.nextLine();
		sc.close();
		
		System.out.printf("면적 :%f, 둘레 :%f ", num1*num2, (num1*num2)*2 ); 
	
	}
		
	public void Example3() {
		// 영어 문자열 값을 키보드로 입력받아 각 자리의 문자를 출력.
		// 예) apple 
		// 첫번째 문자 : a
		// 두번째 문자 : p
		// 세번째 문자 : p
		System.out.print("영어 단어를 입력해주세요 : \n");
		String word = sc.nextLine();
		
		System.out.println("첫번째 문자 : " + word.charAt(0));
		System.out.println("두번째 문자 : " + word.charAt(1));
		System.out.println("세번째 문자 : " + word.charAt(2));
	}

	public void minus() {
		System.out.print("뺄셈할 첫번째 정수 1개를 입력해주세요.");
		int num1 = sc.nextInt();
		System.out.print("뺄셈할 두번째 정수 1개를 입력해주세요.");
		int num2 = sc.nextInt();
		int result = num1 - num2;
		
		System.out.printf("%d - %d = %d %n",num1,num2,result);
	}
	
	public void division() {
		System.out.print("나눗셈할 첫번째 정수 1개를 입력해주세요.");
		int num1 = sc.nextInt();
		System.out.print("나눗할 두번째 정수 1개를 입력해주세요.");
		int num2 = sc.nextInt();
		int result = num1 / num2;
		
		System.out.printf("%d / %d = %d %n",num1,num2,result);
	}
	public void remainder() {
		System.out.print("나머지 연산할 첫번째 정수 1개를 입력해주세요.");
		int num1 = sc.nextInt();
		System.out.print("나머지 연산할 두번째 정수 1개를 입력해주세요.");
		int num2 = sc.nextInt();
		int result = num1 % num2;
		
		System.out.printf("%d를 %d로 나눈 나머지 값은 %n%d입니다.",num1,num2,result);
	}
	
	public void updowntwenty(){
		System.out.println("입력한 값이 20보다 큰지 확인하는 프로그램");
		System.out.println("입력한 값이 20보다 크면 true가 출력됩니다.");
		System.out.print("정수를 입력해주세요. : ");
		
		int num = sc.nextInt();
		
		boolean tmp = num >= 20;
		
		System.out.print(tmp);
		
	}
	public void alphaCaseDg() {
		
		System.out.println("===입력한 값이 대문자인지 구별하는 프로그램===");
		System.out.print("영문자 한개를 입력해주세요. : ");
		
		char alphabet = sc.next().charAt(0); //입력받은 첫번째 값을 문자형으로 alphabet에 저장.
		int tmp = (int)alphabet; // alphabet을 int형으로 강제형변환 뒤 tmp에 저장.
		
		System.out.println((tmp >=65 && tmp<= 90)? "입력한 문자는 대문자입니다." : 
			(tmp >=97 && tmp<= 122)? "입력한 문자는 소문자 입니다" : "입력한 문자는 영문자가 아닙니다.");
		
		}
	
	
}
