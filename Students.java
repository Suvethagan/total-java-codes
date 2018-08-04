package superclass.ex;

public class Students {

	public String student_name;
	public int student_age;
	public Gender gender;

	public Students(String student_name, int student_age, Gender gender) {

		this.student_name = student_name;
		this.student_age = student_age;
		this.gender = gender;
	}

	public String getStudent_name() {
		return student_name;
	}

	public int getStudent_age() {
		return student_age;
	}

	public Gender getGender() {
		return gender;
	}

}
