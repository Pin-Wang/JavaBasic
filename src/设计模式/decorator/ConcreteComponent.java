package 设计模式.decorator;
/*
 *2016年8月26日	下午10:41:34
 *@Author Pin-Wang
 *@E-mail 1228935432@qq.com
*/

//具体的Component实现类
public class ConcreteComponent extends Component{
    private String string;
    public ConcreteComponent(String string){
    	this.string=string;
    }
	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	@Override
	public int getRows() {
		return 1;
	}

	@Override
	public int getCols() {
		return string.length();
	}

	@Override
	public String getRowText(int row) {
		if(row==0){
			return string;
		}
		else{
			return null;
		}
	}
}
