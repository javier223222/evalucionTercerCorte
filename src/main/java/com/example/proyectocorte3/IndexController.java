package com.example.proyectocorte3;

<<<<<<< HEAD
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
=======
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
>>>>>>> 2483497d56908f80af0763e4e31a92ee0492ef44
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class IndexController implements Initializable {
    public TableView<ControladorTabla> tablaElementos;
    public TextField inputDescripcion;
    public TextField inputComprar;
    public TextField inputComprado;
    public Button anadirBtn;
<<<<<<< HEAD
    public TableColumn descripcionCol;
    public TableColumn cantCompradaCol;
    public TableColumn cantNecesariaCol;
    public TableColumn cantPendCol;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.tipoPCol.setCellValueFactory(new PropertyValueFactory<>("tipoPaquete"));
        this.costoCol.setCellValueFactory(new PropertyValueFactory<>("costo"));
        this.mensualidadCol.setCellValueFactory(new PropertyValueFactory<>("mensualidad"));
    }

    public void agregarElemento(ActionEvent event) {
        String nombre = inputDescripcion.getText();
        int cantidadAcomprar = Integer.parseInt(inputComprar.getText());
        int cantidadComprada = Integer.parseInt(inputComprado.getText());

        UtilesEscoleres util1 = new UtilesEscoleres(nombre, cantidadAcomprar);
        Inventario.agregarProducto(util1);
    }

    public void modificarElemento(ActionEvent event) {

    }

    public void eliminarElemento(ActionEvent event) {
=======
    public Text cantidaComprada;
    private ControladorTabla controladorTabla;
    @FXML
    public void initialize() {
        inputComprado.setVisible(false);
        cantidaComprada.setVisible(false);
    }



    public void agregar(MouseEvent mouseEvent) {
      try {
          String describicon=inputDescripcion.getText();

          int inputcantidad2=Integer.parseInt(inputComprar.getText());
          UtilesEscoleres utiiles=new UtilesEscoleres(describicon,inputcantidad2);

          Inventario inventario=new Inventario();
          inventario.agrgearProducti(utiiles);
          System.out.println(inventario.getUtilesEscolares().size());



      }catch (Exception e) {
          Alert alert = new Alert(Alert.AlertType.ERROR);
          alert.setHeaderText(null);
          alert.setTitle("Error");
          alert.setContentText("Error ingrese un numero");
          alert.showAndWait();
      }
>>>>>>> 2483497d56908f80af0763e4e31a92ee0492ef44
    }
}
