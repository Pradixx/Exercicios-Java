import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Empregados;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Empregados> list = new ArrayList<>();

        System.out.print("Quantos empregados deseja registrar: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.println("Empregado #" + (i + 1) + ":");

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("ID: ");
            Integer id = sc.nextInt();
            while (hasID(list, id)) {
                System.out.println("Id não existente! Digite denovo: ");
                id = sc.nextInt();
            }

            System.out.print("Salario: ");
            Double salario = sc.nextDouble();

            Empregados emp = new Empregados(nome, id, salario);
            list.add(emp);
        }

        System.out.print("Digite o ID do funcionário que terá o salário aumentado: ");
        int id_pesquisado = sc.nextInt();

        Empregados emp = list.stream().filter(x -> x.getId() == id_pesquisado).findFirst().orElse(null);

        if (emp == null){
            System.out.println("ID não existente");
        } else {
            System.out.println("Coloque a porcentagem: ");
            double porcentagem = sc.nextDouble();
            emp.aumentandoSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de empregados:");
        for (Empregados e : list){
            System.out.println(e);
        }

        sc.close();
    }

    public static Integer position(List<Empregados> list, int id){
        for (int i=0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

    public static boolean hasID(List<Empregados> list, int id){
        Empregados emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}