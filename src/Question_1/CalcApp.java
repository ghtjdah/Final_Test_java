package Question_1;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=0, num2=0, result=0;
		
		Arithmetic add = new Add();
		Arithmetic sub = new Sub();
		Arithmetic mul = new Mul();
		Arithmetic div = new Div();
		
		while(true)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("�� ������ �����ڸ� �Է��Ͻÿ� >> ");
			String input = scanner.nextLine();
			
			String[] splitstr = input.split(" ");
			if(splitstr.length > 3)
			{
				System.out.println("2���� �ǿ����ڿ� 1���� �����ڸ� �Է����ּ���");
				continue;
			}
			
			num1= Integer.parseInt(splitstr[0]);
			num2= Integer.parseInt(splitstr[1]);
			
			switch(splitstr[splitstr.length-1])
			{
			case "+":
				result = add.calculate(num1, num2);
				break;
				
			case "-":
				result = sub.calculate(num1, num2);
				break;
				
			case "*":
				result = mul.calculate(num1, num2);
				break;
				
			case "/":
				result = div.calculate(num1, num2);
				break;
				
			default:
				System.out.println("�����ڰ� �ùٸ��� �ʽ��ϴ�. �ٽ� �Է����ּ���");
				continue;
			}
			
			break;
			
		}
		
		System.out.printf("��� : %d", result);

	}

}
