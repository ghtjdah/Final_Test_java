package Question_1;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=0, num2=0, result=0;
		
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
				Add add = new Add();
				result = add.calculate(num1, num2);
				break;
				
			case "-":
				Sub sub = new Sub();
				result = sub.calculate(num1, num2);
				break;
				
			case "*":
				Mul mul = new Mul();
				result = mul.calculate(num1, num2);
				break;
				
			case "/":
				Div div = new Div();
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
