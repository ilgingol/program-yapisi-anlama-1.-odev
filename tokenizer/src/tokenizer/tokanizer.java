package tokenizer;
import java.util.Scanner;
import java.io.*;
public class tokanizer {
    public static void main(String[] args) throws IOException  {
        Scanner input = new Scanner(System.in);
        System.out.println("Dosya adını giriniz:");
        String dosyaAdi = input.nextLine();
        File file = new File(dosyaAdi);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        int asci;
        char sonKarakter = ' '; 
        while ((asci = br.read()) != -1) {
            char okunanKarakter = (char) asci; 
            if (asci == 41) { //parantez kapama
                if (sonKarakter >= '0' && sonKarakter <= '9') {
                    System.out.print(" "); 
                }
                
                System.out.print(okunanKarakter); 
                
            } 
            else if (asci == 42 || asci == 43 || asci == 45 || asci == 47) { //4islem icin
                System.out.print(" "); 
                System.out.print(okunanKarakter); 
                System.out.print(" "); 
            }   
            else if(asci==40) { // parantez acma icin
            	  System.out.print(okunanKarakter); 
                  System.out.print(" "); 
            }
            else {
                System.out.print(okunanKarakter);
            }
            sonKarakter = okunanKarakter; 
        }
    }
}
