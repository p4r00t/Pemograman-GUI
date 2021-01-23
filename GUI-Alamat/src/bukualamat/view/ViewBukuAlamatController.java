/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukualamat.view;

import gui.alamat.GUIAlamat;
import bukualamat.model.DataPersonal;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewBukuAlamatController {

    @FXML
    private TableView<DataPersonal> tabelPerson;

    @FXML
    private TableColumn<DataPersonal, String> kolomNamaDepan;

    @FXML
    private TableColumn<DataPersonal, String> kolomNamaBelakang;

    @FXML
    private Label labelNamaDepan;

    @FXML
    private Label labelNamaBelakang;

    @FXML
    private Label labelAlamat;

    @FXML
    private Label labelKota;

    @FXML
    private Label labelNoHp;
    
    //referensi kelas utama
    private GUIAlamat kelasUtama;
    
    //konstraktor
    public ViewBukuAlamatController(){
    }

    @FXML
    private void initialize(){
        kolomNamaDepan.setCellValueFactory(celldata->celldata.getValue().NamaDepanProperty());
        kolomNamaBelakang.setCellValueFactory(celldata->celldata.getValue().NamaBelakangProperty());
    }
    //metode setKelasUtama agar Kontroller terhubung dengan Kelas BukuAlamat
    //untuk referensi Kelas BukuAlamat ke variabel kelasUtama
    //sehingga bisa menambahkan ObservableList pada kelas utama ke variabel tabelperson di kelas ini
    //metode ini akan dipanggil di keals utama
    
    public void setKelasUtama(GUIAlamat guialamat){
        this.kelasUtama = guialamat;
        
        tabelPerson.setItems(kelasUtama.getDataPersonal());
    }
}
