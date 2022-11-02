package Dao;

import java.util.List;

import Model.mobilemember;

public interface implmobilememberDao {
	//C
	void addmember(Object o);
	//R
	List<Object>  query(String username,String password); 
    List<Object>  query(String username);
    boolean queryUsername(String username);
    List<Object> queryId(int id);//Id
    List<Object>  queryAll();

	//U
	void update(Object o);
	//D
	void delete(int id);
}
