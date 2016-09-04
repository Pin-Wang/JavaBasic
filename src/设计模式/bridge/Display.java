package 设计模式.bridge;
/*
 *2016年9月4日	下午3:18:22
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class Display {
	DisplayImp implmentor;
	public Display(DisplayImp implmentor) {
		this.implmentor=implmentor;
	}
	
	public void open(){
		implmentor.rawOpen();
	}
	
	public void print(){
		implmentor.rawPrint();
	}
	
	public void close(){
		implmentor.rawClose();
	}
	
	public void display(){
		open();
		print();
		close();
	}

}
