package 设计模式.decorator;
/*
 *2016年8月26日	下午10:47:56
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/

//装饰者的具体实现A（将文本两边加上指定字符）
public class ConcreteDecoratorA extends Decorator{
	//装饰字符
	private char decorateC;
	public ConcreteDecoratorA(Component component,char c) {
		super(component);
		decorateC=c;
	}
	@Override
	public int getRows() {
		return component.getRows();
	}

	@Override
	public int getCols(){
		return component.getCols();
	}

	@Override
	public String getRowText(int row) {
		return decorateC+component.getRowText(row)+decorateC;
	}

}
