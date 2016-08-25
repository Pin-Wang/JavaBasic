package 设计模式.stratage;
/*
 *2016年8月25日	下午9:40:47
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class StratageNewCostomer implements Stratage{

	//针对新顾客，新顾客得到的是原价
	@Override
	public double getPrive(double price) {
		// TODO Auto-generated method stub
		return price;
	}

}
