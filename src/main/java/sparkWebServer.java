



import org.json.simple.JSONObject;
import spark.Request;
import spark.Response;
import static spark.Spark.*;


/**
 * Class that makes a SparkWebServer
 */
public class sparkWebServer {
    private static servicesCalculator servicio = new servicesCalculator();





    /**
     * Main class of the application
     * @param args arguments needed to execute de app
     */

    public static void main(String ... args){
        port(getPort());
        get("/hello", (req,res) -> "Hello!" );
        get("/asin", sparkWebServer::getAsin);
        get("/atan", sparkWebServer::getAtan);
        //get("/log",SparkWebServer::getLog);

    }

    private static Object getAtan(Request request, Response response) {
        double respuesta = servicio.calculateAtan(Double.parseDouble(request.queryParams("value")));
        JSONObject myObject = new JSONObject();
        myObject.put("operation", "atan");
        myObject.put("input", request.queryParams("value"));
        myObject.put("output",respuesta);
        System.out.println(myObject);
        return myObject;
    }

    private static Object getAsin(Request request, Response response) {
        double respuesta = servicio.calculateAsin(Double.parseDouble(request.queryParams("value")));
        JSONObject myObject = new JSONObject();
        myObject.put("operation", "asin");
        myObject.put("input", request.queryParams("value"));
        myObject.put("output",respuesta);
        System.out.println(myObject);

        return myObject;
    }



    /**
     * Gets a port on which the Server will run
     * @return the port on which the Server will run
     */
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000;
    }
}