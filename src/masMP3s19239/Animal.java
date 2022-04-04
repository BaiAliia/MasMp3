package masMP3s19239;

import mas.mp1.s19239.model.exceptions.ModelValException;

public class Animal {
    private String name;
    private int weight;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name==null||name.isBlank()){
            throw new ModelValException("The name cant be null or blank");
        }
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight >0){
            throw new ModelValException("The weight cant be less than 0");
        }
        this.weight = weight;
    }
}
