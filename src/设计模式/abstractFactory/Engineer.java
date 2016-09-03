package 设计模式.abstractFactory;

/*
 *2016年9月2日	上午10:39:15
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/
public class Engineer {
	AbstractFactory schemal;

	public Engineer(AbstractFactory schemal) {
		this.schemal = schemal;
	}

	public void setSchemal(AbstractFactory schemal) {
		this.schemal = schemal;
	}

	public void makeAndUseComputer(){
		CpuAPI cpu=schemal.createCPU();
		MainBoardAPI mainBoard=schemal.createMainBoardAPI();
		cpu.calculate();
		mainBoard.install();
	}

}
