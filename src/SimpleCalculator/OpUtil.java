package SimpleCalculator;

/*
 * ��װ���������ҵ���߼�
 */

public class OpUtil {
	//������������������ֵõ���Ӧ�ļ�����
	public static double getResult(String op,double n1,double n2){
		double result = 0;
		if(op.equals("+")){
			result = n1+n2;
		}else if (op.equals("-")) {
			result = n1-n2;
			
		}else if (op.equals("*")) {
			result = n1*n2;
			
		}else if (op.equals("/")) {
			result = n1/n2;
			
		}
		return result;
		
	}

}
