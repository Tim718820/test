
public class CCC {

	public static void main(String[] args) {
		String a = "12345678";
		char b = '0';
		for (int i=0; i<a.length(); i++){
			//System.out.println(b);
			b = a.charAt(i);
			System.out.println(b);
		}
	    //System.out.println(b);	
		switch(b){
		case 1:
			System.out.println("一");
			break;
		}
	}

}

