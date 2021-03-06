package ThreadLocal;
/*
 *2016年8月28日	下午2:49:34
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class ConcreteNumberConstructB implements NumberConstruct{
	private   ThreadLocal<Integer> n=new ThreadLocal<Integer>(){

		@Override
		protected Integer initialValue() {
			return 0;
		}};
	
	
	@Override
	public   int get() {
		n.set(n.get()+1);
		return n.get();
	}
}
