package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Employee> list = new ArrayList<>(); // ArrayList é uma interface

        System.out.println("How many employees will be registered:  ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1));
            System.out.print("Id: ");
            Integer id = in.nextInt();
            while (hasId(list, id)){
                System.out.println("Id already taken! Try again: ");
                id = in.nextInt();
            }
            System.out.print("Name: ");
            in.nextLine();
            String name = in.nextLine();
            System.out.print("Salary: ");
            Double salary = in.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp); // adicionando o objeto emp da classe Employee a lista List<Employee> list

        }

        System.out.println(" ");

        System.out.println("Enter the employee id that will have salary increase: ");
        int idSalary = in.nextInt();

        // chamando função para validar se o id existe na lista
        // Integer pos = position(list, idSalary); // procurando a posição do idSalary dentro da lista
        // ou
        // função lambda

        Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            Double percent = in.nextDouble();
            emp.increaseSalary(percent);
            // list.get(pos).increaseSalary(percent);
        }

        System.out.println(" ");
        System.out.println("List of employees: ");
        for (Employee e : list) { // emp se list
            System.out.println(e);
        }

        in.close();
    }

    // função auxiliar
    public static Integer position(List<Employee> list, int id) { // criando função para percorrer a lista e encontrar
                                                                  // id
        for (int i = 0; i < list.size(); i++) { // laço percorrendo a lista conforme tamanho .size()
            if (list.get(i).getId() == id) { // valida e pega o id da list
                return i;
            }
        }
        return null; // indica que o elemento não foi encontrado (-1) ou usar null;
    }

    public static boolean hasId (List<Employee> list, int id){//função para validar se o id já foi incluso na lista
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
