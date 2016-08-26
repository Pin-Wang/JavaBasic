package 设计模式.decorator;

import static org.junit.Assert.*;

/*
 *2016年8月26日	下午11:11:49
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class Test {

	@org.junit.Test
	public void test() {
		Component c1=new ConcreteComponent("hello world");
		//装饰c1,两边加上外框
		Component c2=new ConcreteDecoratorA(c1, '|');
		//装饰c2，将上下加上字符
		Component c3=new ConcreteDecoratorB(c2);
		c1.getText();
		System.out.println();
		c2.getText();
		System.out.println();
		c3.getText();
		System.out.println();
		//一层一层地装饰
		Component c4=new ConcreteDecoratorB(
				new ConcreteDecoratorA(
						new ConcreteDecoratorB(new ConcreteComponent("the most inner string")),'#'));
		c4.getText();
	}
}
