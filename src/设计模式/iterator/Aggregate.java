package 设计模式.iterator;
/*
 *2016年9月5日	下午5:02:50
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public interface Aggregate {
	void add(Book book);
	void delete(Book book);
	Iterator iterator();
}	
