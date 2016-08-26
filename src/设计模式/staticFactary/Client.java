package 设计模式.staticFactary;
/*
 *2016年8月26日	上午10:48:05
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class Client {

	public static void main(String[] args) {
		Product product=Factory.getProduct();
		product.operation();
	}
}
