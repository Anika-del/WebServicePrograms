package test1;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import my.HelloWorldImpl;
import my.HelloWorldImplService;
public class Test{
public static void main(String... s)
{
	HelloWorldImplService hm=new HelloWorldImplService();
	try
	{
		HelloWorldImpl ht=hm.getHelloWorldImplPort();
		ht.setValue(5,10);
		System.out.println(ht.sum());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

}