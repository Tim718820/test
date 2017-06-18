
public class ABAB123 {

	public static void main(String[] args) {
		String a = "12123456";
		String b = new String(a);
		b=a.replaceAll("1", "我").replaceAll("2", "你");
		
		System.out.println(b);
	}

}
