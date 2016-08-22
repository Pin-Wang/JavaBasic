package 泛型;
/*
 *2016年8月22日	下午6:33:40
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class Pair<F,S>{
	private F first;
	private S second;
	
	public F getFirst() {
		return first;
	}
	public void setFirst(F first) {
		this.first = first;
	}
	public S getSecond() {
		return second;
	}
	public void setSecond(S second) {
		this.second = second;
	}
}
