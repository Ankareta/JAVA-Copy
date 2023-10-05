package persona;

public class Usuario {

	//Atributos
	private String tipoUsuario;
	private String username;
	private String password;
	
	//Crear un nuevo usuario //constructor
	
	public Usuario (String tipoUsuario, String username, String password) {
		this.tipoUsuario = tipoUsuario;
		this.username = username;
		this.password = password;
		
	}//Constructor

	
	//Recuperar contrasena//getter
	public String getPassword (String usernameAValidar) {
		//Si el user registrado coincide con el usuario que paso como parametro, obtengo la contrasena
		return password;
	}//getter
	
	
	//Cambiar contrasena //setter
	public void setPassword (String nuevoPassword) {
		//si la nueva contrasena es diferente a una cadena vacia y es diferente a la pass anterior...
		if (nuevoPassword != "" && nuevoPassword != password) {
			//entonces reemplazo la contrasena antereior
			password = nuevoPassword;
		}else {
			System.out.println("Lo siento, no puedo cambiar la contrasenia");
			
		}
	}
	
	
}// class usuario 
