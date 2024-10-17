package com.taskmanager;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        task task1 = new task("Estudar Java", "Revisar conceitos de POO", "Pendente", LocalDate.of(2024, 10, 31));
        task task2 = new task("Fazer compras", "Comprar frutas e legumes", "Pendente", LocalDate.of(2024, 10, 20));

        // Exibindo informações das tarefas
        System.out.println("Tarefa 1:");
        System.out.println("Título: " + task1.getTitle());
        System.out.println("Descrição: " + task1.getDescription());

        System.out.println("Data de Vencimento: " + task1.getDueDate());

        System.out.println("\nTarefa 2:");
        System.out.println("Título: " + task2.getTitle());
        System.out.println("Descrição: " + task2.getDescription());

        System.out.println("Data de Vencimento: " + task2.getDueDate());


        task1.markAsComplete();
        System.out.println("\nApós concluir a tarefa 1:");
        System.out.println("Título: " + task1.getTitle());
        System.out.println("Descrição: " + task1.getDescription());

        System.out.println("Data de Vencimento: " + task1.getDueDate());

    }

}
