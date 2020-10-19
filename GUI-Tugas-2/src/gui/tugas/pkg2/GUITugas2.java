/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.tugas.pkg2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author LAB C
 */
public class GUITugas2 extends Application {
    @Override
    public void start(Stage stage) {
        //membuat label nama
        Text text1 = new Text("Nama");
        //membuat label telepon
        Text text2 = new Text("Telepon");
        //membuat label alamat
        Text text3 = new Text("Alamat");
        //membuat kolom nama
        TextField textField1 = new TextField();
        //membuat kolom telepon
        TextField textField2 = new TextField();
        //membuat kolom alamat
        TextArea textArea1;
        textArea1 = new TextArea();
        //membuat tombol
        Button button1 = new Button("Kirim");
        Button button2 = new Button("Hapus");
        
        //membuat Grid Pane
        GridPane gridPane = new GridPane();
        //membuat ukuran layout
        gridPane.setMinSize(400, 200);
        //Setting the padding
        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(3);gridPane.setHgap(3);
        gridPane.setVgap(5);gridPane.setHgap(5);
        //mengatur posisi grid supaya di tengah
        gridPane.setAlignment(Pos.CENTER);
        //mengatur koordinat gridpane
        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(text2, 0, 1);
        gridPane.add(textField2, 1, 1);
        gridPane.add(text3, 0, 2);
        gridPane.add(textArea1, 1, 2);
        gridPane.add(button1, 0, 3);
        gridPane.add(button2, 1, 3);
        
        
        //Membuat scene objek
        Scene scene = new Scene(gridPane);
        //Mengatur title atau judul
        stage.setTitle("MUM INDONESIA 2020");
        //Menambahkan scene ke stage
        stage.setScene(scene);
        //menampilkan konten
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
