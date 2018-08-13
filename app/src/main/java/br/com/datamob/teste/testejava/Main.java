package br.com.datamob.teste.testejava;

import android.view.View;

import java.util.ArrayList;

public class Main implements View.OnClickListener
{
    private static ArrayList<RedeSocial> redeSocials = new ArrayList<>();
    private static ArrayList<Twitter> twitters = new ArrayList<>();
    private static ArrayList<Facebook> facebooks = new ArrayList<>();

    public void main()
    {
        addFacebook(new Facebook());
        addTwitter(new Twitter());

        for(RedeSocial redeSocial : redeSocials)
        {
            redeSocial.getEnderecoPerfil();
        }
    }

    private static void addFacebook(Facebook facebook)
    {
        redeSocials.add(facebook);
        facebooks.add(facebook);
    }

    private static  void addTwitter(Twitter twitter)
    {
        redeSocials.add(twitter);
        twitters.add(twitter);
    }

    @Override
    public void onClick(View view)
    {

    }
}
