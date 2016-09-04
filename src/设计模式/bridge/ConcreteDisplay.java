package 设计模式.bridge;
/*
 *2016年9月4日	下午3:20:20
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class ConcreteDisplay implements DisplayImp{
	String str;
	public  ConcreteDisplay(String str) {
		this.str=str;
	}
	
	@Override
	public void rawOpen() {
		System.out.print("+");
		prinLine();
		System.out.println("+");
	}

	@Override
	public void rawPrint() {
		System.out.println(str);
	}

	@Override
	public void rawClose() {
		System.out.print("+");
		prinLine();
		System.out.println("+");
	}
	
	public void prinLine(){
		for(int i=0;i<str.length();i++){
			System.out.print("-");
		}
	}

}
