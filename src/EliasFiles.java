import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
public class EliasFiles {
    String filnamn;
    public EliasFiles(){
        skrivtilFil();
        //Skapafil();
        fileReader();
    }

    public void Skapafil() {

        System.out.println("Vad ska filen heta: ");
        Scanner myscan = new Scanner(System.in);
        filnamn = myscan.next();

        try {
            // Skapa en ny fil
            File file = new File( filnamn +".txt");

            // Kontrollera om filen redan existerar
            if (file.createNewFile()) {
                System.out.println("Filen har skapats!");
            } else {
                System.out.println("Filen existerar redan.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileReader() {

        System.out.println("Skriv vilken fil du vill öppna");
        Scanner filscanner =new Scanner(System.in);
        filnamn = filscanner.next();

        File myFile = new File(filnamn + ".txt");
        try {
            Scanner myScan = new Scanner(myFile);
            while (myScan.hasNextLine()) {
                String data = myScan.nextLine();
                System.out.println(data);
            }
            myScan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Kunde inte hitta fil");
            e.printStackTrace();
        }

    }

    public void skrivtilFil(){
        //try catch kolla om det funkar att skriva över till filen och om filen finns
        try{
            //Här skriver man in vilken fil det är som man vill använda och skriva om
            FileWriter myWriter= new FileWriter("Elias.txt",true);
            myWriter.write("Detta är i din fil    ");
            myWriter.close();
            System.out.println("Det har skrivits i din fil");

        }catch(IOException e){
            System.out.println("Kunde inte skriva till fil");
            e.printStackTrace();
        }
    }






    }
