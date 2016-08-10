package 设计模式;
/*
 *2016年8月10日	下午8:49:45
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/


public class SingleTon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//单例模式

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

