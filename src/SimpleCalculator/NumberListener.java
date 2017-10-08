package SimpleCalculator;

import java.awt.event.*;
import java.util.LinkedList;

import javax.swing.JTextField;
/*
 * 
 * ���ְ�ť�ļ����¼���
 */

public class NumberListener extends BaseListener{
	/*
	 * ���췽��
	 */
	

	public NumberListener(LinkedList<String>list, JTextField resultShow) {
		// TODO Auto-generated constructor stub
		super(list,resultShow);
	}
	//���ְ�ť��0123456789���ļ����¼�
	public void actionPerformed(ActionEvent e){
		NumberBtn b = (NumberBtn) e.getSource();
		switch (list.size()) {
		case 0:{
			int number = b.getNumber();
			list.add(""+number);
			resultShow.setText(""+number);
		}
			
			break;
			case 1:{
				int number = b.getNumber();
				String num = list.getFirst();
				String s = num.concat(""+number);
				list.set(0, s);
				resultShow.setText(s);
				
			}
			break;
			case 2:{
				int number = b.getNumber();
				list.add(""+number);
				resultShow.setText(""+number);
				
			}	
			break;
			case 3:{
				
				int number = b.getNumber();
				String num = list.getLast();
				String s = num.concat(""+number);
				list.set(2, s);
				resultShow.setText(s);
				
			}
			break;
			default:
			break;
		
		}
	}

}
