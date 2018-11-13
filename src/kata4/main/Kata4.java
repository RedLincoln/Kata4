package kata4.main;

import histograma.model.Histogram;
import histograma.view.HistogramDisplay;
import java.io.FileNotFoundException;
import java.util.List;
import kata4.model.Mail;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {

    public static void main(String[] args) throws FileNotFoundException {
        String fileName =  "email.txt";
        List<Mail> emails = MailListReader.read(fileName);
        Histogram<String> histogram = MailHistogramBuilder.build(emails);
        HistogramDisplay histDisplay = new HistogramDisplay(histogram);
        histDisplay.execute();
    }
    
}
