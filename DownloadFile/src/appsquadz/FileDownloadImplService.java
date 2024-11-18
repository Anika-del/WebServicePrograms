
package appsquadz;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "FileDownloadImplService", targetNamespace = "http://appsquadz/", wsdlLocation = "http://localhost:7001/DownloadFile/df?wsdl")
public class FileDownloadImplService
    extends Service
{

    private final static URL FILEDOWNLOADIMPLSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(appsquadz.FileDownloadImplService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = appsquadz.FileDownloadImplService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:7001/DownloadFile/df?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:7001/DownloadFile/df?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        FILEDOWNLOADIMPLSERVICE_WSDL_LOCATION = url;
    }

    public FileDownloadImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FileDownloadImplService() {
        super(FILEDOWNLOADIMPLSERVICE_WSDL_LOCATION, new QName("http://appsquadz/", "FileDownloadImplService"));
    }

    /**
     * 
     * @return
     *     returns FileDownloadImpl
     */
    @WebEndpoint(name = "FileDownloadImplPort")
    public FileDownloadImpl getFileDownloadImplPort() {
        return super.getPort(new QName("http://appsquadz/", "FileDownloadImplPort"), FileDownloadImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FileDownloadImpl
     */
    @WebEndpoint(name = "FileDownloadImplPort")
    public FileDownloadImpl getFileDownloadImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://appsquadz/", "FileDownloadImplPort"), FileDownloadImpl.class, features);
    }

}
