package superclass.ex;

public class BcasStu extends HNDStudent {
	final String college_name = "BCAS";
	String college_address;

	public BcasStu(String student_name, int student_age, Gender gender, int student_id, String[] content, String batch,
			double payment) {
		super(batch, student_id, gender, student_id, content, batch, payment);
		this.college_address = college_address;
	}

	public String getCollege_name() {
		return college_name;
	}

	public String getCollege_address() {
		return college_address;
	}

}
