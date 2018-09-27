package Question_3;

public class Classroom {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Student kim = new Student(12, "김주현", 3);
		kim.test[0].setPoint("국어", 95);
		kim.test[1].setPoint("영어", 83);
		kim.test[2].setPoint("수학", 76);
		kim.printScore(); 
		
		Student lee = new Student(7, "이민기", 3);
		lee.test[0].setPoint("국어", 66);
		lee.test[1].setPoint("영어", 22);
		lee.test[2].setPoint("수학", 18);
		lee.printScore();
		
	}

}
