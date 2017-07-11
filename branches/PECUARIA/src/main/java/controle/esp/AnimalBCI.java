package controle.esp;

import java.util.List;
import bean.Animal;

public interface AnimalBCI {
	
	public void insert(Animal cAnimal);
	public List<Animal> select();
	

}
