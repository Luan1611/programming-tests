package exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Scanner entradaPadrao = new Scanner(System.in);
        boolean entrarNovoPassageiro = true;
        List<Passageiro> listaPassageiros = new ArrayList<>();

        while (entrarNovoPassageiro) {

            Passageiro passageiro = leiaPassageiro(entradaPadrao);

            if (passageiro != null) {

                if (listaPassageiros.size() == 0) {

                    listaPassageiros.add(passageiro);

                } else {

                    //Verificando se já não existe algum outro passageiro com o mesmo assento
                    boolean jaExistePassageiroComOAssento = false;

                    for (Passageiro passageiroDaLista : listaPassageiros) {
                        if (passageiro.getAssento() == passageiroDaLista.getAssento()) {
                            jaExistePassageiroComOAssento = true;
                            break;
                        }
                    }
                    if (jaExistePassageiroComOAssento) {
                        System.out.println("Já existe outro passageiro com o mesmo assento. Inserção não realizada.");
                    } else {
                        listaPassageiros.add(passageiro);
                    }
                }

            }

            System.out.print("Ler mais um passageiro (S/N): ");
            String resposta = entradaPadrao.nextLine();

            entrarNovoPassageiro = resposta.equalsIgnoreCase("S");
        }
        //Ordenando a lista de passageiros
        Collections.sort(listaPassageiros);

        //Mostrando lista de passageiros já ordenada com forEach
        System.out.print("\nLista de passageiros ordenada de acordo com os assentos escolhidos (de forma crescente): \n");
        listaPassageiros.forEach(passageiro -> System.out.println(passageiro));

    }

    private static Passageiro leiaPassageiro(Scanner entradaPadrao) {

        System.out.print("Nome: ");
        String nome = entradaPadrao.nextLine();
        int assento = -1;

        try {
            boolean assentoNegativo = true;

            while (assentoNegativo) {
                System.out.print("Assento: ");
                assento = Integer.parseInt(entradaPadrao.nextLine());
                if (assento < 0) {
                    System.out.println("Digite um número inteiro maior do que zero para o assento .");
                } else {
                    assentoNegativo = false;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro. Assento digitado deve ser um número inteiro. Inserção não realizada.");
            return null;
        }

        return new Passageiro(nome, assento);
    }

}