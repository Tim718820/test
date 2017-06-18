
public class INClASS {
	int x = 1;
	static int y = 2;
	INClASS(){
		System.out.println(this.x);
		System.out.println(y);
		System.out.println(new myclassa().z);
	}
	public class myclassa{
		int z = 3;
		myclassa(){
		System.out.println(x);	
		}
	}
}
