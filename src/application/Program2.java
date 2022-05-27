package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("TESTE 1: department insert");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = new Department();
		departmentDao.insert(department);
		System.out.println("Inserted! New Id = " + department.getId());
		
		System.out.println("TESTE 2: department findById");
		department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("TESTE 3: department deleteById");
		System.out.print("Enter with an department id for delete:");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		System.out.println("TESTE 4: department deleteById");
		department = departmentDao.findById(4);
		department.setName("Brooks");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("TESTE 5: department findlAll");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		
		
		
		
		
		sc.close();

	}

}
