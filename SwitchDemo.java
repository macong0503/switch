package switch���;


public class SwitchDemo {
	/*
	 * ��֧��䵽��ʹ��if����switch��Ҫ�����������ʽ��ֵ������
	 * ����������ʽ��ֵΪBoolean�ͣ�ѡ��if���
	 * ����������ʽ��ֵΪ��ֵ�ͣ�byte/short/char/int����ѡ��switch���
	 */
	// ��дһ��Java�����жϱ���x����������ż��
	public void M1(int x){
		int i = x%2;
		
		switch(i){//intֵ��Ϊswitch�������ж�
		case 0:
			System.out.println("ż��");
		    break;
		case 1:
			System.out.println("����");
			break;
		default:break;//ǰ�涼�������ִ�е�����
		
		}
	}
	//����������ַ���ӡ���ڼ�
	public void M2(char c){
		switch(c){
		case 'M':
			System.out.println("����һ");
			break;
		case 'T':
			System.out.println("���ڶ�");
			break;
		default:
			System.out.println("������");
				break;
		}
	}
	public static void main(String[] args){
		SwitchDemo sd = new SwitchDemo();
		sd.M1(12);
		sd.M2('T');
	}
}
