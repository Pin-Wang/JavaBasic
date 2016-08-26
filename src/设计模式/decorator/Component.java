package 设计模式.decorator;
/*
 *2016年8月26日	下午10:32:11
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public abstract class Component {
	//获取行数
	public abstract int getRows();
	//获取列数
	public abstract int getCols();
	//获取第row行的文本
	public abstract String getRowText(int row);
	//获取所有文本
	public void getText(){
		for(int i=0;i<getRows();i++){
			System.out.println(getRowText(i));
		}
	}
}
