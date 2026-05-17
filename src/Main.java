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

    System.out.println(seller);
    }

