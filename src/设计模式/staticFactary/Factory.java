package 设计模式.staticFactary;
/*
 *2016年8月26日	上午10:47:01
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class Factory {
	public static Product getProduct(){
		return new ConcreteProduct();
	}
}
