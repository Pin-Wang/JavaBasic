package 设计模式.abstractFactory;
/*
 *2016年9月2日	上午10:31:01
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class ConcreteFactoryB implements AbstractFactory{

	@Override
	//AMD cpu
	public CpuAPI createCPU() {
		return new AMDCpu(939);
	}

	//微星主板
	@Override
	public MainBoardAPI createMainBoardAPI() {
		return new MSIMainboard(939);
	}
	

}
