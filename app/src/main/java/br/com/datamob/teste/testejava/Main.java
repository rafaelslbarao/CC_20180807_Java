package br.com.datamob.teste.testejava;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Display;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
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


        twitters.get(0).getFeed();

        Button button = new Button(new Context()
        {
        });
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                clickouNoBotao();
            }
        });
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
