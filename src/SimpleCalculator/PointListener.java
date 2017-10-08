package SimpleCalculator;

import java.awt.event.ActionEvent;
import java.util.LinkedList;

import javax.swing.JTextField;

/*
 * 完成小数点按钮的监听事件
 */

public class PointListener extends BaseListener{
	//构造方法，初始化对象
	public PointListener(LinkedList<String>list,JTextField resultShow) {
		// TODO Auto-generated constructor stub
		super(list,resultShow);
	}
	//小数点事件的监听处理
	public void actionPerformed(ActionEvent e){
		String point = e.getActionCommand();
		
		switch (list.size()) {
		case 1:{
			String num = list.getFirst();
			String s = null;
			if(num.indexOf(point)==-1){
				s = num.concat(point);
				list.set(0, s);
				
			}else {
				s = num;
			}
			list.set(0, s);
			resultShow.setText(s);
		}
			
			break;
			case 2:{
				String num = list.getLast();
				String s = null;
				if(num.indexOf(point)==-1){
					s = num.concat(point);
					list.set(2, s);
				}else {
					s = num;
				}
				resultShow.setText(s);
			}
			break;

		default:
			break;
		}
	}

}
