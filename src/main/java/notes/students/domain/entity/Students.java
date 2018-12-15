package notes.students.domain.entity;

public abstract class Students {
	private int id;
	private String nombres;
	private String Apellidos;
	
	public Students(int id,String nombres,String apellidos) {		
		this.id = id;
		this.nombres = nombres;
		this.Apellidos = apellidos;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombres() {
		return nombres;
	}
	
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public String getApellidos() {
		return Apellidos;
	}
	
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}	
	
	public int calcular_precio(Students students,int precio_beca) {
		return precio_beca;
	}
	
}
