package aplicacao;

import Model.AdministradoresDAO;
import java.util.ArrayList;

public class Administradores {
    private int id;
    private String nome;
    private String cpf;
    private String senha;
    private String tipoUsuario;
    
    public Administradores(int id, String nome, String cpf, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.tipoUsuario = "Administrador";
    }
    
    public Administradores() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getTipoUsuario() {
		return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
            this.tipoUsuario = tipoUsuario;
    }
    public ArrayList<Administradores> listarTodosAdministradores() {
	return new AdministradoresDAO().getLista();
    }
}
