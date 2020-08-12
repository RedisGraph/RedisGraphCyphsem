import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import uk.ac.ed.cyphsem.language.query.QueryBis;
import uk.ac.ed.cyphsem.outbridge.Random;

public class TestQueryBis {

    @Test
    public void testQueryBis(){
        for (int i = 0; i < 10; i++){
            Random r = new Random();
            QueryBis q = r.randomQueryBis();
            System.out.println(q);
            System.out.println();
        }
    }
}
