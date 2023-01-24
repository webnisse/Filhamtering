import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Openfil {


    public void fileReader() {
        Scanner filscanner =new Scanner(System.in);
        File myFile = new File(filscanner + ".txt");
        try {
            Scanner myScan = new Scanner(myFile);
            while (myScan.hasNextLine()) {
                String data = myScan.nextLine();
                System.out.println(data);
            }
            myScan.close();
        } catch (FileNotFoundException e) {
            System.out.println("could not find file");
            e.printStackTrace();
        }

    }
}