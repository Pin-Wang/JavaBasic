package ThreadLocal;

/*
 *2016年8月28日	下午2:46:10
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class Test {
	//不使用ThreadLocal
	//private static NumberConstruct numberConstruct=new ConcreteNumberConstructA();
	
	//使用ThreadLocal
	//private static NumberConstruct numberConstruct=new ConcreteNumberConstructB();
	
	
	//使用自己的MyThreadLocal
	private static NumberConstruct numberConstruct=new ConcreteNumberConstructC();
	public static void main(String[] args){
		//每个线程获取三个序列号
		Runnable task=new Runnable() {
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println(Thread.currentThread().getName()+" "+numberConstruct.get());
				}
			}
		};
		//开启是哪个线程
		Thread t1=new Thread(task);
		Thread t2=new Thread(task);
		Thread t3=new Thread(task);
		t1.start();
		t2.start();
		t3.start();
	}
	
}

