package 设计模式.decorator;
/*
 *2016年8月26日	下午10:47:56
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/

//装饰者的具体实现A（将文本上下加上+-字符）
public class ConcreteDecoratorB extends Decorator {
	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	@Override
	public int getRows() {
		return 2 + component.getRows();
	}

	@Override
	public int getCols() {
		return 2 + component.getCols();
	}

	@Override
	public String getRowText(int row) {
		//输出装饰后的文本的第一行或者最后一行
		if (row == 0 || row == component.getRows() + 1) {
			return "+"+makeLine(component.getCols())+"+";
		}
		else{
			return component.getRowText(row-1);
		}
	}

	//动态添加功能函数
	public String makeLine(int cols) {
		StringBuilder stringBuilder=new StringBuilder();
		for(int i=0;i<cols;i++){
			stringBuilder.append("-");
		}
		return stringBuilder.toString();
	}

}
