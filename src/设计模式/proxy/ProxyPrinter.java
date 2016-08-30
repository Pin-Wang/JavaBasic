package 设计模式.proxy;

import javax.naming.InitialContext;

/*
 *2016年8月30日	下午2:57:36
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class ProxyPrinter implements Printable{
	private String name;
	private Printer printer;
	public ProxyPrinter(String name) {
		this.name=name;
	}
	
	@Override
	public synchronized void setName(String name) {
		if(printer!=null){
			printer.setName(name);;
		}
		this.name=name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void print(String msg) {
		initial();
		printer.print(msg);
	}
	
	public synchronized void initial(){
		if(printer==null){
			printer=new Printer(name);
		}
	}

}
