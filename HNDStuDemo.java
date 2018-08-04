package superclass.ex;

public class HNDStuDemo {
	public static void main(String[] args) {
		String content[] = { "science", "bio" };
		BcasStu bcasstu = new BcasStu("thanu", 23, Gender.m, 100, content, "csd11", 12000.00, "Jaffna");
		IcbtStu icbtstu = new IcbtStu("sana", 33, Gender.m, 100, content, "csd11", 15000.00, "Jaffna");
		System.out.println(BcasStu.getStudents);
	}
}
