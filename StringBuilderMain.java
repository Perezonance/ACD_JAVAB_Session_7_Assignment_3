package assignment_3;

public class StringBuilderMain {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("String ");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("Has been Appended!");
		System.out.println(sb);
		System.out.println(sb.capacity());
	}
}
