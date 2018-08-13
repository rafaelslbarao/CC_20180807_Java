package br.com.datamob.teste.testejava;

public class Amigo
{
    private String nome;
    private String nivel;

    public Amigo(String nome, String nivel)
    {
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNivel()
    {
        return nivel;
    }

    public void setNivel(String nivel)
    {
        this.nivel = nivel;
    }
}
