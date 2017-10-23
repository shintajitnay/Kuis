/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quis;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import com.jfoenix.controls.JFXTextField;
import java.awt.TextArea;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;



/**
 *
 * @author Asus
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private JFXTextField Nama;

    @FXML
    private JFXTextField Tinggi;

    @FXML
    private JFXTextField berat;

    @FXML
    private RadioButton laki;

    @FXML
    private RadioButton perempuan;

    @FXML
    private Button Proses;

    @FXML
    private Button Reset;

    @FXML
    private TextField ideal;

    @FXML
    private javafx.scene.control.TextArea hasil;

    @FXML
    private javafx.scene.control.TextArea saran;
    
    private Label label;
    
     @FXML
    void hapus(ActionEvent event) {
       Nama.setText("");
       Tinggi.setText("");
       berat.setText("");
       saran.setText("");
       hasil.setText("");
       perempuan.setSelected(false);
       laki.setSelected(false);
    }

    @FXML
    void proses(ActionEvent event) {
            int pas =0;
            String sarans ="";
            String nama = Nama.getText();
            String analisa = hasil.getText();
            String ting = Tinggi.getText();
            String ber = berat.getText();
            int tinggi = Integer.parseInt(Tinggi.getText());
            int Berat =  Integer.parseInt(berat.getText());
            if (laki.isSelected()){
                pas = tinggi - 105;
                if(pas == Berat){
                    analisa = "ideal";
                    sarans ="sudah baik";
                } 
                else if (pas > Berat){
                    analisa ="Underweight";
                    sarans ="Perbanyak makanan bergizi";
                } else{
                    analisa = "Overweight";
                    sarans ="Diett yuk perbanyak olahraga";
                }
            }
            else if(perempuan.isSelected()){
               pas= tinggi -110;
                 if(pas == Berat){
                    analisa = "ideal";
                    sarans ="sudah baik";
                } 
                else if (pas > Berat){
                    analisa ="Underweight";
                    sarans ="Perbanyak makanan bergizi";
                } 
                else{
                    analisa = "Overweight";
                    sarans ="Diett yuk perbanyak olahraga";
                }
            }
            ideal.setText(""+pas);
            hasil.setText("Nama : "+nama+"\nBerat Badan : "+Berat+"\nTinggi :  "+tinggi+"\nAnalisa :  "+analisa);
            saran.setText(sarans);
    }
   


    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
}
