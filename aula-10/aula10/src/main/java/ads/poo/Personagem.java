package ads.poo;

public class Personagem {

    private String nome;
    private String raça;
    private String classe;
    private int vida;
    private int força;
    private int mana;
    private int defesa;
    private int nivel;

    public void setNome(String n){
      nome = n;
    }

    public void setRaça(String r){
        raça = r;
    }

    public void setClasse(String c){
        classe = c;
    }

    public void setNivel(){
        int i = nivel + 10;
        IO.println("Você está no nível 10.");
    }

    public void lançarFeitiço(){
        mana -= 10;
    }

    public void ataqueMonstro(){
        vida -= 10;
    }



}
