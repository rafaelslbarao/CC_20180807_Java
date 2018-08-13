package br.com.datamob.teste.testejava;

public abstract class RedeSocial
{
    private String nomeUsuario;
    private String senha;

    public abstract void publicar(String texto);
    public abstract String getEnderecoPerfil();

    public RedeSocial()
    {
    }

    public RedeSocial(String nomeUsuario, String senha)
    {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public String getNomeUsuario()
    {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario)
    {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha()
    {
        return senha;
    }

    public void setSenha(String senha)
    {
        this.senha = senha;
    }
}
