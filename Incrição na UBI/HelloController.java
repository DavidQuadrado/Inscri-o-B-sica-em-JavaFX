package com.example.ficha1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField nome;

    @FXML
    private TextField num;

    @FXML
    private TextField curso;

    @FXML
    private Button registro;

    @FXML
    private Button exit;
    @FXML
    protected void RegistroClick (){
        System.out.println("hail beans");
        String nome_aluno = nome.getText();
        String numero_aluno = num.getText();
        String curso_aluno = curso.getText();

        System.out.println("Aluno: " + nome_aluno +" " +  " Número: " + numero_aluno  + "" +  " Curso: " + curso_aluno);

        nome.setText("");
        num.setText("");
        curso.setText("");
    }
}