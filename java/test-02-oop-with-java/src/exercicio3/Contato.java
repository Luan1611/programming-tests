package exercicio3;

import java.util.Objects;

public class Contato implements Comparable<Contato> {

    enum TipoContato{
        WHATSAPP,
        TELEGRAM,
        MESSENGER,
    }

    private String nome;
    private String numero;
    private TipoContato tipo;

    public Contato(String nome, String numero, TipoContato tipo) {
        this.nome = nome;
        this.numero = numero;
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(numero, contato.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public int compareTo(Contato o) {
        return this.numero.compareTo(o.getNumero());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoContato getTipo() {
        return tipo;
    }

    public void setTipo(TipoContato tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero='" + numero + '\'' +
                ", tipo=" + tipo +
                '}';
    }

}