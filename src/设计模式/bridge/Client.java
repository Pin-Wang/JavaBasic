package 设计模式.bridge;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 *2016年9月4日	下午3:29:46
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class Client {

	@Test
	public void test() {
		Display display1=new Display(new ConcreteDisplay("我是桥接模式"));
		Display display2=new Display(new ConcreteDisplay("我是桥接模式"));
		CountDisplay display3=new CountDisplay(new ConcreteDisplay("我是桥接模式"));
	    display1.display();
	    display2.display();
	    display3.countPrint(4);
		
	}

}
