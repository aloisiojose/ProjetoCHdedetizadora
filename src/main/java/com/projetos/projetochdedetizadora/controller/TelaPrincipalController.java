package com.projetos.projetochdedetizadora.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class TelaPrincipalController implements Initializable {

    @FXML private HBox hb_top;
    @FXML private MenuBar barraDeMenu;
    @FXML private Menu menuCadastro;
    @FXML private MenuItem menuItemCidades;
    @FXML private MenuItem menuItemClientes;
    @FXML private MenuItem menuItemFornecedores;
    @FXML private MenuItem menuItemFuncionarios;
    @FXML private MenuItem menuItemProdutos;
    @FXML private MenuItem menuItemUsuarios;
    @FXML private MenuItem menuItemSair;
    @FXML private Menu menuOrdemServico;
    @FXML private MenuItem menuItemGerenciarOs;
    @FXML private Menu menuRelatorios;
    @FXML private MenuItem menuItemClientesGeral;
    @FXML private MenuItem menuItemClientesEndTelefone;
    @FXML private Menu menuSobre;
    @FXML private MenuItem menuItemSistema;
    @FXML private HBox hb_bottom;

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        menuItemCidades.setGraphic(new ImageView("/icons/icon_cidade32.png"));
        menuItemClientes.setGraphic(new ImageView("/icons/icon_clientes32.png"));
        menuItemFornecedores.setGraphic(new ImageView("/icons/icon_forn32.png"));
        menuItemFuncionarios.setGraphic(new ImageView("/icons/icon_func32.png"));
        menuItemProdutos.setGraphic(new ImageView("/icons/icon_produto32.png"));
        menuItemUsuarios.setGraphic(new ImageView("/icons/icon_user48.png"));
        menuItemSair.setGraphic(new ImageView("/icons/icon_sair32.png"));
        
        menuItemGerenciarOs.setGraphic(new ImageView("/icons/icon_ordemServico32.png"));
        
        menuItemClientesGeral.setGraphic(new ImageView("/icons/icon_relatorio32.png"));
        menuItemClientesEndTelefone.setGraphic(new ImageView("/icons/icon_relatorio32.png"));
        
        menuItemSistema.setGraphic(new ImageView("/icons/icon_info32.png"));
    }    

    @FXML
    private void acessarCidades(ActionEvent event) {
        
        
    }

    @FXML
    private void acessarClientes(ActionEvent event) {
    }

    @FXML
    private void acessarFornecedores(ActionEvent event) {
    }

    @FXML
    private void acessarFuncionarios(ActionEvent event) {
    }

    @FXML
    private void acessarProdutos(ActionEvent event) {
    }

    @FXML
    private void acessarUsuarios(ActionEvent event) {
    }

    @FXML
    private void acessarSair(ActionEvent event) {
    }

    @FXML
    private void acessarGerenciarOs(ActionEvent event) {
    }

    @FXML
    private void acessarRelClientesGeral(ActionEvent event) {
    }

    @FXML
    private void acessarRelClientesEndTelefone(ActionEvent event) {
    }

    @FXML
    private void acessarSistema(ActionEvent event) {
    }
}
