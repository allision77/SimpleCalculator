package SimpleCalculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class SimpleCalculator extends JFrame{
	
	//��������������Ҫ��ȫ�ֱ���
	//���ְ�ť���飬���ְ�ť�е����ְ���1��2��3��������0
	private NumberBtn numberBtn[];
	private OperationBtn operationBtn[];
	private JButton point,sign,backspace,equals,zero,sin,sqrt,reci;
	//��ʾ��ǰ������
	private JTextField txtResult;
	//����������ŵ�һ����������������ź͵ڶ���������
	private LinkedList<String> numList;
	//������ActionEvent�¼�
	private NumberListener numberListener;
	private OperationListener operationListener;
	private BackspaceListener backspaceListener;
	private ClearListener clearListener;
	private EqualListener equalListener;
	private PointListener pointListener;
	private ReverseListener reverseListener;
	private SinListener sinListener;
	private SqrtListener sqrtListener;
	
	private ReciprocalListener reciprocalListener;
	/**
	 * ���췽������ɴ��ڵĳ�ʼ��
	 */
	
	public SimpleCalculator() {
		// TODO Auto-generated constructor stub
		this.setTitle("������");
		this.numList=new LinkedList<String>();
		//��ʾ�����
		this.txtResult = new JTextField(10);
		this.txtResult.setHorizontalAlignment(JTextField.RIGHT);
		this.txtResult.setForeground(Color.blue);
		this.txtResult.setFont(new Font("TimesRoman", Font.BOLD, 20));
		this.txtResult.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
		this.txtResult.setEditable(false);
		this.txtResult.setBackground(Color.white);
		//���ְ�ť
		this.numberBtn = new NumberBtn[10];
		this.numberListener = new NumberListener(this.numList,this.txtResult);
		for(int i = 0;i<=9;i++){
			this.numberBtn[i] = new NumberBtn(i);
			this.numberBtn[i].setFont(new Font("Arial", Font.BOLD, 18));
			this.numberBtn[i].addActionListener(this.numberListener);
			
		}
		//������ť
		this.operationBtn = new OperationBtn[4];
		this.operationListener = new OperationListener(this.numList,this.txtResult);
		String calculator[]={"+","-","*","/"};
		for(int i = 0;i<4;i++){
			this.operationBtn[i] = new OperationBtn(calculator[i]);
			this.operationBtn[i].setFont(new Font("Arial", Font.BOLD, 18));
			this.operationBtn[i].addActionListener(this.operationListener);
			
		}
		//С���㣬�Ⱥ��Լ�������ť
		this.sin = new JButton("sin");
		this.sinListener = new SinListener(this.numList, this.txtResult);
		this.sin.addActionListener(this.sinListener);
		this.sqrt = new JButton("sqrt");
		this.sqrtListener = new SqrtListener(this.numList,this.txtResult);
		this.sqrt.addActionListener(this.sqrtListener);
		this.sign = new JButton("+/-");
		this.reverseListener = new ReverseListener(this.numList,this.txtResult);
		this.sign.addActionListener(this.reverseListener);
		this.equals = new JButton("=");
		this.equalListener = new EqualListener(this.numList, this.txtResult);
		this.equals.addActionListener(this.equalListener);
		
		this.point = new JButton(".");
		this.pointListener = new PointListener(this.numList, this.txtResult);
		this.point.addActionListener(this.pointListener);
		
		this.reci = new JButton("1/x");
		this.reverseListener = new ReverseListener(this.numList, this.txtResult);
		this.reci.addActionListener(this.reverseListener);
		
		//�˸�����Ⱥż�������
		this.backspace = new JButton("�˸�");
		this.backspaceListener = new BackspaceListener(this.numList,this.txtResult);
		this.backspace.addActionListener(this.backspaceListener);
	    this.backspace.setFont(new Font("΢���ź�", Font.BOLD, 16));
	    
	    this.zero = new JButton("����");
	    this.clearListener = new ClearListener(this.numList,this.txtResult);
	    this.zero.addActionListener(this.clearListener);
	    this.zero.setFont(new Font("΢���ź�", Font.BOLD, 16));
	    this.zero.setForeground(Color.green);
	    
	    this.backspace.setForeground(Color.green);
	    this.equals.setForeground(Color.red);
	    this.sin.setForeground(Color.blue);
	    this.sign.setForeground(Color.blue);
	    this.point.setForeground(Color.blue);
	    this.sqrt.setForeground(Color.blue);
	    this.reci.setForeground(Color.blue);
	    JPanel panelDown,panelUp;
	    
	    //���ڵ���Ʒ�Ϊ������
	    panelUp = new JPanel(new BorderLayout());
	    panelUp.add(this.txtResult,BorderLayout.CENTER);
	    //���ִ�������㴰�ڵİڷ�
	    panelDown = new JPanel();
	    panelDown.setLayout(new BorderLayout());
	    JPanel NorthInRight = new JPanel();
	    JPanel centerInRight = new JPanel();
	    JPanel SouthInRight = new JPanel();
	    panelDown.add(NorthInRight,BorderLayout.NORTH);
	    NorthInRight.setLayout(new GridLayout(1,2,30,30));
	    NorthInRight.add(zero);
	    NorthInRight.add(backspace);
	    
	    //
	    JSplitPane splitl = new JSplitPane(JSplitPane.VERTICAL_SPLIT,NorthInRight,centerInRight);
	    panelDown.add(splitl, BorderLayout.NORTH);
	    panelDown.add(centerInRight, BorderLayout.WEST);
	    centerInRight.setLayout(new GridLayout(4,3,10,8));
	    centerInRight.add(numberBtn[7]);
	    centerInRight.add(numberBtn[8]);
	    centerInRight.add(numberBtn[9]);
	    centerInRight.add(numberBtn[4]);
	    centerInRight.add(numberBtn[5]);
	    centerInRight.add(numberBtn[6]);
	    centerInRight.add(numberBtn[1]);
	    centerInRight.add(numberBtn[2]);
	    centerInRight.add(numberBtn[3]);
	    centerInRight.add(numberBtn[0]);
	    centerInRight.add(point);
	    centerInRight.add(reci);
	    //
	    JSplitPane split2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,centerInRight,SouthInRight);
	    panelDown.add(split2, BorderLayout.CENTER);
	    panelDown.add(SouthInRight,BorderLayout.EAST);
	    SouthInRight.setLayout(new GridLayout(4,2,10,8));
	    SouthInRight.add(operationBtn[0]);
	    SouthInRight.add(sin);
	    SouthInRight.add(operationBtn[1]);
	    SouthInRight.add(sqrt);
	    SouthInRight.add(operationBtn[2]);
	    SouthInRight.add(sign);
	    SouthInRight.add(operationBtn[3]);
	    SouthInRight.add(equals);
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT,panelUp,panelDown);
	    add(split,BorderLayout.CENTER);
	    setVisible(true);
	    setBounds(500,350,450,280);
	    validate();
	    
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SimpleCalculator();

	}

}
