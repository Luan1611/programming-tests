package exercicio3;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        List<Contato> listaContatos = new ArrayList<>();
        listaContatos.add(new Contato("Pedro", "123456", Contato.TipoContato.WHATSAPP));
        listaContatos.add(new Contato("João", "234567", Contato.TipoContato.WHATSAPP));
        listaContatos.add(new Contato("Maria", "345678", Contato.TipoContato.MESSENGER));
        listaContatos.add(new Contato("Pedro", "123456", Contato.TipoContato.TELEGRAM));
        listaContatos.add(new Contato("Maria", "345678", Contato.TipoContato.MESSENGER));
        listaContatos.add(new Contato("Fernanda", "456789", Contato.TipoContato.TELEGRAM));
        listaContatos.add(new Contato("Fer", "456789", Contato.TipoContato.WHATSAPP));

        //Item 1 - Criando o set com contatos não repetidos (como ficou em aberto no item 1 o que seria
        // um contato igual ao outro, defini que, se dois contatos tiverem o mesmo numero, basta para serem iguais
        Set<Contato> setDeContatos = new HashSet<>();
        setDeContatos.addAll(listaContatos);
        // Imprimindo o Set
        for (Contato contato : setDeContatos) {
            System.out.println(contato);
        }

        //Item 2 - Criando lista somente com os nomes dos contatos da listaContatos e imprimindo-a
        List<String> listaComNomesDosContatos = new ArrayList<>();
        listaComNomesDosContatos = listaContatos.stream().map((Contato contato) -> contato.getNome()).toList();
        listaComNomesDosContatos.forEach(contato -> System.out.println(contato));

        //Item 3 - Criando lista somente com os contatos de WHATSAPP e imprimindo-a
        List<Contato> listaContatosDeWhatsApp = new ArrayList<>();
        listaContatosDeWhatsApp = listaContatos.stream().filter( contato ->  contato.getTipo() == Contato.TipoContato.WHATSAPP).toList();
        listaContatosDeWhatsApp.forEach(contatoDeWhatsapp -> System.out.println(contatoDeWhatsapp));


        //Items 4 e 5: feitos na classe Contato
        

        //Item 6
        //crie um HashSet, um LinkedHashSet e um TreeSet que contenha somente os contatos não
        //repetidos segundo o critério do número.

        Set<Contato> contatosComNumerosNaoRepetidosHashSet = new HashSet<>(listaContatos);

        Set<Contato> contatosComNumerosNaoRepetidosLinkedHashSet = new LinkedHashSet<>();
        contatosComNumerosNaoRepetidosLinkedHashSet.addAll(listaContatos);

        Set<Contato> contatosComNumerosNaoRepetidosTreeSet = new TreeSet<>();
        contatosComNumerosNaoRepetidosTreeSet.addAll(listaContatos);

    }
}
