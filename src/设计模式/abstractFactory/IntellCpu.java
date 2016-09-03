package 设计模式.abstractFactory;
/*
 *2016年9月2日	上午10:20:38
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class IntellCpu implements CpuAPI{
	Integer cpuPins;
	public IntellCpu(Integer pins) {
		cpuPins=pins;
	}
	@Override
	public void calculate() {
		System.out.println("Intell cpu 正在计算....."+"pins:"+cpuPins);
	}

}
