import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


class rmwhite {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileReader fr = new FileReader(args[0]); 
        BufferedReader br = new BufferedReader(fr); 
        FileWriter fw = new FileWriter("sroutfile.txt"); 
        String line;

        while((line = br.readLine()) != null)
        { 
            line = line.trim(); // remove leading and trailing whitespace
            line=line.replaceAll("\\s+", " ");
            fw.write(line);

        }
        fr.close();
        fw.close();
    }
}