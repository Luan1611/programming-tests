package exercicio2;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        Scanner entradaPadrao = new Scanner(System.in);
        boolean entrarNovoAluno = false;

        // Item 1
        Map<String, Aluno> alunosMap = new HashMap<>();

        // Item 3
        List<Aluno> listaAlunosOrdenada = new ArrayList<>();

        do {

            System.out.print("Prontuário: ");
            String prontuario = entradaPadrao.nextLine();
            System.out.print("Nome: ");
            String nome = entradaPadrao.nextLine();

            try {
                System.out.print("Ano de ingresso: ");
                int anoIngresso = Integer.parseInt(entradaPadrao.nextLine());
                Aluno aluno = inserirAluno(nome, anoIngresso);
                alunosMap.put(prontuario, aluno);
                listaAlunosOrdenada.add(aluno);
            } catch (NumberFormatException e) {
                System.out.println("Erro. Números inteiros são necessários para o ano ser válido. Inserção não realizada.");
            }

            System.out.println("Cadastrar novo Aluno? S/N");
            entrarNovoAluno = entradaPadrao.nextLine().equals("S");

        } while (entrarNovoAluno);

        // Item 1 (continuação)
        System.out.println("Imprimindo os conjuntos chave-valor do Map:");
        System.out.println(alunosMap.keySet());


        // Item 3 (continuação)
        // Ordenando a lista
        listaAlunosOrdenada.sort(new ComparadorDeAlunos());
        // Imprmindo a lista já ordenada
        System.out.println("Lista de alunos ordenada primeiro por nome e depois por ano de ingresso: ");
        listaAlunosOrdenada.stream().forEach(System.out::println);


        // Item 4
        List<Integer> listaDeAnosComAlunosIngressantes = listaAlunosOrdenada.stream().map((Aluno aluno) -> aluno.getAnoIngresso()).toList();
        Set <Integer> conjuntoAnosComAlunosIngressantes = new HashSet<>();
        conjuntoAnosComAlunosIngressantes.addAll(listaDeAnosComAlunosIngressantes);
        System.out.println("Imprimindo coleção com os anos onde houve alunos ingressantes (sem repetição de ano): ");
        for (Integer ano : conjuntoAnosComAlunosIngressantes) {
            System.out.println(ano);
        }

        // Item 5
        List<Aluno> alunosQueIngressaramEm2023 = new ArrayList<>();
        alunosQueIngressaramEm2023 = listaAlunosOrdenada.stream().filter(aluno -> aluno.getAnoIngresso() == 2023).toList();
        if (alunosQueIngressaramEm2023.size() > 0) {
            System.out.println("Lista dos alunos que ingressaram em 2023:");
            for (Aluno aluno : alunosQueIngressaramEm2023) {
                System.out.println(aluno);
            }
        } else {
            System.out.println("Não houve nenhum aluno que ingressou em 2023");
        }

    }

    private static Aluno inserirAluno(String nome, int anoIngresso) {
        Aluno a = new Aluno(nome);
        a.setAnoIngresso(anoIngresso);
        return a;
    }

}