
package br.com.codeplus;

public class Computador {
    private String marca;
    private String modelo;
    private String processador;
    private int memoriaRAM;
    private double armazenamento;

    // Construtor default
    public Computador() {
        this.marca = "Desconhecida";
        this.modelo = "Desconhecido";
        this.processador = "Desconhecido";
        this.memoriaRAM = 0;
        this.armazenamento = 0.0;
    }

    // Construtor com parâmetros
    public Computador(String marca, String modelo, String processador, int memoriaRAM, double armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }

    // Getters e Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getProcessador() { return processador; }
    public void setProcessador(String processador) { this.processador = processador; }

    public int getMemoriaRAM() { return memoriaRAM; }
    public void setMemoriaRAM(int memoriaRAM) { this.memoriaRAM = memoriaRAM; }

    public double getArmazenamento() { return armazenamento; }
    public void setArmazenamento(double armazenamento) { this.armazenamento = armazenamento; }

    // Método para imprimir atributos
    public void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaRAM + " GB");
        System.out.println("Armazenamento: " + armazenamento + " GB");
        System.out.println("--------------------------");
    }
}
