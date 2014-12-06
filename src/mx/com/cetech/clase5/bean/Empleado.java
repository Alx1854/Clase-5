package mx.com.cetech.clase5.bean;
// No se crea método main
public class Empleado {
	// Creando un Java Bean.
	// Declaración de atributos tipo private.
	private String nombre;
	private int Edad;
	private int id;
	private String puesto;
	private String usuario;
	private String contrasenia;
	
	// Constructor por default
	public Empleado() {
		System.out.println("Ejecutando Contructor");
	}
	
	// Constructor con todos sus campos - llena todos los campos
	public Empleado(String nombre, int edad, int id, String puesto, String usuario, String contrasenia) {
		super();
		this.nombre = nombre;
		Edad = edad;
		this.id = id;
		this.puesto = puesto;
		this.usuario = usuario;
		this.contrasenia = contrasenia; // La variable de esta clase
	}

	// Clic derecho => source => getters and setters
	// modificador de visibilidad (public) - tipo de datos a regresar - método
	
	// Declaración de los métodos GET y SET (Siempre son públicos)
	public String getNombre() {
		return nombre;
	}

	// modificador de visibilidad - tipo de retorno - nombre retorno (set+seguido del nombre de la variable).
	// Set siempre recibe un valor (String nombre), por convención el tipo de dato se llama igual al tipo de vaiable ya definido.
	// Con la palabra reservada this hace referencia a la variable de esta clase.
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	
}
