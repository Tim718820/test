
public class Prime {
	static boolean a(int newi){
		int sum = 0;
		for (int i=1; i<=newi; i++){
			if(newi%i == 0){
				sum++;
				}
			}
			if(sum == 2){
				return true;
			}else{
				return false;
			}
		}
		
		
	

	public static void main(String[] args) {
		//顯示1~100
		int  newi; 
		for(int j=0; j<10 ; j++){
			for (int i=1; i<=10; i++){
				newi = i + j*10;
				System.out.print(a(newi)?(newi)+"*"+"\t":(newi)+"\t");
			}
			System.out.println();
		}
		
	}

}

