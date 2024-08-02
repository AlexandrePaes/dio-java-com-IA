package com.vendas.iphone;

public class iPhone implements IReprodutor, ITelefone, INavegador {
    private String modelo;
    private int ano;

    public iPhone(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos da interface IReprodutor
    @Override
    public void play() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pause() {
        System.out.println("Pausando música.");
    }

    @Override
    public void stop() {
        System.out.println("Parando música.");
    }

    // Métodos da interface ITelefone
    @Override
    public void ligar() {
        System.out.println("Ligando para um número.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a uma chamada.");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a chamada.");
    }

    // Métodos da interface INavegador
    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando página.");
    }

    // Getters e Setters para modelo e ano
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
