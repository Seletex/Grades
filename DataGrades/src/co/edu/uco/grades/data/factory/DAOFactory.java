package co.edu.uco.grades.data.factory;

import co.edu.uco.grades.data.dao.StudentDAO;

public abstract class DAOFactory {
	
	public static DAOFactory getDAOFactory() {
		return null;
	}
	
	public abstract void openConnection();
	
	public abstract void closeConnection();
	
	public abstract void getConnection();
	
	public abstract void commit();
	
	public abstract void rollback();
	
	
	
	public abstract StudentDAO getStudentDAO();

}
