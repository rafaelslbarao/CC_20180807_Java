package br.com.datamob.teste.testejava;

import java.util.Date;

public class Evento
{
    private Date data;
    private String descricao;

    public Evento(Date data, String descricao)
    {
        this.data = data;
        this.descricao = descricao;
    }

    public Date getData()
    {
        return data;
    }

    public void setData(Date data)
    {
        this.data = data;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }
}
