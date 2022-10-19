package business;

import kodlamaioDemo.core.Logger;
import kodlamaioDemo.dataAccess.CourseDao;
import kodlamaioDemo.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getPrice() < 0.0) {
			throw new Exception("The course price cannot be less than 0 TL!");
		}
		for (Course c : courseDao.getAll()) {
			if (c.getCourseName().equals(course.getCourseName())) {
				throw new Exception("There cannot be more than one course with the same name!");
			}
		}
		courseDao.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
}