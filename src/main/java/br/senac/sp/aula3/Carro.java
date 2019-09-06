/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula3;

//import static br.senac.sp.aula3.Main.assertEqual;
//import java.util.Arrays;
//import javax.swing.JOptionPane;
/**
 *
 * @author fernando.fernandes
 */
public class Carro {

    private static String fabricante;
    private String[] rodas;
    private String cor;
    private String modelo;
    private int velocidadeAtual;
    private int gasolina;
    private int max_gasolina;

    //Defina um construtor vazio para a classe
    public Carro() {
        max_gasolina = 40;
        gasolina = 20;
    }

    //Crie os métodos acessores getters
    public static String getFabricante() {
        return fabricante;
    }

    public String[] getRodas() {
        return rodas;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public int getGasolina() {
        return gasolina;
    }

    public int getMax_gasolina() {
        return max_gasolina;
    }

    //Crie os métodos acessores setters
    public static void setFabricante(String fabricante) {
        Carro.fabricante = fabricante;
    }

    public void setRodas(String[] rodas) {
        this.rodas = rodas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    public void setMax_gasolina(int max_gasolina) {
        this.max_gasolina = max_gasolina;
    }

    //Crie uma método "descreve"
    public String descreve() {

        String descricao = null;

        //Se o carro é um "Fiat Uno" "prata", esse método retorna 
        //"Um Fiat Uno na cor prata" (respeitando maiúsculas e minúsculas)
        if (("Fiat".equals(this.fabricante)) && ("Uno".equals(this.modelo)) && ("prata".equals(this.cor))) {
            descricao = "Um Fiat Uno na cor prata";
        }

        //Se o carro é um "Corsa" sem cor definida, esse método retorna "Um Corsa"
        if (this.cor == null) {
            descricao = "Um Corsa";
        } //Se o carro não tem o modelo definido, esse método retorna "Um carro"
        if (this.modelo == null) {
            descricao = "Um carro ";
        }

        return descricao;

    }

    public void abastece(int litros) {

        

        this.gasolina += litros;

        if (gasolina >= max_gasolina) {
            gasolina = max_gasolina;
        } else if (gasolina < max_gasolina) {
            gasolina = gasolina + litros;
        }
        System.out.println(" " + gasolina);

    }

}
