package notes.students.domain.entity;

public class StudentsDoctor extends Students{

	public StudentsDoctor(int id, String nombres, String apellidos) {
		super(id, nombres, apellidos);
	}

		@Override
		public int calcular_precio(Students students, int precio_beca) {
			precio_beca = 2500;
			return super.calcular_precio(students, precio_beca);
		}
	
}
