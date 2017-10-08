package SimpleCalculator;

import java.awt.event.ActionEvent;
import java.util.LinkedList;

import javax.swing.JTextField;

/*
 * 退格按键的监听事件处理
 */

public class BackspaceListener extends BaseListener{
	/*
	 * 构造方法，初始化对象
	 */

	public BackspaceListener(LinkedList<String> list, JTextField resultShow) {
		// TODO Auto-generated constructor stub
		super(list,resultShow);
	}
	//退格按钮的事件监听处理
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch (this.list.size()) {
		case 1:{
			String num = (String)this.list.getFirst();
			if(num.length()>=1){
				num = num.substring(0,num.length()-1);
				this.list.set(0, num);
				resultShow.setText(num);
				
			}else {
				this.list.removeLast();
				resultShow.setText("0");
			}
		}
			
			break;
		case 3:{
			String num = (String)this.list.getLast();
			if(num.length()>=1){
				num = num.substring(0,num.length()-1);
				this.list.set(2, num);
				resultShow.setText(num);
			}else {
				this.list.removeLast();
				resultShow.setText("0");
			}
			}
		break;

		default:
			break;
		}
	}

}
