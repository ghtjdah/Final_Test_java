package Question_2;

public class Person {
	
	static int numberofPerson;
	
	private int age;
	private String name;
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
		numberofPerson++;
		System.out.println("���� �α����� "+numberofPerson+"�� �Դϴ�.");
	}
	
	public Person() {
		super();
		this.age = 12;
		this.name = "";
		numberofPerson++;
		System.out.println("���� �α����� "+numberofPerson+"�� �Դϴ�.");
	}
	
	public void selfIntroduce()
	{
		System.out.printf("�� �̸��� %s �̸� ���̴� %d�� �Դϴ�.\n",this.name,this.age);
	}
	
	public int getPopulation()
	{
		return numberofPerson;
	}

}
