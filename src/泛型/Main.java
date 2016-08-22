package 泛型;

import java.util.ArrayList;
import java.util.List;

/*
 *2016年8月22日	下午6:33:00
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//可以向Object的list中添加String（Object的子类）对象
	/*	ArrayList<Object> list=new ArrayList<Object>();
       String string="我是String";
       list.add(string);*/
		
		Single<? extends Object> pair=new Single<String>(); 
		Object object=new Object();
		//子类型限定符不能使用setter方法，但是可以使用getter方法
		//pair.setE(object);
		pair.getE();
		
		//父类型限定符能使用setter方法，但是不可以使用getter方法
		//无类型限定符都不能使用。
	}

}
