package org.example.UI;

public class Persons {

    public class Person implements Comparable<Person> {
        private String navn;
        private int alder;

        public Person(String navn, int alder) {
            this.navn = navn;
            this.alder = alder;
        }

        public String getNavn() {
            return navn;
        }

        public int getAlder() {
            return alder;
        }

        @Override
        public int compareTo(Person p) {
            return navn.compareTo(p.getNavn());
        }

        @Override
        public String toString() {
            return "Person{" + "navn='" + navn + '\'' + ", alder=" + alder + '}';
        }
    }


}

