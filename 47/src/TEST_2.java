import java.util.Scanner;;
public class TEST_2 {

	public static void main(String[] args) {
		do{
			square();
		}while(true);
	}
	
		static void square(){	
		System.out.print("請輸入變數值:"); //輸入變數
		
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();//建立輸入串流
		
		if(i<31) {                     //判斷i是否小於31
			System.out.println("i的平方為:" + Math.pow(i, 2)); //計算i的平方值
		}
		else if(i>=31){ 
			System.out.print("錯誤~~~ ");
		}
		
	}

}