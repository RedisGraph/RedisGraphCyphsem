package com.redislabs.redisgraphcyphsem;

import com.redislabs.redisgraph.RedisGraph;
import uk.ac.ed.cyphsem.language.query.QueryBis;
import uk.ac.ed.cyphsem.outbridge.Random;

public class RedisGraphCyphsemMain {

    public static void main(String[] argv) {
        if(argv.length != 1 && argv.length != 3) {
            throw new IllegalArgumentException("Wrong number of arguments");
        }
        String graphName = argv[0];
        RedisGraph graph;
        if(argv.length == 3) {
            String host = argv[1];
            int port = Integer.valueOf(argv[2]);
            graph = new com.redislabs.redisgraph.impl.api.RedisGraph(host, port);
        }
        else {
            graph = new com.redislabs.redisgraph.impl.api.RedisGraph();
        }

        while(true) {
            Random r = new Random();
            QueryBis q = r.randomQueryBis();
            graph.query(graphName, q.toString());
        }
    }
}
