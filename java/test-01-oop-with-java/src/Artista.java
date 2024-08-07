public class Artista {

    private String nome;
    private String nomeArtistico;

    private final int QTDE_MAX_MUSICAS_COMPOSTAS_ARTISTA = 10;
    private final int QTDE_MAX_MUSICAS_INTERPRETADAS_ARTISTA = 10;
    private Musica [] musicascompostasPorArtista = new Musica[QTDE_MAX_MUSICAS_COMPOSTAS_ARTISTA];
    private Musica [] musicasInterpretadasPorArtista = new Musica[QTDE_MAX_MUSICAS_INTERPRETADAS_ARTISTA];

    private int contadorMusicasArtista = 0;

    public Artista(String nome, String nomeArtistico) {
        this.nome = nome;
        this.nomeArtistico = nomeArtistico;
    }

    public void addMusica(Musica musica) {

        if (contadorMusicasArtista > 0) {
            boolean musicaJaAdd = false;
            for (int i = 0; i < contadorMusicasArtista; i++) {
                if (musicascompostasPorArtista[i].equals(musica)) {
                    musicaJaAdd = true;
                    break;
                }
            if (musicaJaAdd) {
                System.out.println("A música já havia sido adicionada ao rol de músicas do artista. Operação não realizada");
            } else {
                if (contadorMusicasArtista == QTDE_MAX_MUSICAS_COMPOSTAS_ARTISTA){
                    //exclusao lógica
                    for (int j = 0; j < contadorMusicasArtista - 1; j++) {
                        musicascompostasPorArtista[i] = musicascompostasPorArtista[i+1];
                    }
                    musicascompostasPorArtista[contadorMusicasArtista] = musica;
                    System.out.println("Música integrada ao rol de músicas do artista já com limite de capacidade de músicas produzidas. A música mais antiga foi excluída do rol de músicas do artista.");
                } else {
                    musicascompostasPorArtista[contadorMusicasArtista] = musica;
                    contadorMusicasArtista++;
                    System.out.println("Música adicionada ao rol de músicas");
                }
            }
        }
    } else {
        musicascompostasPorArtista[0] = musica;
        contadorMusicasArtista++;
        System.out.println("Música adicionada ao álbum");
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeArtistico() {
        return nomeArtistico;
    }

    public void setNomeArtistico(String nomeArtistico) {
        this.nomeArtistico = nomeArtistico;
    }


    public int getQTDE_MAX_MUSICAS_ARTISTA() {
        return QTDE_MAX_MUSICAS_COMPOSTAS_ARTISTA;
    }

    public Musica[] getMusicasArtista() {
        return musicascompostasPorArtista;
    }

    public void setMusicasArtista(Musica[] musicasArtista) {
        this.musicascompostasPorArtista = musicasArtista;
    }

    public int getContadorMusicasArtista() {
        return contadorMusicasArtista;
    }

    public void setContadorMusicasArtista(int contadorMusicasArtista) {
        this.contadorMusicasArtista = contadorMusicasArtista;
    }
}