package split;

public class App {
	
	public static void main(String[] args) {
		
		String studentReceived = "Daniel; dbborges.rj@gmail.com; 30";
		
		String[] separatedText = studentReceived.split(";\\s");
		
		Student student = new Student();
		student.setName(separatedText[0]);
		student.setMail(separatedText[1]);
		student.setAge(separatedText[2]);
		
		System.out.println(student);
		
	}

}
