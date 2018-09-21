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
		System.out.println("현재 인구수는 "+numberofPerson+"명 입니다.");
	}
	
	public Person() {
		super();
		this.age = 12;
		this.name = "";
		numberofPerson++;
		System.out.println("현재 인구수는 "+numberofPerson+"명 입니다.");
	}
	
	public void selfIntroduce()
	{
		System.out.printf("내 이름은 %s 이며 나이는 %d살 입니다.\n",this.name,this.age);
	}
	
	public int getPopulation()
	{
		return numberofPerson;
	}

}
