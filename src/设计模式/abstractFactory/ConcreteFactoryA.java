package 设计模式.abstractFactory;
/*
 *2016年9月2日	上午10:31:01
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class ConcreteFactoryA implements AbstractFactory{

	@Override
	//intell cpu
	public CpuAPI createCPU() {
		return new IntellCpu(1156);
	}

	//技嘉主板
	@Override
	public MainBoardAPI createMainBoardAPI() {
		return new GigaMainboard(1156);
	}
	

}
