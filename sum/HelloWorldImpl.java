package my;
import javax.jws.WebService;
@WebService
public class HelloWorldImpl
{
	int x;
	int y;
	public void setValue(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public int sum()
	{
		return x+y;
	}
}