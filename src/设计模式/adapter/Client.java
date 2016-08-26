package 设计模式.adapter;
/*
 *2016年8月26日	上午11:45:55
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class Client {

	public static void main(String[] args) {
		Adaptee adaptee=new Adaptee();
		Target target=new Adapter(adaptee);
		target.sayH();
		
	}

}
