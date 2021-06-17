package switch语句;


public class SwitchDemo {
	/*
	 * 分支语句到底使用if还是switch，要根据条件表达式的值来决定
	 * 如果条件表达式的值为Boolean型，选择if语句
	 * 如果条件表达式的值为数值型（byte/short/char/int），选用switch语句
	 */
	// 编写一个Java程序，判断变量x是奇数还是偶数
	public void M1(int x){
		int i = x%2;
		
		switch(i){//int值作为switch的条件判断
		case 0:
			System.out.println("偶数");
		    break;
		case 1:
			System.out.println("奇数");
			break;
		default:break;//前面都不满足才执行的语句块
		
		}
	}
	//根据输入的字符打印星期几
	public void M2(char c){
		switch(c){
		case 'M':
			System.out.println("星期一");
			break;
		case 'T':
			System.out.println("星期二");
			break;
		default:
			System.out.println("星期天");
				break;
		}
	}
	public static void main(String[] args){
		SwitchDemo sd = new SwitchDemo();
		sd.M1(12);
		sd.M2('T');
	}
}
