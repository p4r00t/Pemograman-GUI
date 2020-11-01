/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.tugas.pkg3;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author agusn
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField textNama;
    @FXML
    private TextField textTelepon;
    @FXML
    private TextArea textAlamat;
    @FXML
    private Button buttonHapus;
    @FXML
    private Button buttonKirim;
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
       if(event.getSource() == buttonKirim){
        String nama = textNama.getText();
        String telepon = textTelepon.getText();
        String alamat = textAlamat.getText();
            System.out.println("Nama    :" + textNama.getText());
            System.out.println("Telepon :" + textTelepon.getText());
            System.out.println("Alamat  :" + textAlamat.getText());

        
            }if(event.getSource() == buttonHapus){
             textNama.setText("");   
             textTelepon.setText("");
             textAlamat.setText("");
            }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
