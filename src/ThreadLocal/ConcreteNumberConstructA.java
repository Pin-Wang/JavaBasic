package ThreadLocal;
/*
 *2016年8月28日	下午2:49:34
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class ConcreteNumberConstructA implements NumberConstruct{
	private volatile  int n=0;
	@Override
	public  synchronized int get() {
		return ++n;
	}
}
