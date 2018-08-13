package br.com.datamob.teste.testejava;

public class Publicacao
{
    private Long id;
    private String texto;

    public Publicacao(Long id, String texto)
    {
        this.id = id;
        this.texto = texto;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getTexto()
    {
        return texto;
    }

    public void setTexto(String texto)
    {
        this.texto = texto;
    }
}
