import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;



public class FirstClock extends JFrame{
	public FirstClock() {
		super("類比時鐘");
		PaintClock paintclock = new PaintClock();
		add(paintclock);
		Timer timers = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				paintclock.timer();
			}
		});
		timers.start();
		setSize(400, 400);
		setResizable(false);//設定不可變更視窗大小
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	class PaintClock extends JPanel{
		Calendar time = new GregorianCalendar();//建立time物件實體 使用Calendar類別的方法
		String[] number = {"12","1","2","3","4","5","6","7","8","9","10","11"}; 
		int secend,minute,hour;
		int ceneterX = 200,ceneterY = 200;
		
		 PaintClock(){
			 setBackground(Color.LIGHT_GRAY);
		 }
		 public void timer() {
				// setTimeInMillis依給定的long值來設定目前日曆的現在時間
				// public static long currentTimeMillis()方法返回毫秒
				time.setTimeInMillis(System.currentTimeMillis());
				// 重畫
				repaint();
			}
		 @Override
		 protected void paintComponent(Graphics g) {
			 super.paintComponent(g);
			 Graphics2D g2 = (Graphics2D)g;  
			 secend = time.get(Calendar.SECOND);//使用Calendar方法取得時間
			 minute = time.get(Calendar.MINUTE);
			 hour = time.get(Calendar.HOUR);
			 g2.setColor(Color.WHITE);
			 g2.drawLine(ceneterX, ceneterY, (int)(ceneterX+100*Math.sin(secend*Math.PI/30)), 
					 (int)(ceneterY-100*Math.cos(secend*Math.PI/30)));
			 g2.setColor(Color.YELLOW);
			 g2.drawLine(ceneterX, ceneterY, (int) (ceneterX + 80 * Math.sin(minute * Math.PI / 30)),
						(int) (ceneterY - 80 * Math.cos(minute * Math.PI / 30)));
			 g2.setColor(Color.RED);
			 g2.drawLine(ceneterX, ceneterY, (int) (ceneterX + 60 * Math.sin((hour + minute / 60.0) * Math.PI / 6)),
						(int) (ceneterY - 60 * Math.cos((hour + minute / 60.0) * Math.PI / 6)));
			 paintnumber(g);
		 }
		 public void paintnumber(Graphics g2){
			 for(int i=0;i<12;i++){
			 g2.setColor(Color.BLACK);
			 g2.drawString(number[i],(int)(ceneterX+135*Math.sin(i*Math.PI/6))-5, 
					 (int)(ceneterY-135*Math.cos(i*Math.PI/6))+5);
			 }
			 g2.setColor(Color.BLUE);
				for (int i = 0; i < 60; i++) {
					g2.drawLine((int) (ceneterX - 110 * Math.cos(i * Math.PI / 30)), (int) (ceneterY + 110 * Math.sin(i * Math.PI / 30)),
							(int) (ceneterX - 120 * Math.cos(i * Math.PI / 30)), (int) (ceneterY + 120 * Math.sin(i * Math.PI / 30)));
				}
			 
		 }
		 
	}

	public static void main(String[] args) {
	 new FirstClock();	

	}
      
}
