package com.example.proyectocorte3;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class IndexController implements Initializable {
    public TableView<ControladorTabla> tablaElementos;
    public TextField inputDescripcion;
    public TextField inputComprar;
    public TextField inputComprado;
    public Button anadirBtn;
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
    }
}
