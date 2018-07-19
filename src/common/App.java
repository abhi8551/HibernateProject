package common;

import org.hibernate.Session;
import main.HibernateUtil;
import models.Stock;

public class App {
	public static void main(String[] args) {
		System.out.println("Hibernate + MySQL");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		Stock stock = new Stock();

		stock.setStockCode("4715");
		stock.setStockName("GENM");

		session.save(stock);
		session.getTransaction().commit();
	}
}
