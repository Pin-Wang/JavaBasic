package 设计模式.stratage;
/*
 *2016年8月25日	下午9:40:47
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class StratageLargeCostomer implements Stratage{

	//针对企业顾客，企业顾客8.5折
	@Override
	public double getPrive(double price) {
		// TODO Auto-generated method stub
		return price*0.85;
	}

}
