package SimpleCalculator;

import java.awt.event.ActionEvent;
import java.util.LinkedList;

import javax.swing.JTextField;

/*
 * �Ⱥ��¼��ļ�����
 */
public class EqualListener extends BaseListener{
	//���췽��
	public EqualListener(LinkedList<String>list,JTextField resultShow) {
		// TODO Auto-generated constructor stub
		super(list,resultShow);
		
		
	}
	//�Ⱥ��¼��ļ�������
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch (list.size()) {
		case 1:{
			String num = list.getFirst();
			resultShow.setText(""+num);
		}
			break;

		case 2:{
			String num = list.getFirst();
			String op = list.get(1);
			try {
				double n1 = Double.parseDouble(num);
				double n2 = Double.parseDouble(num);
				double result = 0;
				result = OpUtil.getResult(op, n1, n2);
				resultShow.setText(""+result);
				list.set(0, ""+result);
				
			} catch (Exception ex) {
				// TODO: handle exception
				throw new RuntimeException(ex);
			}
		}
		break;
		case 3:{
			String numOne = list.getFirst();
			String op = list.get(1);
			String numTwo = list.getLast();
			try {
				double n1 = Double.parseDouble(numOne);
				double n2 = Double.parseDouble(numTwo);
				double result = 0;
				result= OpUtil.getResult(op, n1, n2);
				resultShow.setText(""+result);
				list.set(0, ""+result);
				list.removeLast();//�Ƴ����ڶ���������
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
