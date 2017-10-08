package SimpleCalculator;

import java.awt.event.ActionEvent;
import java.util.LinkedList;

import javax.management.RuntimeErrorException;
import javax.swing.JTextField;

/*
 * 运算符（加减乘除）的监听事件
 */
public class OperationListener extends BaseListener{
	
	//构造方法
	public OperationListener(LinkedList<String>list, JTextField resultShow) {
		// TODO Auto-generated constructor stub
		super(list,resultShow);
	}
	//运算符（加减乘除）的事件监听处理
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		OperationBtn b = (OperationBtn) e.getSource();
		switch (list.size()) {
		case 1:{
			String op = b.getOpStr();
			list.add(op);
		}
			
			break;
		case 2:{
			String op = b.getOpStr();
			list.set(1, op);
		}
		break;
		case 3:{
			String numOne = list.getFirst();
			String numTwo = list.getLast();
			String op = list.get(1);
			try {
				double n1 = Double.parseDouble(numOne);
				double n2 = Double.parseDouble(numTwo);
				double result = 0;
				
				result = OpUtil.getResult(op, n1, n2);
				String oper = b.getOpStr();
				list.clear();
				list.add(""+result);
				list.add(oper);
				resultShow.setText(""+result);
				
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
