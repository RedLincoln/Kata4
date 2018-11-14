package kata4.main;

import histograma.model.Histogram;
import histograma.view.HistogramDisplay;
import java.io.FileNotFoundException;
import java.util.List;
import javax.swing.JOptionPane;
import kata4.model.Mail;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {
    private String fileName;
    private Histogram<String> histogram;
    
    public static void main(String[] args) throws Exception {
        Kata4 kata4 = new Kata4();
        kata4.execute();
    }

    private void execute() throws Exception {
        input();
        process();
        output();
    }

    private void input() {
        fileName = JOptionPane.showInputDialog("Introduce nombre de fichero");
    }
    
    
    private void process() throws Exception {
        List<Mail> emails = MailListReader.read(fileName);
        histogram = MailHistogramBuilder.build(emails);
    }

    private void output() {
        HistogramDisplay histDisplay = new HistogramDisplay(histogram);
        histDisplay.execute();
    }
    
    
    
}
