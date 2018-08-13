package br.com.datamob.teste.testejava;

import java.util.ArrayList;
import java.util.Date;

public class Facebook extends RedeSocial implements FeedNoticiasSites, Exemplo
{
    private ArrayList<Amigo> amigos;
    private ArrayList<Publicacao> publicacoes;
    private ArrayList<Evento> eventos;

    public Facebook(String nomeUsuario, String senha)
    {
        super(nomeUsuario, senha);
        inicializaListas();
    }

    public Facebook()
    {
        super();
        inicializaListas();
    }

    private void inicializaListas()
    {
        amigos = new ArrayList<>();
        publicacoes = new ArrayList<>();
        eventos = new ArrayList<>();
    }

    @Override
    public void publicar(String texto)
    {
        publicacoes.add(new Publicacao(new Date().getTime(), texto));
    }

    @Override
    public String getEnderecoPerfil()
    {
        return "facebook:" + getNomeUsuario();
    }

    @Override
    public String getFeed()
    {
        String feed = "";
        for (Publicacao publicacao : publicacoes)
        {
            feed += publicacao.getTexto() + "\n";
        }
        return feed;
    }

    public void addEvento(Evento evento)
    {
        eventos.add(evento);
    }

    public void addAmigo(Amigo amigo)
    {
        amigos.add(amigo);
    }

    @Override
    public void fazAlgumaCoisa()
    {

    }
}
