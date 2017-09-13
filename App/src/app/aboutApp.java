package app;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class aboutApp {
    
    public void aboutAppdoing ()
    
    {
       
    if(Desktop.isDesktopSupported())
    {
        try {
            Desktop.getDesktop().browse(new URI("https://github.com"));
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (URISyntaxException e1) {
            e1.printStackTrace();
        }
    }; 
    
    
    }
      
    
}
