package business;

import kodlamaioDemo.core.Logger;
import kodlamaioDemo.dataAccess.CategoryDao;
import kodlamaioDemo.entities.Category;
import kodlamaioDemo.entities.Course;


public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;

}
	public void add(Category category) throws Exception {
		for (Category c : categoryDao.getAll()) {
			if (c.getCategoryName().equals(c.getCategoryName())) {
				throw new Exception("You can't have too many categories at once!");
			}
		}
		categoryDao.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
}
