package example.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@org.hibernate.annotations.Immutable
@Table(name = "BreedCount", uniqueConstraints = {@UniqueConstraint(columnNames = "ID") })
@org.hibernate.annotations.Subselect(
  "SELECT b.id, b.breed, COUNT(d.breedId) as ct" +
  " FROM dog d" +
  " JOIN breedLookup b ON b.id = d.breedId" +
  " GROUP BY b.id, b.breed"
)
@org.hibernate.annotations.Synchronize({"DogEntity", "BreedLookupEntity"})
public class  BreedCountEntity implements Serializable {

  private static final long serialVersionUID = -1798070786993154677L;

  @Id
  @Column(unique = true, nullable = false)
  private Integer id;

  @Column(nullable = false, length = 100)
  private String breed;

  @Column(nullable = false)
  private Integer ct;

  // Accessors and mutators for all three fields

  public Integer getId(){ return id;}
  public void setId(Integer value){id = value;}

  public String getBreed(){ return breed;}
  public void setBreed(String value){breed = value;}

  public Integer getCt(){ return ct;}
  public void setCt(Integer value){ct = value;}

  @Override
  public String toString(){return String.format("[OUTPUT] %d, breed=%s, count=%d", id, breed, ct);}
}
