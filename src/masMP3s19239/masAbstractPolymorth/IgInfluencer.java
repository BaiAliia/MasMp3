package masMP3s19239.masAbstractPolymorth;

import mas.mp1.s19239.model.exceptions.ModelValException;

public class IgInfluencer extends Person{

    private int folowers;
    private String prifileName;

    public IgInfluencer(String name, String surname, int age, int folowers, String pname) {
        super(name, surname, age);
        this.folowers = folowers;
        setPrifileName(pname);

    }

    @Override
    public String toString() {
        return prifileName+"   has income of  " +getIncome();
    }

    @Override
    public int getIncome() {
        return this.getFolowers()*2;
    }

    public int getFolowers() {
        return folowers;
    }

    public void setFolowers(int folowers) {
        this.folowers = folowers;
    }

    public String getPrifileName() {
        return prifileName;
    }

    public void setPrifileName(String prifileName) {
        if(prifileName==null||prifileName.isBlank()){
            throw new ModelValException("The profilename cant be null or blank");
        }
        this.prifileName = prifileName;
    }
}
