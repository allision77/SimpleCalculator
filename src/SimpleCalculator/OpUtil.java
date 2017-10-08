package SimpleCalculator;

/*
 * 封装四则运算的业务逻辑
 */

public class OpUtil {
	//根据运算符和两个数字得到对应的计算结果
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
