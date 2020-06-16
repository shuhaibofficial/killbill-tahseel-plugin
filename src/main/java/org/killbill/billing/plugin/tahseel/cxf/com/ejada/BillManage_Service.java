package org.killbill.billing.plugin.tahseel.cxf.com.ejada;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-06-08T11:41:29.481+03:00
 * Generated source version: 3.3.6
 *
 */
@WebServiceClient(name = "BillManage",
                  wsdlLocation = "classpath:wsdl/BillManage.wsdl",
                  targetNamespace = "http://www.ejada.com")
public class BillManage_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.ejada.com", "BillManage");
    public final static QName BillManageSOAP12 = new QName("http://www.ejada.com", "BillManageSOAP12");
    public final static QName BillManageSOAP11 = new QName("http://www.ejada.com", "BillManageSOAP11");
    static {
        URL url = BillManage_Service.class.getClassLoader().getResource("wsdl/BillManage.wsdl");

        if (url == null) {
            java.util.logging.Logger.getLogger(BillManage_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/BillManage.wsdl");
            try {
                url = new URL("http://host.docker.internal:7800/BillManage?WSDL");
                java.util.logging.Logger.getLogger(url.toString())
                        .log(java.util.logging.Level.INFO,
                                "Loading WSDl FROM URL s {0}", "External URL WSDL LOAD");
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        WSDL_LOCATION = url;
    }

    public BillManage_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BillManage_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BillManage_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public BillManage_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public BillManage_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public BillManage_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns BillManage
     */
    @WebEndpoint(name = "BillManageSOAP12")
    public BillManage getBillManageSOAP12() {
        return super.getPort(BillManageSOAP12, BillManage.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BillManage
     */
    @WebEndpoint(name = "BillManageSOAP12")
    public BillManage getBillManageSOAP12(WebServiceFeature... features) {
        return super.getPort(BillManageSOAP12, BillManage.class, features);
    }


    /**
     *
     * @return
     *     returns BillManage
     */
    @WebEndpoint(name = "BillManageSOAP11")
    public BillManage getBillManageSOAP11() {
        return super.getPort(BillManageSOAP11, BillManage.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BillManage
     */
    @WebEndpoint(name = "BillManageSOAP11")
    public BillManage getBillManageSOAP11(WebServiceFeature... features) {
        return super.getPort(BillManageSOAP11, BillManage.class, features);
    }

}
