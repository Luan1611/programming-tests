public class Musica {

    private String nome;
    private int anoLancamento;
    private int duracao;
    private int QTDE_MAX_ALBUNS = 10;
    private int QTDE_MAX_INTERPRETES = 10;
    private int QTDE_MAX_COMPOSITORES = 10;

    private int contadorAlbuns = 0;
    private int contadorInterpretes = 0;
    private int contadorCompositores = 0;
    private Album [] albuns = new Album[QTDE_MAX_ALBUNS];
    private Artista [] interpretes = new Artista[QTDE_MAX_INTERPRETES];
    private Artista [] compositores = new Artista[QTDE_MAX_COMPOSITORES];

    public Musica(String nome, int anoLancamento, int duracao) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }

    public void addAlbum(Album album) {

        if (contadorAlbuns > 0) {
            boolean albumJaAdd = false;
            for (int i = 0; i < contadorAlbuns; i++) {
                if (albuns[i].equals(album)) {
                    albumJaAdd = true;
                    break;
                }
            if (albumJaAdd) {
                System.out.println("O álbum já havia sido adicionado à música. Operação não realizada");
            } else {
                albuns[contadorAlbuns] = album;
                contadorAlbuns++;
                System.out.println("Album adicionado à música");
            }

            }
        } else {
            albuns[0] = album;
            contadorAlbuns++;
            System.out.println("Album adicionado à música");
        }
    }

    public void addInterprete(Artista interprete) {

        if (contadorInterpretes > 0) {
            boolean interpreteJaAdd = false;
            for (int i = 0; i < contadorInterpretes; i++) {
                if (interpretes[i].equals(interprete)) {
                    interpreteJaAdd = true;
                    break;
                }
                if (interpreteJaAdd) {
                    System.out.println("O interprete já havia sido adicionado à música. Operação não realizada");
                } else {
                    interpretes[contadorInterpretes] = interprete;
                    contadorInterpretes++;
                    System.out.println("Interprete adicionado à música");
                }

            }
        } else {
            interpretes[0] = interprete;
            contadorInterpretes++;
            System.out.println("Interprete adicionado à música");
        }
    }

    public void addCompositor(Artista compositor) {

        if (contadorCompositores > 0) {
            boolean compositorJaAdd = false;
            for (int i = 0; i < contadorCompositores; i++) {
                if (compositores[i].equals(compositor)) {
                    compositorJaAdd = true;
                    break;
                }
                if (compositorJaAdd) {
                    System.out.println("O compositor já havia sido adicionado à música. Operação não realizada");
                } else {
                    compositores[contadorCompositores] = compositor;
                    contadorCompositores++;
                    System.out.println("compositor adicionado à música");
                }

            }
        } else {
            compositores[0] = compositor;
            contadorCompositores++;
            System.out.println("compositor adicionado à música");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getQTDE_MAX_ALBUNS() {
        return QTDE_MAX_ALBUNS;
    }

    public void setQTDE_MAX_ALBUNS(int QTDE_MAX_ALBUNS) {
        this.QTDE_MAX_ALBUNS = QTDE_MAX_ALBUNS;
    }

    public int getQTDE_MAX_INTERPRETES() {
        return QTDE_MAX_INTERPRETES;
    }

    public void setQTDE_MAX_INTERPRETES(int QTDE_MAX_INTERPRETES) {
        this.QTDE_MAX_INTERPRETES = QTDE_MAX_INTERPRETES;
    }

    public int getQTDE_MAX_COMPOSITORES() {
        return QTDE_MAX_COMPOSITORES;
    }

    public void setQTDE_MAX_COMPOSITORES(int QTDE_MAX_COMPOSITORES) {
        this.QTDE_MAX_COMPOSITORES = QTDE_MAX_COMPOSITORES;
    }

    public int getContadorAlbuns() {
        return contadorAlbuns;
    }

    public void setContadorAlbuns(int contadorAlbuns) {
        this.contadorAlbuns = contadorAlbuns;
    }

    public int getContadorInterpretes() {
        return contadorInterpretes;
    }

    public void setContadorInterpretes(int contadorInterpretes) {
        this.contadorInterpretes = contadorInterpretes;
    }

    public int getContadorCompositores() {
        return contadorCompositores;
    }

    public void setContadorCompositores(int contadorCompositores) {
        this.contadorCompositores = contadorCompositores;
    }

    public Album[] getAlbuns() {
        return albuns;
    }

    public void setAlbuns(Album[] albuns) {
        this.albuns = albuns;
    }

    public Artista[] getInterpretes() {
        return interpretes;
    }

    public void setInterpretes(Artista[] interpretes) {
        this.interpretes = interpretes;
    }

    public Artista[] getCompositores() {
        return compositores;
    }

    public void setCompositores(Artista[] compositores) {
        this.compositores = compositores;
    }
}