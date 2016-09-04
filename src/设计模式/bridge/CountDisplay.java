package 设计模式.bridge;
/*
 *2016年9月4日	下午3:23:57
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class CountDisplay extends Display{
	public CountDisplay(DisplayImp implement){
		super(implement);
	}
	
	public void countPrint(int count){
		open();
		for(int i=0;i<count;i++){
			print();
		}
		close();
	}
}
