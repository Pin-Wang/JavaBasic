
package 设计模式.singleTon;
/*
 *2016年8月10日	下午8:49:45
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/


public class SingleTon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single_d s1=Single_d.getInstance();
		Single_d s2=Single_d.getInstance();
		System.out.println(s1==s2);
	}

}


//单例模式（双重锁检查）
class Single_d{
	private static Single_d Instance;
	//构造器私有化
	private Single_d(){}
	//静态公开方法返回实例
	public static Single_d getInstance(){
		if(Instance==null){
			synchronized(Single_d.class){
				if(Instance==null){
					Instance=new Single_d();
				}
			}
		}
		return Instance;
	}
}

//单例模式(内部类实现)
class Single{
	//将构造器变为私有
	private Single(){
		
	}
	//内部类
	private static class SingleHolder{
		private static final Single Instance=new Single();
	}
	public static Single getInstance(){
		return SingleHolder.Instance;
	}
}

