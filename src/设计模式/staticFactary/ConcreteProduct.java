package 设计模式.staticFactary;
/*
 *2016年8月26日	上午10:15:00
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class ConcreteProduct implements Product{

	@Override
	public void operation() {
		System.out.println("我是具体产品中的实现方法");
	}
}
