package br.com.datamob.teste.testejava;

import java.util.Date;

public class Twite
{
    public static final int MAX_CHAR = 280;
    //
    private String texto;
    private Date data;

    public String getTexto()
    {
        return texto;
    }

    public void setTexto(String texto) throws Exception
    {
        if(texto.length() <= MAX_CHAR)
            this.texto = texto;
        else
            throw new Exception("Número de caracteres extourado");
    }

    public Date getData()
    {
        return data;
    }

    public void setData(Date data)
    {
        this.data = data;
    }
}
