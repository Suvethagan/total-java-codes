package superclass.ex;

public class HNDStudent extends Students {
	public int student_id;
	public String[] content;
	String batch;
	double payment;

	public HNDStudent(String student_name, int student_age, Gender gender, int student_id, String[] content,
			String batch, double payment) {
		super(student_name, student_age, gender);
		this.student_id = student_id;
		this.content = content;
		this.batch = batch;
		this.payment = payment;
	}

	public int getStudent_id() {
		return student_id;
	}

	public String[] getContent() {
		return content;
	}

	public String getBatch() {
		return batch;
	}

	public double getPayment() {
		return payment;
	}

}
