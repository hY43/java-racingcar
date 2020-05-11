package util;

public class ValidationUtils {
	public static boolean isEmpty(String targetString) {
		if("".equals(targetString) || targetString == null) {
			throw new IllegalArgumentException("������ �Է� �Ǿ����ϴ�. �Է� ���� Ȯ�����ּ���.");
		}
		return true;
	}
	
	public static boolean isOperator(String targetString) {
		if("+".equals(targetString)) {
			return true;
		}
		
		if("-".equals(targetString)) {
			return true;
		}
		
		if("*".equals(targetString)) {
			return true;
		}
		
		if("/".equals(targetString)) {
			return true;
		}
		
		throw new IllegalArgumentException("�����ڰ� �ƴ� ��ȣ�� �ԷµǾ����ϴ�. �Է� ���� Ȯ�����ּ���.");
	}
}
