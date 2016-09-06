package 设计模式.iterator;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 *2016年9月5日	下午5:24:20
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class Client {

	@Test
	public void test() {
		Aggregate shelf=new BookShelf();
		Book booA=new Book("平凡的世界");
		Book booB=new Book("复活");
		Book booC=new Book("麦田的守望者");
		shelf.add(booA);
		shelf.add(booB);
		shelf.add(booC);
		Iterator iterator=shelf.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next().name);
		}
		
	}

}
