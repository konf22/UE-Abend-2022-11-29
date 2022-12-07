package org.campus02.oop;

import java.util.ArrayList;

public class BMIAnalyzer extends PersonAnalyzer {
    private ArrayList<Pair<Person, Double>> result = new ArrayList<>();

    public ArrayList<Pair<Person, Double>> getResult() {
        return result;
    }

    public double calcBmi(Person person) {
//        double bmi = person.getWeight() / ((person.getSize() / 100.0) * (person.getSize() / 100.0));
//        return bmi;
        return person.getWeight() / ((person.getSize() / 100.0) * (person.getSize() / 100.0));
    }

    @Override
    public void analyze() {
        for (Person person : super.getPersons()) {
            double bmi = calcBmi(person);
            Pair<Person, Double> bmiPair = new Pair<>(person, bmi);
            result.add(bmiPair);

//            result.add(new Pair<>(person, bmi));
        }
    }
}
