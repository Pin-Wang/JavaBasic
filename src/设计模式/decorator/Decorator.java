package 设计模式.decorator;
/*
 *2016年8月26日	下午10:45:26
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public abstract class Decorator extends Component{
	//拥有一个Component实例
	protected Component component;
	protected Decorator(Component component){
		this.component=component;
	}

}
