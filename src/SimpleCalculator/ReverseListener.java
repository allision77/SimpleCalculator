package SimpleCalculator;

import java.awt.event.ActionEvent;
import java.util.LinkedList;

import javax.swing.JTextField;
/*
 * ���+-/���෴���������¼�����������
 */


public class ReverseListener extends BaseListener{
	//���췽��
	
	public ReverseListener(LinkedList<String> list, JTextField resultShow) {
		// TODO Auto-generated constructor stub
		super(list,resultShow);
	}
	/*
	 * ���෴�����¼���������
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch (list.size()) {
		case 1:{
			String number1 = list.getFirst();
			try {
				double d = Double.parseDouble(number1);
				d = -1*d;
				String str = String.valueOf(d);
				list.set(0, str);
				resultShow.setText(str);
				
				
			} catch (Exception ex) {
				// TODO: handle exception
				throw new RuntimeException(ex);
			}
			
		}
			
			break;
		case 3:{
			String number2 = list.getLast();
			try {
				double d = Double.parseDouble(number2);
				d = -1*d;
				String str = String.valueOf(d);
				list.set(2, str);
				resultShow.setText(str);
				
				
			} catch (Exception ex) {
				// TODO: handle exception
				throw new RuntimeException(ex);
			}
		}
		break;

		default:
			break;
		}


	}
	
}
