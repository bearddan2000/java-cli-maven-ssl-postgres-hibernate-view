package example.dto;

import org.hibernate.*;
import java.util.List;

import example.entity.*;
import example.dto.interfaces.IJoined;

public class BreedCount implements IJoined {

  Session session = null;

  public BreedCount(Session s){
    session = s;
  }

  @Override
  public void insert(Integer breedId, Integer colorId) throws Exception {
  }

  @Override
  public void selectAll(){

    String hql = "FROM BreedCountEntity";
    Query query = session.createQuery(hql);
    List<BreedCountEntity> lst = query.list();
    System.out.println(hql);
    for (BreedCountEntity entity : lst)
      System.out.println(entity.toString());
  }
}
