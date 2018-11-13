package kata4.view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Mail;

public class MailListReader {

    
    public static List<Mail> read (String fileName) throws FileNotFoundException{
        List<Mail> mailList = new ArrayList<>();
        readFromFile(fileName, mailList);
        return mailList;
    }
    
    private static void readFromFile(String fileName, List mailList) throws FileNotFoundException {
        try{
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = null;
            while( ( line = reader.readLine() ) != null ){
                checkEmail(line, mailList);
            }
        }catch (Exception e){
        
        }
    }
    
    private static void checkEmail(String line, List mailList) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%]+@[a-z0-9.-]+\\.[a-z]{2,6}$");
        Matcher matcher = pattern.matcher(line);
        if ( matcher.find() )
                mailList.add(new Mail(line));
    }


}
