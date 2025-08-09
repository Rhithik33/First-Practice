package dell.Shyam;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.message.StatusLine;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.sample.Lambda;

import java.sql.SQLOutput;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        Lambda<Integer> x = new Lambda<>(()-> 300-40);


        try (final CloseableHttpClient httpclient = HttpClients.createDefault()) {
            final HttpGet httpget = new HttpGet("https://official-joke-api.appspot.com/random_joke");

            logger.fatal("Executing request " + httpget.getMethod() + " " + httpget.getUri());

                 httpclient.execute(httpget, response -> {
                System.out.println("----------------------------------------");
                System.out.println(httpget + "->" + new StatusLine(response));
                // Process response message and convert it into a value object
                     logger.error( (response.getCode() + EntityUtils.toString(response.getEntity())));
                     return (response.getCode() + EntityUtils.toString(response.getEntity()));
            });

        } catch (Exception e) {

        }
       // System.out.println(x.call());
        }
    }
