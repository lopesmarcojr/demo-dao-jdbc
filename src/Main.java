import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    SellerDao sellerDao = DaoFactory.createSellerDao();

    System.out.println("=== TEST 1: seller findById ===");

    Seller seller = sellerDao.findById(3);

    System.out.println("\n=== TEST 2: seller department findByDepartment");
    Department department = new Department(2, "");
    List<Seller> sel = sellerDao.findByDepartment(department);
    for(Seller s : sel){
        System.out.println(s);
    }

    System.out.println("\n=== TEST 3: seller department findAll");
    sel = sellerDao.findAll();
    for(Seller s : sel){
        System.out.println(s);
    }

    System.out.println("\n=== TEST 4: seller inset");
    Seller s = new Seller(null, "Greg","greg@gmail.com",new Date(), 4000.0, department);
    sellerDao.insert(s);
    System.out.println("Inserted! New id = " + s.getId());

    }

