package KodlamaioDemo.dataAccess;

import entities.Teacher;

public class JdbcTeacherDao implements TeacherDao {

	@Override
	public void add(Teacher teacher) {
		System.out.println("JDBC ile eklendi " + teacher.getName());
	}

}