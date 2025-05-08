package ListaTarefas;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarefas {
    private static ArrayList<String> tarefas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean executando = true;

        while (executando) {
            System.out.println("\n--- Lista de Tarefas ---");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Listar Tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    adicionarTarefa();
                    break;
                case 2:
                    removerTarefa();
                    break;
                case 3:
                    listarTarefas();
                    break;
                case 4:
                    executando = false;
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void adicionarTarefa() {
        System.out.print("Digite a tarefa a ser adicionada: ");
        String tarefa = scanner.nextLine();
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    private static void removerTarefa() {
        if (tarefas.isEmpty()) {
            System.out.println("A lista de tarefas está vazia!");
            return;
        }

        System.out.println("Tarefas disponíveis:");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }

        System.out.print("Digite o número da tarefa a ser removida: ");
        int indice = scanner.nextInt() - 1;
        scanner.nextLine(); // Limpar o buffer

        if (indice >= 0 && indice < tarefas.size()) {
            String tarefaRemovida = tarefas.remove(indice);
            System.out.println("Tarefa '" + tarefaRemovida + "' removida com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }

    private static void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("A lista de tarefas está vazia!");
            return;
        }

        System.out.println("\n--- Tarefas ---");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }
    }
}