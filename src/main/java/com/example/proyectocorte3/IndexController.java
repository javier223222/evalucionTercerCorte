package com.example.proyectocorte3;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
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

public class IndexController implements Initializable {
    public TableView<ControladorTabla> tablaElementos;
    public TextField inputDescripcion;
    public TextField inputComprar;
    public TextField inputComprado;
    public Button anadirBtn;

    /// HEAD
    public TableColumn<ControladorTabla, String> descripcionCol;
    public TableColumn<ControladorTabla, Integer> cantCompradaCol;
    public TableColumn<ControladorTabla, Integer> cantNecesariaCol;
    public TableColumn<ControladorTabla, Integer> cantPendCol;
    public Text cantidaComprada;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.descripcionCol.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.cantCompradaCol.setCellValueFactory(new PropertyValueFactory<>("cantComprada"));
        this.cantNecesariaCol.setCellValueFactory(new PropertyValueFactory<>("cantNecesaria"));
        this.cantPendCol.setCellValueFactory(new PropertyValueFactory<>("cantPendiente"));
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
        Text cantidaComprada;
        ControladorTabla controladorTabla;
    }

    @FXML
    public void initialize() {
        inputComprado.setVisible(false);
        cantidaComprada.setVisible(false);
    }


    public void agregar(MouseEvent mouseEvent) {
        try {
            String describicon = inputDescripcion.getText();

            int inputcantidad2 = Integer.parseInt(inputComprar.getText());
            UtilesEscoleres utiiles = new UtilesEscoleres(describicon, inputcantidad2);

            Inventario inventario = new Inventario();
            inventario.agregarProducto(utiiles);
            System.out.println(inventario.getUtilesEscolares().size());
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Error ingrese un numero");
            alert.showAndWait();
        }
    }
}