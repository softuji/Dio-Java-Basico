package abstracao;

import java.time.OffsetDateTime;

public class Person {
    final private String name;

    private int age;

    private int lastYearAgeInc = OffsetDateTime.now().getYear();

    public Person(String name){
        this.name = name;
        this.age = 1;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void incAge(int lastYearAgeInc){
        if (this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;

        this.age += 1;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
    }
    
}
