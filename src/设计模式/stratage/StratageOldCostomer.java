package 设计模式.stratage;
/*
 *2016年8月25日	下午9:40:47
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class StratageOldCostomer implements Stratage{

	//针对老顾客，老顾客9.5折
	@Override
	public double getPrive(double price) {
		// TODO Auto-generated method stub
		return price*0.95;
	}

}
