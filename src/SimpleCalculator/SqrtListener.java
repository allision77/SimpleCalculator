package SimpleCalculator;

import java.awt.event.ActionEvent;
import java.util.LinkedList;

import javax.swing.JTextField;

/*
 * 求开平方函数的事件处理
 */

public class SqrtListener extends BaseListener{
	//构造方法

	public SqrtListener(LinkedList<String> list, JTextField resultShow) {
		// TODO Auto-generated constructor stub
		super(list,resultShow);
	}
	//开平方函数的事件监听处理
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch (list.size()) {
		case 1:
			
		case 2:{
			String numOne = list.getFirst();
			try {
				double d = Double.parseDouble(numOne);
				double result = Math.sqrt(d);//调用math类的sqrt方法
				String str = String.valueOf(result);
				list.set(0, str);
				resultShow.setText(str);
				if(list.size()==2){
					list.removeLast();//移掉运算符号
					
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
				list.removeLast();//移掉第二个运算符
				list.removeLast();//移掉运算符号
				
				
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
