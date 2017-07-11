package dao.esp;

import java.util.List;
import bean.Animal;

public interface AnimalDaoI {
	
	public void insert(Animal cAnimal);
	public List<Animal> select();
	
}
