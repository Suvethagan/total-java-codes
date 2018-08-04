package superclass.ex;

public class IcbtStu extends HNDStudent {
	final String college_name = "ICBT";
	String college_address;

	public IcbtStu(String student_name, int student_age, Gender gender, int student_id, String[] content, String batch,
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
