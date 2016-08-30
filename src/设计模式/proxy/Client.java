package 设计模式.proxy;
/*
 *2016年8月30日	下午3:03:02
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class Client {

	public static void main(String[] args) {
		Printable printable=new ProxyPrinter("打印机1");
		printable.print("需要打印的文本");
		printable.setName("打印机2");
		printable.print("文本");
	}
}
