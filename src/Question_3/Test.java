package Question_3;

public class Test {
	
	String subject = ""; //필드 교과명
	int point = 0; //필드 점수
	
	
	public void setPoint(String subject, int point) {
		this.subject = subject;
		this.point = point;
	}
	
	String getPoint() {
		return subject + ":" + point;
	}

}
