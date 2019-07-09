import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class HttpUrlConnection {
    
public static void main (String[] args) {
    
String output = getUrlContents("https://www.christopherstewartcompany.com/");
System.out.println(output);		
}	
private static String getUrlContents(String theUrl) {
    
StringBuilder content = new StringBuilder();
try {
    
URL url = new URL(theUrl);
URLConnection urlConnection = url.openConnection();			
try ( 
        
BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
String line;
                        
while((line = bufferedReader.readLine()) != null) { 
    
StringBuilder append = content.append(line).append("\n");
                            
}
}
}
		
catch(IOException e)
		
{
}
		
return content.toString();
}
}