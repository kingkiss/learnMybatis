package learnMybatis;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMybatis {

	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);		
		SqlSession session = sqlSessionFactory.openSession();
		
//		//test User delete SQL
//		User user1 = new User();
//		user1.setId(2);
//		session.delete("deleteUser",user1);
//
//		//show all user
//		List<User> users = session.selectList("listUser");
//		for(User user : users){
//			System.out.println(user.getName());
//		}
		
//		//一对多
//		List<User> users = session.selectList("listUser");
//		for (User user : users){
//			System.out.println(user);
//			List<Product> products = user.getProducts();
//			for (Product product : products ){
//				System.out.println("\t"+product);
//			}
//		}
		
		//多对一
		List<Product> products = session.selectList("listProduct");
		for(Product product : products){
			System.out.println(product+"对应的分类是 \t"+product.getUser());
		}
		
		
		
		session.commit();
		session.close();
	}

}
