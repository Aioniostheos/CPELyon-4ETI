package models;

// Cette classe est publique et donc accessible dans tout le projet.
public class Animal {
    // La propriété `currentID` est privée, elle n'est accessible que dans `Animal` et `AnimalSubClass`.
    // La propriété `currentID` est statique, lorsque sa valeur change, elle change pour toutes les instances d'`Animal`.
    private static int currentID = 0;

    // La propriété `state` est privée au paquet, elle n'est accessible que dans `Animal, `AnimalSubClass` et `State`.
    AnimalSubClass state;

    // La propriété `age` est protégée, elle n'est accessible que dans `Animal`, `AnimalSubClass`, `State` et `Cat`.
    protected int age = 0;

    // La méthode `getAge` est publique, elle est accessible dans tout le projet.
    public int getAge() {
        return age;
    }

    public static class AnimalSubClass {
        // La propriété `literal` est privé, elle n'est accessible que dans `AnimalSubClass`.
        private String literal;
    }
}