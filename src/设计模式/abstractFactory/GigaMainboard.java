package 设计模式.abstractFactory;
/*
 *2016年9月2日	上午10:24:25
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/


//技嘉主板
public class GigaMainboard implements MainBoardAPI{
	//插入cpu的接口pin数
	Integer pins ;
	public GigaMainboard(Integer pins) {
		this.pins=pins;
	}
	
	@Override
	public void install() {
		System.out.println("技嘉主板正在安装.....pin数："+pins);
	}
	
}
