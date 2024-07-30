package dio.RestApiProject.model;

public class Usuario {
	private Integer id;
	private String login;
	private String password;

	public Usuario() {
		super();
	}

	public Usuario(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	// Getters e Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario {Login:" + login + ", Password: " + password + "}";
	}

}
