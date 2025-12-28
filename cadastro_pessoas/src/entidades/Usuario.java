package entidades;

public class Usuario {
	private int id;
	private String login;
	private String password;
	private String username;
	private String email;

	public Usuario(int id, String login, String password, String username, String email){
		this.id = id;
		this.login = login;
		this.password = password;
		this.username = username;
		this.email = email;
	}

	public int getId(){
		return id;
	}

	public String getLogin(){
		return login;
	}

	public void setLogin(String login){
		this.login = login;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getUsername(){
		return username;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String toString(){
		String saida;
		saida = "ID Usuario: "+getId()+
		        "\nLogin: "+getLogin()+
		        "\nPassword: "+getPassword()+
		        "\nUsername: "+getUsername()+
		        "\nEmail: "+getEmail();
		return saida;
	}
}