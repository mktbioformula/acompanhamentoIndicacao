package controle.impl;

import java.util.List;

import bean.Animal;
import controle.esp.AnimalBCI;

public class AnimalBC implements AnimalBCI {

	private AnimalBCI dao = new AnimalBC(); 
			
	public void insert(Animal cAnimal) {
		this.dao.insert(cAnimal);
		
	}

	public List<Animal> select() {
		return this.dao.select();
		
	}
	

}
