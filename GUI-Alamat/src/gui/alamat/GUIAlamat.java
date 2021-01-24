/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.alamat;

import bukualamat.model.DataPersonal;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Susi
 */
public class GUIAlamat extends Application {
    
    //variabel kelas
    private Stage stageAplikasi;
    private BorderPane rootAplikasi;
    private final ObservableList<DataPersonal> dataperson = FXCollections.observableArrayList();
    
public GUIAlamat(){
    dataperson.add(new DataPersonal("Agus Nuri", "Fadli"));
    dataperson.add(new DataPersonal("Budi", "Santoso"));
    dataperson.add(new DataPersonal("Carla", "Ginting"));
    dataperson.add(new DataPersonal("Susila", "Wati"));
    dataperson.add(new DataPersonal("Bagir", "Al Hadar"));
    dataperson.add(new DataPersonal("Liza", "Rifan"));
}

public ObservableList<DataPersonal> getDataPersonal(){
    return dataperson;
}
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
