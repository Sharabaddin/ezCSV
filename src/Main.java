
import com.test.ParsCsv;

public class Main {

    public static void main(String[] args) {


        //Read
        ParsCsv pc = new ParsCsv("path/1", AUTOSAVE);

        //Read from internet
        ParsCsv pc = new ParsCsv("test.com/1");

        //To array
        pc.toAr(Ar);

        //To Collection
        pc.toCo(Ar);

        //Concatanation csv
        pc3 = pc + pc2;


        // Get value by asociative
        while(pc.end()) {
            a = pc["name"];
            b = pc["price"];
        }

        // Get value by index
        while(pc.end()) {
            a = pc[1];
            b = pc[2];
        }

        // Update value
        while(pc.end()) {
            pc["name"] = 3;
            pc["price"] = 4;
        }

        //Add value
        pc.Add(Colection);
        pc.Add(array);
        pc.Add("London", 71);




    }
}
