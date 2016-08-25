package 设计模式.stratage;
/*
 *2016年8月25日	下午9:52:59
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//建立需要用到的策略的实例,根据需要更换实际策略
		Stratage stratage=new StratageLargeCostomer();
		Context context=new Context(stratage);
		System.out.println(context.getPrice(100));
		
	}

}
