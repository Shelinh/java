
package br.com.codeplus;

import java.util.ArrayList;
import java.util.Scanner;

public class AppComputador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Computador> listaComputadores = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar computador");
            System.out.println("2 - Listar computadores");
            System.out.println("3 - Verificar computador");
            System.out.println("4 - Excluir computador");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Informe os dados do computador:");
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Processador: ");
                    String processador = sc.nextLine();
                    System.out.print("Memória RAM (GB): ");
                    int ram = sc.nextInt();
                    System.out.print("Armazenamento (GB): ");
                    double armazenamento = sc.nextDouble();
                    sc.nextLine();

                    listaComputadores.add(new Computador(marca, modelo, processador, ram, armazenamento));
                    System.out.println("Computador cadastrado com sucesso!");
                    break;

                case 2:
                    if (listaComputadores.isEmpty()) {
                        System.out.println("Nenhum computador cadastrado.");
                    } else {
                        System.out.println("\n=== LISTA DE COMPUTADORES ===");
                        for (Computador c : listaComputadores) {
                            c.imprimir();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite a marca: ");
                    String marcaBusca = sc.nextLine();
                    System.out.print("Digite o modelo: ");
                    String modeloBusca = sc.nextLine();

                    boolean encontrado = false;
                    for (Computador c : listaComputadores) {
                        if (c.getMarca().equalsIgnoreCase(marcaBusca) &&
                            c.getModelo().equalsIgnoreCase(modeloBusca)) {
                            System.out.println("Computador encontrado:");
                            c.imprimir();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Computador não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite a marca: ");
                    String marcaDel = sc.nextLine();
                    System.out.print("Digite o modelo: ");
                    String modeloDel = sc.nextLine();

                    Computador compRemover = null;
                    for (Computador c : listaComputadores) {
                        if (c.getMarca().equalsIgnoreCase(marcaDel) &&
                            c.getModelo().equalsIgnoreCase(modeloDel)) {
                            compRemover = c;
                            break;
                        }
                    }
                    if (compRemover != null) {
                        listaComputadores.remove(compRemover);
                        System.out.println("Computador removido com sucesso!");
                    } else {
                        System.out.println("Computador não encontrado para exclusão.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
