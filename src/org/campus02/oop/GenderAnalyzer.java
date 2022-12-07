package org.campus02.oop;

public class GenderAnalyzer extends PersonAnalyzer {
    @Override
    public void analyze() {
        int countM = 0;
        int countW = 0;
        int heightM = 0;
        int heightW = 0;

        for (Person person : super.getPersons()) {
            if (person.getGender() == 'M') {
                countM ++;
//                countM += 1;
                heightM += person.getSize();
            }

            if (person.getGender() == 'F') {
                countW ++;
                heightW = heightW + person.getSize();
            }
        }

        int avgW = heightW / countW;

        System.out.println("In der Lister existieren "
                + countM +
                " Männer mit einer durchschnittlichen Körpergröße von "
                + (heightM / countM) + " cm");

        System.out.println("In der Lister existieren "
                + countW +
                " Frauen mit einer durchschnittlichen Körpergröße von "
                + avgW + " cm");
    }
}
