import java.io.*;
class littlegame{
        public static void main(String args[]) throws IOException{

            BufferedReader input=new BufferedReader(
                new InputStreamReader(System.in));
            //這一行的意義是建立輸入串流

            String pass=""+ ((int)(Math.random()*9)+1);
            //這一行示範了怎麼用Math.random() 產生1-9亂數

            String inputStr="";

            System.out.print("請輸入一位數字:");
            inputStr=input.readLine();
            //這裡示範了怎麼提示輸入訊息跟
            //怎麼讓使用者進行輸入過程

            while(!pass.equals(inputStr)){
                //這裡示範了 輸入錯誤就要求重新輸入的條件

                System.out.print("密碼錯誤，請重新輸入:");
                inputStr=input.readLine();
                //這裡示範了輸入錯誤的提示訊息跟要求重新輸入的寫法
                //1
            }

            System.out.println("密碼輸入正確，程式結束!");
            //這裡表示說
            //照程式流程  while迴圈只有在輸入正確的時候才會離開
        }
    }
