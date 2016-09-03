package 设计模式.abstractFactory;
/*
 *2016年9月2日	上午10:20:38
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/

public class AMDCpu implements CpuAPI{
	Integer cpuPins;
	public AMDCpu(Integer pins) {
		cpuPins=pins;
	}
	@Override
	public void calculate() {
		System.out.println("AMD cpu 正在计算....."+"pins:"+cpuPins);
	}

}
