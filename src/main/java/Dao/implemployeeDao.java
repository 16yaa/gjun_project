package Dao;

import java.util.*;

import Model.*;
public interface implemployeeDao {
	//C
	void addemployee(Object o);
	//R
	List<Object> query(String username,String password);
	List<Object>  queryAll();
	List<Object> query(String username);
	//U
	void update(Object o);
	//D
	void delete(int id);
}
