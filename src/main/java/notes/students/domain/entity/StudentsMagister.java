package notes.students.domain.entity;

public class StudentsMagister extends Students{

	public StudentsMagister(int id, String nombres, String apellidos) {
		super(id, nombres, apellidos, tipo);
	}
	
	public int calcular_precio(Students students, int precio_beca) {
		precio_beca = 1000;
		return super.calcular_precio(students, precio_beca);
	}

}
