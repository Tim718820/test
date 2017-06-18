interface A {
	int i = 10;
	void show();
}
interface B {
	int i = 20;
	void show();
}
interface C extends A,B{
	void show(String s);
}

public class interface01 implements C {
	public void show(){
		show("");
	}
	public void show(String s){
		System.out.println(s+"i="+A.i+"j="+B.i);
	}
	public static void main(String[] args) {
		interface01 P = new interface01();
		P.show();

	}

}
