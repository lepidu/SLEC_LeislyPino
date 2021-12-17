package slec_leislypino;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Leisly Pino
 */
public class Validation {
    
    public static boolean email (String email){
        
        Pattern pat = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = pat.matcher(email);
        return mat.find();        
    }
    
}
