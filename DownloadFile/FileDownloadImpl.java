package  appsquadz;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.jws.WebService;
import javax.xml.ws.soap.MTOM;
@MTOM
@WebService
public class FileDownloadImpl 
 {

public DataHandler downloadFile() {
	FileDataSource dataSource = new FileDataSource("e:\\manish123\\Servlet\\demoservlet\\files\\baby.jpg");
	DataHandler fileDataHandler = new DataHandler(dataSource);
	   return fileDataHandler;
	}
}