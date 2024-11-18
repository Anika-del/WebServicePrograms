package client;
import java.io.FileOutputStream;
import appsquadz.FileDownloadImpl;
import appsquadz.FileDownloadImplService;
public class FileClient
{
public static void main(String[] args) throws Exception {
	    FileDownloadImplService service = new FileDownloadImplService();
	    FileDownloadImpl server = service.getFileDownloadImplPort();
		byte[] bytes = server.downloadFile();
		FileOutputStream fos = new FileOutputStream("e:/f2/my1.jpg");
		fos.write(bytes);
		fos.flush();
		fos.close();
		System.out.println("Download Completed");
	}
 }
//wsimport -keep -s src http://localhost:7002/DownloadFile/df?wsdl