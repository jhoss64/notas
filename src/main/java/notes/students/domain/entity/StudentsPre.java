package notes.students.domain.entity;

public class StudentsPre extends Students {

	public StudentsPre(int id, String nombres, String apellidos, String tipo) {
		super(id, nombres, apellidos, tipo);
	}
	
	@Override
	public int calcular_precio(Students students, int precio_beca) {
		precio_beca = 400;
		return super.calcular_precio(students, precio_beca);
	}

}
