package ClassTest;

public class Test {
	
	public static void main(String[] args) {
		
		String oldName = "123123.12312.123123.jpg";
		
		String newName = MyUtils.updateFileName(oldName, "YYYYMMddhhmmss", 100000);
		
		System.out.println(newName);
		
	}

}
