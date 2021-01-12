/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.alamat;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author p4r00t
 */
public class GUIAlamat extends Application {
    
    //variabel kelas
    private Stage stageAplikasi;
    private BorderPane rootAplikasi;
    
    @Override
    public void start(Stage primaryStage) throws IOException{
        this.stageAplikasi = primaryStage;
        this.stageAplikasi.setTitle("Buku Alamat");
        
        initGUIkerangka(); //fungsi inisialisasi node dari GUIkerangka.fxml
        initviewbukualamat();//fungsi inisialisasi node dari viewbukualamat.fxml
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void initGUIkerangka(){
    try {    
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(GUIAlamat.class.getResource("view/viewbukualamat.fxml"));
        rootAplikasi = (BorderPane)loader.load();
    
        Scene sceneAplikasi = new Scene(rootAplikasi);
        stageAplikasi.setScene(sceneAplikasi);
        stageAplikasi.show();
    } catch (IOException ex){
        Logger.getLogger(GUIAlamat.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    private void initviewbukualamat() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(GUIAlamat.class.getResource("view/viewbukualamat.fxml"));
            AnchorPane guiIsi = (AnchorPane)loader.load();
            rootAplikasi.setCenter(guiIsi);
        } catch (IOException ex){
            Logger.getLogger(GUIAlamat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
