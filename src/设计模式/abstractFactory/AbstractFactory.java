package 设计模式.abstractFactory;
/*
 *2016年9月2日	上午10:29:07
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public interface AbstractFactory {
	CpuAPI createCPU();
	MainBoardAPI createMainBoardAPI();
}
