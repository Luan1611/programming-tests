package exercicio2;

import java.util.Comparator;

public class ComparadorDeAlunos implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {

        int resultadoComparacaoNome = o1.getNome().compareTo(o2.getNome());
        int resultadoComparacaoAnoIngresso = Integer.compare(o1.getAnoIngresso(), o2.getAnoIngresso());

        if (resultadoComparacaoNome == 0) {
            return resultadoComparacaoAnoIngresso;
        }
        return resultadoComparacaoNome;

    }
}
