package stringmethods.url;

import java.util.Locale;

public class UrlManager {

    private final String PROTOCOLEND = "://";

    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url) {
        findProtocolFromUrl(url);
        findPortFromUrl(url);
        findHostFromUrl(url);
        findPathFromUrl(url);
        findQueryFromUrl(url);
    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getQuery() {
        return query;
    }

    public boolean hasProperty(String key) {
        return query.startsWith(key + "=") || query.contains("&" + key + "=");
    }

    public String getProperty(String key) {
        String[] properties = query.split("&");
        for (String s : properties) {
            String[] keyValue = s.split("=");
            if (keyValue[0].equals(key)) {
                return keyValue[1];
            }
        }
        return null;
    }

    private void findHostFromUrl(String url) {
        int startHostIndex = url.indexOf(PROTOCOLEND) + 3;
        int endHostIndex = url.indexOf(":", startHostIndex);
        if (endHostIndex < 0) {
            endHostIndex = url.indexOf("/", startHostIndex);
        }
        this.host = endHostIndex < 0 ? url.substring(startHostIndex).toLowerCase() : url.substring(startHostIndex, endHostIndex).toLowerCase();

    }

    private void findPathFromUrl(String url) {
        int index = url.indexOf(PROTOCOLEND) + 3;
        int startPathIndex = url.indexOf("/", index);
        if (startPathIndex < 0) {
            this.path = "";
            return;
        }
        int endPathIndex = url.indexOf("?");
        this.path = endPathIndex < 0 ? url.substring(startPathIndex) : url.substring(startPathIndex, endPathIndex);
    }

    private void findQueryFromUrl(String url) {
        int startQueryIndex = url.indexOf("?");
        this.query = startQueryIndex < 0 ? "" : url.substring(startQueryIndex + 1);
    }

    private void findPortFromUrl(String url) {
        int index = url.indexOf(PROTOCOLEND);
        int portStartIndex = url.indexOf(":", index);
        if (portStartIndex < 0) {
            return;
        }
//        int portEndIndex = url.indexOf("/", portStartIndex);
//        System.out.println(url.substring(portStartIndex + 1));
//        this.port = portEndIndex < 0 ? Integer.valueOf(url.substring(portStartIndex + 1)) : Integer.valueOf(url.substring(portStartIndex + 1, portEndIndex));
    }

    private void findProtocolFromUrl(String url) {
        int index = url.indexOf(PROTOCOLEND);
        this.protocol = url.substring(0, index).toLowerCase();
    }

    public static void main(String[] args) {
        String url = "HTTPS://EarthQuake.USgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
        UrlManager urlManager = new UrlManager(url);

        System.out.println(urlManager.getProtocol());
        System.out.println(urlManager.getHost());
        System.out.println(urlManager.getPath());
        System.out.println(urlManager.getPort());

//        String urlWithPortAtEnd = "HTTPS://EarthQuake.USgs.gov:80";
//        urlManager = new UrlManager(urlWithPortAtEnd);
//
//        System.out.println(urlManager.getProtocol());
//        System.out.println(urlManager.getHost());
//        System.out.println(urlManager.getPath());
////        System.out.println(urlManager.getPort());
//
//        String urlWithPort = "HTTPS://EarthQuake.USgs.gov:80/query?a=4";
//        urlManager = new UrlManager(urlWithPort);
//
//        System.out.println(urlManager.getProtocol());
//        System.out.println(urlManager.getHost());
//        System.out.println(urlManager.getPath());
////        System.out.println(urlManager.getPort());
//
//        String urlWithProperty = "HTTPS://EarthQuake.USgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
//        urlManager = new UrlManager(urlWithProperty);
//
//        System.out.println(urlManager.hasProperty("format"));
//        System.out.println(urlManager.getProperty("format"));
//        System.out.println(urlManager.hasProperty("place"));
//        System.out.println(urlManager.getProperty("place"));
//        System.out.println(urlManager.hasProperty("time"));
//        System.out.println(urlManager.getProperty("time"));
    }
}
