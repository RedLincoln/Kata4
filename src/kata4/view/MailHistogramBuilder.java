package kata4.view;

import histograma.model.Histogram;
import java.util.List;
import kata4.model.Mail;

public class MailHistogramBuilder {
    
    public static Histogram<String> build (List<Mail> mails){
        Histogram<String> histogram =  new Histogram<>();
        insertToHistogram( histogram, mails );
        return histogram;
    }
    
    private static void insertToHistogram(Histogram <String> histogram, List<Mail> mails) {
        for (Mail mail : mails) {
            histogram.increment(mail.getDomain());
        }
    }
    
}
