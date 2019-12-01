package domain;

public class Usuario {
	
	private int idUsuario;
	private String nombre;
	private String apellido;
	private String correo;
	private String contrase�a;
	private Long cedula;
	private Long telefono;
	private String urlFoto;
	
	
	public Usuario(int idUsuario, String nombre, String apellido, String correo, String contrase�a,
			Long cedula, Long telefono, String urlFoto) {
		this.idUsuario = idUsuario;
		this.nombre= nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contrase�a = contrase�a;
		this.cedula = cedula;
		this.telefono = telefono;
		this.urlFoto = urlFoto;	
	}
	
	
	//Constructor para el servicio /RegistrarUsuario
	public Usuario(String nombre, String apellido, String correo, String contrase�a,
			Long cedula, Long telefono) {
		this.nombre= nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contrase�a = contrase�a;
		this.cedula = cedula;
		this.telefono = telefono;
		
	}
	
	

	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public Long getCedula() {
		return cedula;
	}

	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public String getUrlFoto() {
		return urlFoto;
	}

	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}
	
	

}
