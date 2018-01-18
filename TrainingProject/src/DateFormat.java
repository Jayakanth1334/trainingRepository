import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	
	public static java.util.Date convertor(String dateString) throws ParseException{
		
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd-mm-yyyy");
		java.util.Date d = sdf.parse(dateString);
		return d;
		
	}
	
	
	
	
	
	

}
