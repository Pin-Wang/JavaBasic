package 设计模式.proxy;
/*
 *2016年8月30日	下午2:55:12
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class Printer implements Printable{
	private String name;
	public Printer(String name){
		this.name=name;
	}
	
	@Override
	public void setName(String name) {
		this.name=name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void print(String msg) {
		System.out.println(name+" 正在打印"+msg);
	}

}
