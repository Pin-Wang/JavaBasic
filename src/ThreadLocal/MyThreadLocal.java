package ThreadLocal;
/*
 *2016年8月28日	下午3:57:17
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/

import java.util.concurrent.ConcurrentHashMap;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class MyThreadLocal<T> {
	private ConcurrentHashMap<Thread, T> map=new ConcurrentHashMap<>();
	//initialValue()
	protected T initialValue(){
		//返回null，由子类指定初始值
		return null;
	}
	
	//set()
	public void set(T value){
		map.put(Thread.currentThread(), value);
	}
	//get()
	public T get(){
		if(!map.containsKey(Thread.currentThread())){
			T value=initialValue();
			map.put(Thread.currentThread(), value);
		}
		return map.get(Thread.currentThread());
	}
	//remove()
	public void remove(){
		map.remove(Thread.currentThread());
	}

}
