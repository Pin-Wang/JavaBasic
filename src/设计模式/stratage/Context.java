package 设计模式.stratage;

/*
 *2016年8月25日	下午9:20:58
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class Context {

	Stratage stratage;

	public Context(Stratage stratage) {
		this.stratage = stratage;
	}
	
	public double getPrice(double price){
		return stratage.getPrive(price);
	}

}
