package BookTreeMap.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TreeMap<String,Book> bookTreeMap = new TreeMap<>();
        Scanner scanner = null;
        File file = new File("BookTreeMap/datafiles/BooksDataFile.txt");

        try{
            scanner = new Scanner(file);
        }catch(FileNotFoundException e){
            System.out.println("err: "+e);
            return;
        }

        scanner.nextLine();
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] fields = line.split("~");

            Book current = new Book(fields[2], fields[3], Integer.parseInt(fields[4]), fields[5], fields[6], Double.parseDouble(fields[7]));
            bookTreeMap.put(fields[2], current);
        }

        String[] isbnCodes = bookTreeMap.toKeyArray(new String[0]);

        System.out.printf("Tree Size: %d\n",bookTreeMap.size());
        System.out.println("---------------------");
        System.out.println("TreeMap contains isbn#0439023513: " + bookTreeMap.containsKey("0439023513"));
        System.out.println("TreeMap contains isbn#0316068047: "+bookTreeMap.containsKey("0316068047"));
        System.out.println("---------------------");
        System.out.println(bookTreeMap.get("0930289234"));
        System.out.println("---------------------");
        System.out.println(Arrays.toString(isbnCodes));
    }
}
