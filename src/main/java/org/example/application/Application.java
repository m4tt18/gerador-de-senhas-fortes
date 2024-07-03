package org.example.application;

import org.example.entities.Gerador;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Application {
    public static void main(String[] args) {

        Gerador gerador = new Gerador();
        System.out.println("Senha gerada com sucesso: ");
        System.out.println(gerador.passwordGenerator(8, true, true));
    }
}