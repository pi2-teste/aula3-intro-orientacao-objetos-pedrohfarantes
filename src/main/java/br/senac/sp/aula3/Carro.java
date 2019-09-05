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
        this.max_gasolina = 40;
        this.gasolina = 20;
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

        descricao = "Um " + fabricante + modelo + " na cor " + cor;

        if (modelo == null) {
            descricao = "Um " + modelo + " na cor " + cor;
        } else if (cor == null) {
            descricao = "Um " + fabricante + modelo;
        } else if (modelo == null) {
            descricao = "Um carro";
        }

        return descricao;

    }

    public void abastece(int litros) {

        if ((gasolina + litros) >= max_gasolina) {
            gasolina = 40;
        } else {

            gasolina = (gasolina + litros);
        }

    }

}
