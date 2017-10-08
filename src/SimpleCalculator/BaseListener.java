package SimpleCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JTextField;

public abstract class BaseListener implements ActionListener{
	protected LinkedList<String>list;
	protected JTextField resultShow;
	public BaseListener() {
	}
    public BaseListener(LinkedList<String>list,JTextField resultShow){
    	super();
    	this.list = list;
    	this.resultShow = resultShow;
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
