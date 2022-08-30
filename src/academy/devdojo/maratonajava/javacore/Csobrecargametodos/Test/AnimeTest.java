package academy.devdojo.maratonajava.javacore.Csobrecargametodos.Test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.Dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama drive", "TV", 12, "ação");
        anime.imprime();


    }
}
