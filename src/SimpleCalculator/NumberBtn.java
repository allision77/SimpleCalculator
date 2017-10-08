package SimpleCalculator;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * 数字按钮设计类
 * @param i
 */

public class NumberBtn extends JButton{
	
	public int number;
	/**
	 * 构造方法
	 * @param i
	 */

	public NumberBtn(int number) {
		// TODO Auto-generated constructor stub
		this.number = number;
		this.setText(""+number);
		setForeground(Color.blue);//设置字体颜色
	}
	
	/**
	 * 调用该方法其所含的数字
	 */
	public int getNumber(){
		return number;
	}
	public void addActionListener(NumberListener numberListener) {
		// TODO Auto-generated method stub
		
	}
	
}
