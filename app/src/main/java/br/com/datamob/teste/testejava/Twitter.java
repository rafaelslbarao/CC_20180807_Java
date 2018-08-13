package br.com.datamob.teste.testejava;

import java.util.ArrayList;
import java.util.Date;

public class Twitter extends RedeSocial implements FeedNoticiasSites
{
    private ArrayList<Twite> twites;
    private ArrayList<Seguidor> seguidors;

    public Twitter(String nomeUsuario, String senha)
    {
        super(nomeUsuario, senha);
        inicializaListas();
    }

    public Twitter()
    {
        super();
        inicializaListas();
    }

    private void inicializaListas()
    {
        twites = new ArrayList<>();
        seguidors = new ArrayList<>();
    }

    @Override
    public void publicar(String texto)
    {
        Twite twite = new Twite();
        twite.setData(new Date());
        try
        {
            twite.setTexto(texto);
        }
        catch (Exception e)
        {
        }
        twites.add(twite);
    }

    @Override
    public String getEnderecoPerfil()
    {
        return "twitter:" + getNomeUsuario();
    }

    @Override
    public String getFeed()
    {
        String feed = "";
        for(int i = 0; i < twites.size(); i++)
        {
            feed += twites.get(i).getTexto() + "\n";
        }
        return feed;
    }

    public void addSeguidor(Seguidor seguidor)
    {
        seguidors.add(seguidor);
    }
}
