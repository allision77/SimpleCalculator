package SimpleCalculator;

import java.awt.Color;

import javax.swing.JButton;

/*
 * �������������������ť����
 */
public class OperationBtn extends JButton{
	//��Ա������ȷ���������Ĳ�����ť�������Ӽ��˳��Ȳ���
	String operateStr;
	/*
	 * ���췽��
	 */
	public OperationBtn(String str) {
		// TODO Auto-generated constructor stub
		operateStr = str;
		//����������ɫ
		this.setText(str);
		setForeground(Color.RED);
	}
	/*
	 * ���ø÷��������������е��ַ�
	 */
	public String getOpStr(){
		return operateStr;
	}

}
