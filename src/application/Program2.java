package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("TESTE 1: department insert");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Department department = new Department(null, "Teste");
		departmentDao.insert(department);
		System.out.println("Inserted! New Id = " + department.getId());
		
		System.out.println("TESTE 2: department insert");
		
		
		
		sc.close();

	}

}
