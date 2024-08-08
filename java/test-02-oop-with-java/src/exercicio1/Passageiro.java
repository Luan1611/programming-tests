package exercicio1;

public class Passageiro implements Comparable<Passageiro> {

    private String nome;
    private int assento;

    public Passageiro(String nome, int assento) {
        this.nome = nome;
        this.assento = assento;
    }

    @Override
    public int compareTo(Passageiro o) {
        return Integer.compare(this.assento, o.getAssento());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAssento() {
        return assento;
    }

    public void setAssento(int assento) {
        this.assento = assento;
    }

    @Override
    public String toString() {
        return "Passageiro{" +
                "nome='" + nome + '\'' +
                ", assento=" + assento +
                '}';
    }
}
