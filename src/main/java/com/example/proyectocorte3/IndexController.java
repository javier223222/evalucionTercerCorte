package com.example.proyectocorte3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.*;

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
    public Button modificarBtn;
    public Button eliminarBtn;
    public ImageView modificarImg;
    public ImageView eliminarImg;
    public Button ordenarBtn;
    public ImageView ordenarImg;
    public Text cantCompradaText;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.descripcionCol.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.cantCompradaCol.setCellValueFactory(new PropertyValueFactory<>("cantComprada"));
        this.cantNecesariaCol.setCellValueFactory(new PropertyValueFactory<>("cantNecesaria"));
        this.cantPendCol.setCellValueFactory(new PropertyValueFactory<>("cantPendiente"));
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
            String descripcion = inputDescripcion.getText().toUpperCase();
            int cantComprar = Integer.parseInt(inputComprar.getText());
            if (descripcion.isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("Error rellene todos los campos");
                alert.showAndWait();
            } else {
                UtilesEscoleres utiles = new UtilesEscoleres(descripcion, cantComprar);
                Inventario inventario = new Inventario();
                inventario.agregarProducto(utiles);

                tablaElementos.setItems(obtenerDatos(inventario));
                activarElementos();
                System.out.println(inventario.getUtilesEscolares().size());
            }
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Error ingrese un numero");
            alert.showAndWait();
        }
    }

    private void activarElementos() {
        tablaElementos.setVisible(true);
        modificarBtn.setVisible(true);
        modificarImg.setVisible(true);
        eliminarBtn.setVisible(true);
        eliminarImg.setVisible(true);
        ordenarBtn.setVisible(true);
        ordenarImg.setVisible(true);
    }

    private ObservableList<ControladorTabla> obtenerDatos(Inventario inventario) {
        HashMap<String, UtilesEscoleres> listaUtiles = inventario.getUtilesEscolares();
        ObservableList<ControladorTabla> lista = FXCollections.observableArrayList();

        Set<String> keys = listaUtiles.keySet();
        for (String key : keys) {
            UtilesEscoleres valor = listaUtiles.get(key);
            lista.add(new ControladorTabla(key, 0, valor.getCantidadAcomprar(), valor.getCantidadAcomprar()));
        }
        return lista;
    }

    public void seleccionar(MouseEvent mouseEvent) {
        ControladorTabla controladorTabla=tablaElementos.getSelectionModel().getSelectedItem();
        if (controladorTabla!=null){
            inputDescripcion.setText(controladorTabla.getNombre());
            inputComprado.setVisible(true);
        }
    }
    public void ordenar(MouseEvent event) {
        Inventario inventario = new Inventario();
        inventario.ordenarBurbuja();
        tablaElementos.setItems(obtenerDatos(inventario));
    }
}