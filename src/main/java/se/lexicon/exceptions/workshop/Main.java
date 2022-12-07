package se.lexicon.exceptions.workshop;

import se.lexicon.exceptions.workshop.data_access.NameService;
import se.lexicon.exceptions.workshop.domain.Person;
import se.lexicon.exceptions.workshop.fileIO.CSVReader_Writer;
import se.lexicon.exceptions.workshop.utilities.ConsoleColors;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String> maleFirstNames = CSVReader_Writer.getMaleFirstNames();
        List<String> femaleFirstNames = CSVReader_Writer.getFemaleFirstNames();

        List<String> lastNames = CSVReader_Writer.getLastNames();


        NameService nameService = new NameService(maleFirstNames, femaleFirstNames, lastNames);
        nameService.addFemaleFirstName("Niveitha");
        nameService.addMaleFirstName("Mehrdad");
        nameService.addLastName("Towfighian");

        Person test = nameService.getNewRandomPerson();
        System.out.println(ConsoleColors.CYAN_BRIGHT + test + ConsoleColors.RESET);

        Person test2 = nameService.getNewRandomPerson();
        System.out.println(ConsoleColors.CYAN_BRIGHT + test2 + ConsoleColors.RESET);


    }

}
