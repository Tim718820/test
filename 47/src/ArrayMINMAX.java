import java.util.Arrays;

public class ArrayMINMAX {

	public static void main(String[] args) {
		 int a[] = {45, 23, 18, 10, 6, 8, 67, 98, 30, 50};
         Arrays.sort(a); //排列
         for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" | ");
         System.out.print("\n======================");
         int max = a[a.length-1];
         int min = a[0];
         System.out.println("\n最大值= "+max+"\n最小值= "+min);

	}

}
