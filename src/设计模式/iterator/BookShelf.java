package 设计模式.iterator;

import java.util.ArrayList;

/*
 *2016年9月5日	下午5:08:24
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class BookShelf implements Aggregate{

	//装书的容器
	private ArrayList<Book> shelf=new ArrayList<Book>();
	
	public ArrayList<Book> getShelf() {
		return shelf;
	}

	public void setShelf(ArrayList<Book> shelf) {
		this.shelf = shelf;
	}

	@Override
	public void add(Book book) {
		shelf.add(book);
	}

	@Override
	public void delete(Book book) {
		shelf.remove(shelf.indexOf(book));
	}

	@Override
	public Iterator iterator() {
		return new ConcreteIterator(this);
	}

}
