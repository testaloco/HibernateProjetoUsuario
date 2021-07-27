package controller;

import dao.UsuarioDAO;
import entities.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class UsuarioController {

    @FXML
    TextField textId, textNome, textEmail, textTelefone, textEndereco;
    @FXML
    Button btCadastro;




    // Coleta de dados
    public void btnCadastro(ActionEvent event){
        Usuario user = new Usuario();
        user.setNome(textNome.getText().toString());
        user.setEmail(textEmail.getText().toString());
        user.setTelefone(textTelefone.getText().toString());
        user.setEndereco(textEndereco.getText().toString());
        Long idCadastrado = UsuarioDAO.cadastro(user).getId();
        System.out.println("Usuario cadastrado: " + idCadastrado);

    }
    //Pesquisar dados
    public void pesquisa(ActionEvent e){
        Long id = Long.parseLong(textId.getText().toString());
        Usuario usua = UsuarioDAO.pesquisa(id);
        textNome.setText(usua.getNome());
        textEmail.setText(usua.getEmail());
        textTelefone.setText(usua.getTelefone());
        textEndereco.setText(usua.getEndereco());
        System.out.println("Erro!!!!!!");

    }
    public void modificar(ActionEvent e) {
        Long id = Long.parseLong(textId.getText().toString());
        Usuario usuario = UsuarioDAO.uptade(id);
        textNome.setText(usuario.getNome());
        textEmail.setText(usuario.getEmail());
        textTelefone.setText(usuario.getTelefone());
        textEndereco.setText(usuario.getEndereco());
    }


}
