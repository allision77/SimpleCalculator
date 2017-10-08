package SimpleCalculator;

import java.awt.event.ActionEvent;
import java.util.LinkedList;

import javax.swing.JTextField;

/*
 * sin�����ļ����¼�����
 */

public class SinListener extends BaseListener{
	//���췽��
	public SinListener(LinkedList<String>list,JTextField resultShow) {
		// TODO Auto-generated constructor stub
		super(list,resultShow);
	}
	//�����Һ���sin���¼�����
	public void actionPerformed(ActionEvent e){
		switch (list.size()) {
		case 1:
		case2:{
			String numOne =list.getFirst();
			try{
				double x = Double.parseDouble(numOne);
				double result = Math.sin(x);
				String str = String.valueOf(result);
				list.set(0, str);
				resultShow.setText(str);
				if(list.size()==2)
					list.removeLast();
				}catch (Exception ex) {
					// TODO: handle exception
					throw new RuntimeException(ex);
				}
			
		}
			break;
		case 3:{
			String numTwo = list.getLast();
			try {
				double x = Double.parseDouble(numTwo);
				double result = Math.sin(x);
				String str = String.valueOf(result);
				list.set(0, str);
				resultShow.setText(str);
				list.removeLast();
				list.removeLast();
				
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
