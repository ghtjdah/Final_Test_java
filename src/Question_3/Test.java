package Question_3;

public class Test {
	
	String subject = ""; //�ʵ� ������
	int point = 0; //�ʵ� ����
	
	
	public void setPoint(String subject, int point) {
		this.subject = subject;
		this.point = point;
	}
	
	String getPoint() {
		return subject + ":" + point;
	}

}
