package SimpleCalculator;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * ���ְ�ť�����
 * @param i
 */

public class NumberBtn extends JButton{
	
	public int number;
	/**
	 * ���췽��
	 * @param i
	 */

	public NumberBtn(int number) {
		// TODO Auto-generated constructor stub
		this.number = number;
		this.setText(""+number);
		setForeground(Color.blue);//����������ɫ
	}
	
	/**
	 * ���ø÷���������������
	 */
	public int getNumber(){
		return number;
	}
	public void addActionListener(NumberListener numberListener) {
		// TODO Auto-generated method stub
		
	}
	
}
