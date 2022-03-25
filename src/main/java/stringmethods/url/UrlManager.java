package stringmethods.url;

public class UrlManager {

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
        int startHostIndex = url.indexOf("://") + 3;
        int endHostIndex = url.indexOf(":", startHostIndex);
        if (endHostIndex < 0) {
            endHostIndex = url.indexOf("/", startHostIndex);
        }
        this.host = endHostIndex < 0 ? url.substring(startHostIndex).toLowerCase() : url.substring(startHostIndex, endHostIndex).toLowerCase();

    }

    private void findPathFromUrl(String url) {
        int index = url.indexOf("://") + 3;
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
        int index = url.indexOf("://");
        int portStartIndex = url.indexOf(":", index + 1);
        if (portStartIndex < 0) {
            return;
        }
        int portEndIndex = url.indexOf("/", portStartIndex);
        this.port = portEndIndex < 0 ? Integer.valueOf(url.substring(portStartIndex + 1)) : Integer.valueOf(url.substring(portStartIndex + 1, portEndIndex));
    }

    private void findProtocolFromUrl(String url) {
        int index = url.indexOf("://");
        this.protocol = url.substring(0, index).toLowerCase();
    }

    public static void main(String[] args) {
        String url = "HTTPS://EarthQuake.USgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
        System.out.println(url);
        UrlManager urlManager = new UrlManager(url);

        System.out.println("Protocol: " + urlManager.getProtocol());
        System.out.println("Host: " + urlManager.getHost());
        System.out.println("Path: " + urlManager.getPath());
        System.out.println("Port: " + urlManager.getPort());
        System.out.println();


        String urlWithPortAtEnd = "HTTPS://EarthQuake.USgs.gov:80";
        System.out.println(urlWithPortAtEnd);
        urlManager = new UrlManager(urlWithPortAtEnd);

        System.out.println("Protocol: " + urlManager.getProtocol());
        System.out.println("Host: " + urlManager.getHost());
        System.out.println("Path: " + urlManager.getPath());
        System.out.println("Port: " + urlManager.getPort());
        System.out.println();


        String urlWithPort = "HTTPS://EarthQuake.USgs.gov:80/query?a=4";
        System.out.println(urlWithPort);
        urlManager = new UrlManager(urlWithPort);

        System.out.println("Protocol: " + urlManager.getProtocol());
        System.out.println("Host: " + urlManager.getHost());
        System.out.println("Path: " + urlManager.getPath());
        System.out.println("Port: " + urlManager.getPort());
        System.out.println();


        String urlWithProperty = "HTTPS://EarthQuake.USgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
        urlManager = new UrlManager(urlWithProperty);

        System.out.println(urlManager.hasProperty("format"));
        System.out.println(urlManager.getProperty("format"));
        System.out.println(urlManager.hasProperty("starttime"));
        System.out.println(urlManager.getProperty("starttime"));
        System.out.println(urlManager.hasProperty("endtime"));
        System.out.println(urlManager.getProperty("endtime"));
    }
}
