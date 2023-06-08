package model;

public class Pizza{
    private String sabor;
    private double valor;
    private char tamanho;
    private String nome;

    public Pizza(String sabor, double valor, char tamanho) {
        this.sabor = sabor;
        this.valor = valor;
        this.tamanho = tamanho;
    }

    public String pedidoIfood(){
        return String.format("Sabor: %s - Valor: %.2f - Tamanho: %s", getSabor(), getValor(), getTamanho());
    }

    public Pizza(String nome){
        this.nome = nome;
    }

    public String nomeCliente(){
        return String.format("\n%s! Seu pedido chegou em nosso Whatsapp, logo logo está chegando em sua casa!", getNome());
    }
    


    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}