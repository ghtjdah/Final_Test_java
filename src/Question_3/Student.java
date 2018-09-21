package Question_3;

public class Student {
	
	int id;
	String name;
	int subnum;
	Test[] test;
	
	
	public Student(int id, String name, int subnum) {
		super();
		this.id = id;
		this.name = name;
		this.subnum = subnum;
		test = new Test[subnum];
		this.getName();
	}


	String getName() {
		return this.id + ":" + this.name;
	}
	
	int getGrade()
	{
		int sum = 0;
		
		for(Test t : this.test)
		{
			sum += t.point;
		}
		
		return sum;
	}
	
	
	void printScore()
	{
		System.out.println(getName());
		
		for(Test t : this.test)
		{
			t.getPoint();
		}
		
		System.out.println("รัมก : "+getGrade());
		System.out.println("************************************************");
	}
	
}
