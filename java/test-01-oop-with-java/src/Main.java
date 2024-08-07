
public class Main {

    public static void main(String[] args) {

        Artista artista1 = new Artista("Roberto", "Betinho");
        Artista artista2 = new Artista("Maria", "Mar");
        Artista artista3 = new Artista("Giovana", "Gigi");
        Artista artista4 = new Artista("José", "Zé");
        Artista artista5 = new Artista("Mateus", "Ma");

        Musica musica1 = new Musica("Sertão", 1980, 200);
        Musica musica2 = new Musica("Minha terra", 1995, 150);
        Musica musica3 = new Musica("Hino Nacional", 1880, 100);
        Musica musica4 = new Musica("Timão", 2000, 300);
        Musica musica5 = new Musica("Mad Max", 2010, 220);
        Musica musica6 = new Musica("Fúria", 2020, 320);
        Musica musica7 = new Musica("Zero", 2001, 230);
        Musica musica8 = new Musica("NTZ", 2005, 120);
        Musica musica9 = new Musica("Zombie", 1930, 210);
        Musica musica10 = new Musica("Fazenda", 1997, 105);

        Album album1 = new Album("MPB", Formato.DIGITAL);
        Album album2 = new Album("Clássicas", Formato.K7);
        Album album3 = new Album("Rock", Formato.CD);

        musica1.addCompositor(artista1);
        musica1.addInterprete(artista2);

        musica2.addCompositor(artista1);
        musica2.addCompositor(artista5);

        album1.addMusica(musica1);
        album1.addMusica(musica2);
        album1.addMusica(musica3);

        //mostrando valor de cada álbum
        if (album1.getValor() == -1){
            System.out.println("Formato do Álbum não está definido para calcular valor.");
            //impossível entrar aqui, pois no construtor já tenho que definir o formato.
        } else {
            System.out.println("Valor do Álbum 1: " + album1.getValor());//tem músicas, então haverá valor > 0
        }

        System.out.println("Valor do Álbum 2: " + album2.getValor());// se tiver sem músicas, valor é zero
        System.out.println("Valor do Álbum 3: " + album3.getValor());

        System.out.println(musica1.getNome());
        System.out.println(musica1.getAnoLancamento());

        artista1.addMusica(musica1);

        System.out.println(album1.getContadorMusicas());//3 músicas no álbum

        System.out.println(album1.getFormato());//formato digital

        System.out.println(album1.getTitulo());
    }
}