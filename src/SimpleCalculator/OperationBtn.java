package SimpleCalculator;

import java.awt.Color;

import javax.swing.JButton;

/*
 * 设置运算符，操作符按钮的类
 */
public class OperationBtn extends JButton{
	//成员变量，确定所创建的操作按钮，包括加减乘除等操作
	String operateStr;
	/*
	 * 构造方法
	 */
	public OperationBtn(String str) {
		// TODO Auto-generated constructor stub
		operateStr = str;
		//设置字体颜色
		this.setText(str);
		setForeground(Color.RED);
	}
	/*
	 * 调用该方法返回其所含有的字符
	 */
	public String getOpStr(){
		return operateStr;
	}

}
