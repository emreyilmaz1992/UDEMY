package Recaps.Inheritence;

public class ConstructorCalling {


    String name;
    String surname;
    int age;



    public ConstructorCalling(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public ConstructorCalling (String name, String surname, int age){
        this("asdas","dasdas");
        this.age = age;

    }

    @Override
    public String toString() {
        return "ConstructorCalling{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
