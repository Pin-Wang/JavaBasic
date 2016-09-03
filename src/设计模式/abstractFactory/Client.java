package 设计模式.abstractFactory;

import static org.junit.Assert.*;

import java.nio.channels.NonWritableChannelException;

import javax.swing.border.AbstractBorder;

import org.junit.Test;

/*
 *2016年9月2日	上午10:35:51
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class Client {

	@Test
	public void test() {
		System.out.println("装机方案A");
		//装机模式1
		AbstractFactory schemalA=new ConcreteFactoryA();
		Engineer engineer=new Engineer(schemalA);
		engineer.makeAndUseComputer();
		
		System.out.println("装机方案B");
		//装机模式2
		AbstractFactory schemalB=new ConcreteFactoryB();
		engineer.setSchemal(schemalB);
		engineer.makeAndUseComputer();
	}

}
