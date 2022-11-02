package Dao;

import java.util.List;

import Model.mobileOrder;


public interface implmobileOrderDao {
	//C
	void add(Object o);
	void shoppingcart(Object o);
	//R
	List<Object> queryAll();
	List<Object> queryname(String name);
	mobileOrder queryId(int id);
	List<Object> queryShoppingcart();
	//U
	void update(Object o);
	void update1();
	void update2();
	void update3();
	void update4();
	void update5();
	void updateStatus(int id);
	//D
	void remove(int id);	
}
