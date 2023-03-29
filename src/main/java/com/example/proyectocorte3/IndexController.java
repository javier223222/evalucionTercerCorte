package com.example.proyectocorte3;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class IndexController {
    public TableView<ControladorTabla> tablaElementos;
    public TextField inputDescripcion;
    public TextField inputComprar;
    public TextField inputComprado;
    public Button anadirBtn;
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
    }
}
