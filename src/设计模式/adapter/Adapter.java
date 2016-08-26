package 设计模式.adapter;
/*
 *2016年8月26日	上午11:27:01
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class Adapter implements Target{
	Adaptee adaptee;
	public Adapter(Adaptee adaptee) {
		this.adaptee=adaptee;
	}
	
	@Override
	public void sayH() {
		adaptee.say();
	}
	
}
