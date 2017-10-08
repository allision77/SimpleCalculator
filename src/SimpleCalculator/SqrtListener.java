package SimpleCalculator;

import java.awt.event.ActionEvent;
import java.util.LinkedList;

import javax.swing.JTextField;

/*
 * ��ƽ���������¼�����
 */

public class SqrtListener extends BaseListener{
	//���췽��

	public SqrtListener(LinkedList<String> list, JTextField resultShow) {
		// TODO Auto-generated constructor stub
		super(list,resultShow);
	}
	//��ƽ���������¼���������
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch (list.size()) {
		case 1:
			
		case 2:{
			String numOne = list.getFirst();
			try {
				double d = Double.parseDouble(numOne);
				double result = Math.sqrt(d);//����math���sqrt����
				String str = String.valueOf(result);
				list.set(0, str);
				resultShow.setText(str);
				if(list.size()==2){
					list.removeLast();//�Ƶ��������
					
				}
				
			} catch (Exception ex) {
				// TODO: handle exception
				throw new RuntimeException(ex);
			}
		}
			
			break;
		case 3:{
			String numTwo = list.getLast();
			try {
				double d = Double.parseDouble(numTwo);
				double result = Math.sqrt(d);
				String str = String.valueOf(result);
				list.set(0, str);
				resultShow.setText(str);
				list.removeLast();//�Ƶ��ڶ��������
				list.removeLast();//�Ƶ��������
				
				
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
