enum Formato {CD, LP, K7, DIGITAL}

public class Album {

    private String titulo;
    private Formato formato;

    private int contadorMusicas = 0;
    private int QTDE_MAX_MUSICAS = 10;
    private Musica [] musicas = new Musica[QTDE_MAX_MUSICAS];

    public Album(String titulo, Formato formato) {
        this.titulo = titulo;
        this.formato = formato;
    }

    public double getValor() {
        double valorBase;
        double somaValoresMusicas = 0.0;
        if (formato.equals(Formato.CD)){
            valorBase = 50.0;
            if (contadorMusicas > 0){
                for (int i = 0; i < contadorMusicas; i++) {
                    if (musicas[i].getContadorInterpretes() == 1 && musicas[i].getContadorCompositores() == 1){
                        somaValoresMusicas += 1.0;
                    }
                    if (musicas[i].getContadorInterpretes() > 1 || musicas[i].getContadorCompositores() > 1){
                        somaValoresMusicas += 1.5;

                    }
                }
                return somaValoresMusicas;
            }
            return somaValoresMusicas;
        }
        if (formato.equals(Formato.LP)){
            valorBase = 25.0;
            if (contadorMusicas > 0){
                for (int i = 0; i < contadorMusicas; i++) {
                    if (musicas[i].getContadorInterpretes() == 1 && musicas[i].getContadorCompositores() == 1){
                        somaValoresMusicas += 1.0;
                    }
                    if (musicas[i].getContadorInterpretes() > 1 || musicas[i].getContadorCompositores() > 1){
                        somaValoresMusicas += 1.5;
                    }
                }
                return somaValoresMusicas;
            }
            return somaValoresMusicas;
        }
        if (formato.equals(Formato.K7)){
            valorBase = 10.0;
            if (contadorMusicas > 0){
                for (int i = 0; i < contadorMusicas; i++) {
                    if (musicas[i].getContadorInterpretes() == 1 && musicas[i].getContadorCompositores() == 1){
                        somaValoresMusicas += 1.0;
                    }
                    if (musicas[i].getContadorInterpretes() > 1 || musicas[i].getContadorCompositores() > 1){
                        somaValoresMusicas += 1.5;
                    }
                }
                return somaValoresMusicas;
            }
            return somaValoresMusicas;
        }
        if (formato.equals(Formato.DIGITAL)){
            valorBase = 0.0;
            if (contadorMusicas > 0){
                for (int i = 0; i < contadorMusicas; i++) {
                    if (musicas[i].getContadorInterpretes() == 1 && musicas[i].getContadorCompositores() == 1){
                        somaValoresMusicas += 1.0;
                    }
                    if (musicas[i].getContadorInterpretes() > 1 || musicas[i].getContadorCompositores() > 1){
                        somaValoresMusicas += 1.5;
                    }
                }
                return somaValoresMusicas;
            }
            return somaValoresMusicas;
        }
    return -1.0;
    }

    public void addMusica(Musica musica) {

        if (contadorMusicas > 0) {
            boolean musicaJaAdd = false;
            for (int i = 0; i < contadorMusicas; i++) {
                if (musicas[i].equals(musica)) {
                    musicaJaAdd = true;
                    break;
                }
            }
            if (musicaJaAdd) {
                System.out.println("A música já havia sido adicionada ao álbum. Operação não realizada");
            } else {
                if (contadorMusicas == QTDE_MAX_MUSICAS){
                    //exclusao lógica
                    for (int j = 0; j < contadorMusicas - 1; j++) {
                        musicas[j] = musicas[j+1];
                    }
                    musicas[contadorMusicas] = musica;
                    System.out.println("Música '" + musica.getNome() + "' adicionada ao Álbum '" + titulo + "'já cheio. A música mais antiga foi excluída do álbum");
                } else {
                    musicas[contadorMusicas] = musica;
                    contadorMusicas++;
                    System.out.println("Música '" + musica.getNome() + " 'adicionada ao álbum '" + titulo + "'.");
                    }
            }
        } else {
            musicas[0] = musica;
            contadorMusicas++;
            System.out.println("Música '" + musica.getNome() + "' adicionada ao álbum '" + titulo + "'.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public int getQTDE_MAX_MUSICAS() {
        return QTDE_MAX_MUSICAS;
    }

    public void setQTDE_MAX_MUSICAS(int QTDE_MAX_MUSICAS) {
        this.QTDE_MAX_MUSICAS = QTDE_MAX_MUSICAS;
    }

    public Musica[] getMusicas() {
        return musicas;
    }

    public void setMusicas(Musica[] musicas) {
        this.musicas = musicas;
    }

    public int getContadorMusicas() {
        return contadorMusicas;
    }

    public void setContadorMusicas(int contadorMusicas) {
        this.contadorMusicas = contadorMusicas;
    }
}
