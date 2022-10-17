package academy.devdojo.maratonajava.javacore.DConstrutores.Dominio;


public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;


   public Anime(String nome, String tipo, int episodios, String genero){
       this();
       System.out.println("Dentro do construtor");
       this.nome = nome;
       this.tipo = tipo;
       this.episodios = episodios;
       this.genero = genero;
   }

   public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
       this(nome, tipo, episodios, genero);
       this.estudio = estudio;
   }


   public Anime(){
       System.out.println("Dentro do construtor sem argumentos");
   }

    public void imprime(){
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.estudio);
       }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setEpisodios(int espisodios){
        this.episodios = espisodios;
    }
    public int getEpisodios(){
        return this.episodios;
    }
   }