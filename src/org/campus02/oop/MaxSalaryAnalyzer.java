package org.campus02.oop;

import java.util.HashSet;

public class MaxSalaryAnalyzer extends PersonAnalyzer {
    @Override
    public void analyze() {
        HashSet<Person> personsWithHighestSalary = new HashSet<>();
        int highestSalary = 0;
        //iter
        for (Person person : super.getPersons()) {
            if (person.getSalary() > highestSalary) {
                highestSalary = person.getSalary();
                personsWithHighestSalary.clear(); // zuerst leeren, da personen mit niedrigerem gehalt drinnen sein könnten;
                personsWithHighestSalary.add(person);
            } else if (person.getSalary() == highestSalary) {
                personsWithHighestSalary.add(person);
            }
        }

        // gebe Personen mit höchstem Gehalt auf der Konsole aus
        for (Person person : personsWithHighestSalary) {
            System.out.println(person);
        }
    }
}
