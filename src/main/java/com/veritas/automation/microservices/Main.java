package com.veritas.automation.microservices;

import com.veritas.automation.microservices.crawler.CrawlerServer;
import com.veritas.automation.microservices.schedule.ScheduleServer;
import com.veritas.automation.microservices.socketio.NettySocketServer;
import com.veritas.automation.microservices.track.TrackServer;

/**
 * Project: erya
 *
 * @author Qihan.Luo 3/6/2017
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        String serverName = "NO-VALUE";

        switch (args.length) {
            case 2:
                // Optionally set the HTTP port to listen on, overrides
                // value in the <server-name>-server.yml file
                System.setProperty("server.port", args[1]);
                // Fall through into ..

            case 1:
                serverName = args[0].toLowerCase();
                break;

            default:
                usage();
                return;
        }

        if (serverName.equals("track")) {
            TrackServer.main(args);
        } else if (serverName.equals("schedule")) {
            ScheduleServer.main(args);
        } else if (serverName.equals("crawler")) {
            CrawlerServer.main(args);
        } else if (serverName.equals("chat")) {
            NettySocketServer.main(args);
        } else {
            System.out.println("Unknown server type: " + serverName);
            usage();
        }
    }

    private static void usage() {
        System.out.println("Usage: java -jar ... <server-name> [server-port]");
        System.out.println(
                "     where server-name is 'crawler', " + "'schedule' or 'track' and server-port > 1024");
    }
}
