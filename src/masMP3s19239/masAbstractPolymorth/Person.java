package masMP3s19239.masAbstractPolymorth;

import mas.mp1.s19239.model.exceptions.ModelValException;

import java.time.LocalDate;

public abstract class Person {
    private String Name;
    private String Surname;
    private int age;

    public Person(String name, String surname, int age) {
       setName(name);
        setSurname(surname);
        setAge(age);
    }

    public abstract int getIncome();


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        if(name==null||name.isBlank()){
            throw new ModelValException("The name of the person cant be null or blank");
        }
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        if(surname==null||surname.isBlank()){
            throw new ModelValException("The surname of the person cant be null or blank");
        }
        Surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            throw new ModelValException("The persons age cant be less than 0");
        }
        this.age = age;
    }


}
