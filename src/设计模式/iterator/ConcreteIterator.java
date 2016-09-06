package 设计模式.iterator;
/*
 *2016年9月5日	下午5:13:01
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class ConcreteIterator implements Iterator{
	private int index=0;
	private BookShelf bShelf;
	public ConcreteIterator(BookShelf bShelf) {
		this.bShelf=bShelf;
	}
	
	@Override
	public boolean hasNext() {
		if(index<bShelf.getShelf().size()){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public Book next() {
		Book book=bShelf.getShelf().get(index);
		index++;
		return book;
	}

}
