package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        System.out.println(anime.getEpisodios());
        System.out.println("Fora do bloco de inicializacao");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
            
        }

    }
}
