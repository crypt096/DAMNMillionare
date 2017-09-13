package app;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javax.swing.JOptionPane;
import java.util.Random;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;




/**
 *
 *   @AUTHORS  ---------------> SwiSS & Enigmaa & Mayaa & DJADJI
 * 
 */
public class FXMLDocumentController implements Initializable {
   
    @FXML
    private JFXTextField username;
    @FXML
    private JFXPasswordField pass;
    @FXML
    private Pane pane1;
    @FXML
    private JFXButton dugme;
    @FXML
    private JFXButton play;
    @FXML
    private Pane pane2;
    @FXML
    private Label errMsg;
    @FXML
    private TextField moneyfill;
    @FXML
    private JFXButton next;
    @FXML
    private Pane pane3;
    @FXML
    private GridPane grid;
    
    
   
    private final Label[][] lbl = new Label[6][6];
    private final Label[] rand = new Label[6];
    
    
    
    int money;
    String num1,num2,num3,num4,num5,num6;
    String mon;
    int number1,number2,number3,number4,number5,number6;
    String mail;
    
    Random r = new Random();
    
    
    @FXML
    private TextField txtfield_num1;
    @FXML
    private TextField txtfield_num2;
    @FXML
    private TextField txtfield_num3;
    @FXML
    private TextField txtfield_num4;
    @FXML
    private TextField txtfield_num5;
    @FXML
    private TextField txtfield_num6;
    @FXML
    private Pane pane4;
    @FXML
    private TextField win_rand1;
    @FXML
    private TextField win_rand2;
    @FXML
    private TextField win_rand3;
    @FXML
    private TextField win_rand4;
    @FXML
    private TextField win_rand5;
    @FXML
    private TextField win_rand6;
    @FXML
    private Label rezon;
    @FXML
    private Label won;
    @FXML
    private Label frgt;
    @FXML
    private Button logout;
    @FXML
    private Button retry;
    @FXML
    private AnchorPane mainAnchor;
    @FXML
    private Button aboutbtn;
   
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    
    
    
    
    }    

    @FXML
    private void uradi_dugme(ActionEvent event) {
        
        if(username.getText().equals("admin")&&pass.getText().equals("admin"))
        {pane1.setVisible(false);
        pane2.setVisible(true);}
        
        else
        {errMsg.setText("Username/Password is incorrect!");}
            
    }

    @FXML
    private void playonAction(ActionEvent event) {
        
        pane2.setVisible(false);
        pane3.setVisible(true);
        
        int broj=1;
        for(int i=0; i<6; i++)
        {
                for(int j=0; j<6;j++)
                {lbl[i][j] = new Label(" "+broj); 
                 lbl[i][j].setPrefSize(50, 50);
                 lbl[i][j].setAlignment(Pos.CENTER);
                 grid.add(lbl[i][j], j, i);
                 broj++;
                }
        }
       
       mon = JOptionPane.showInputDialog("Enter the amount of money:");
       money=Integer.parseInt(mon);
       moneyfill.setText(Integer.toString(money));
        
         }
 
    @FXML
    private void nexttoDo(ActionEvent event) {
        
       pane3.setVisible(false);
       pane4.setVisible(true);
       
       num1 = JOptionPane.showInputDialog("Enter 1st number :");
       number1 = Integer.parseInt(num1);
       
       num2 = JOptionPane.showInputDialog("Enter 2nd number :");
       number2 = Integer.parseInt(num2);
       
       num3 = JOptionPane.showInputDialog("Enter 3rd number :");
       number3 = Integer.parseInt(num3);
       
       num4 = JOptionPane.showInputDialog("Enter 4th number :");
       number4 = Integer.parseInt(num4);
       
       num5 = JOptionPane.showInputDialog("Enter 5th number :");
       number5 = Integer.parseInt(num5);
       
       num6 = JOptionPane.showInputDialog("Enter 6th number :");
       number6 = Integer.parseInt(num6);

      
       
       
       txtfield_num1.setText(" "+number1);
       txtfield_num2.setText(" "+number2);
       txtfield_num3.setText(" "+number3);
       txtfield_num4.setText(" "+number4);
       txtfield_num5.setText(" "+number5);
       txtfield_num6.setText(" "+number6);
       
       
       int ran1,ran2,ran3,ran4,ran5,ran6;
       
       ran1=r.nextInt(36)+1;
       ran2=r.nextInt(36)+1;
       ran3=r.nextInt(36)+1;
       ran4=r.nextInt(36)+1;
       ran5=r.nextInt(36)+1;
       ran6=r.nextInt(36)+1;
       
       
       win_rand1.setText(Integer.toString(ran1));
       win_rand2.setText(Integer.toString(ran2));
       win_rand3.setText(Integer.toString(ran3));
       win_rand4.setText(Integer.toString(ran4));
       win_rand5.setText(Integer.toString(ran5));
       win_rand6.setText(Integer.toString(ran6));
       
       int [] arr_user_input = {number1,number2,number3,number4,number5,number6};
       int [] arr_rand_out= {ran1,ran2,ran3,ran4,ran5,ran6};
       
       int brojac = 0;
       
       
       
       for(int i=0;i<6;i++)
       {for(int j=0;j<6;j++)
       
       {
           
           if(arr_user_input[i]==arr_rand_out[j])
                 {
                     brojac++;
                 }
       
       }
       
       
       }
       
 
       rezon.setText(" " + brojac);
       
        
       
       int dobitak=0;
       
       
       
        
        if(brojac==0)
        {
            won.setText(" "+dobitak);
        }
        
        else if (brojac==1)
        {
            
            won.setText(" "+dobitak);
        
        }
        
        else if (brojac==2)  
        {
            
            dobitak=4*money;
         won.setText(" "+dobitak);
        
        
       }
        
        else if (brojac==3)
        {
            
            dobitak=10*money;
         won.setText(" "+dobitak);
        
        }
        
        else if (brojac==4)
        {
            
            dobitak=50*money;
         won.setText(" "+dobitak);
        
        }
        
        else if (brojac==5)
        {
            
            dobitak=250*money;
         won.setText(" "+dobitak);
        
        }
        
        else if (brojac==6)
        {
            
            dobitak=1000*money;
         won.setText(" "+dobitak);
        
        
        }    
       
    }

    @FXML
    private void ifForgot(MouseEvent event) {
        
       mail = JOptionPane.showInputDialog("Enter your email:");
       
       AlertBox alertbox = new AlertBox();
       alertbox.AlertBoxShowing();
       
    }

    @FXML
    private void LogOut(ActionEvent event) {
        
        LogOut logout_do = new LogOut();
        logout_do.LogOutalert();
        pane4.setVisible(false);
        pane1.setVisible(true);
        
        
    }

    
    @FXML
    private void reTry(ActionEvent event) {
        
        
        pane4.setVisible(false);
        pane2.setVisible(true);
        
    }

    @FXML
    private void clickAbout(ActionEvent event) {
        
        aboutApp about_brt = new aboutApp();
        about_brt.aboutAppdoing();
       
    }

    private void doHyperLink(ActionEvent event) {
        
        
        aboutApp about_brt = new aboutApp();
        about_brt.aboutAppdoing();
    
    }


    
    
    
    
    
    
    
    
    
    
}
