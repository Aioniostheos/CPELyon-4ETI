# `this`

| Module | Programmation Orientée Objet - POO |
|:------:|------------------------------------|
| Auteur | Charles ARBAUD                     |
| Data   | 15/11/2023                         |

Le mot-clé `this` est très important en Java. Il correspond à l'instance qui est actuellement en train d'être utilisée.

## Appel d'Attributs (ou Méthodes)
Le mot-clé `this` peut être utilisé pour appeler les attributs (ou méthodes) de l'instance (`this.___`) en train d'être utilisée.
En effet, lorsqu'une fonction de l'instance doit modifier un attribut ou appeler une méthode [dynamique](https://github.com/Aioniostheos/CPELyon_4ETI/blob/main/POO/Modificateurs.md#attribut-ou-méthode-statique-ou-dynamique)
de la même instance, il n'est pas possible de faire :
```Java
MaClasse instance = MaClasse(...);
```
Cela résulterait en la création d'une nouvelle instance et n'intéragirait plus avec l'instance voulue.

Ainsi, en considérant le code suivant :
```Java
public class Animal {
  public int age;

  public Animal(int age) { ... }

  public Animal() { ... }
  ...
}
```
Il est alors possible d'accéder à l'attribut `age` avec `this.age`.

## Constructeurs par Défaut
Dans l'exemple précédent, on peut voir la présence de deux constructeurs dont un est dit "par défaut" (aucun paramètre).
La bonne méthode pour effectuer cela consiste à utiliser le fonctionnement de fonction avec de valeurs de paramètre par défaut : la
[surcharge](https://github.com/Aioniostheos/CPELyon_4ETI/blob/main/POO/Surcharge.md).

**Attention**
```Java
public Animal() {
  return Animal(0);
}
```
Ce code ne permet pas de faire une surcharge de constructeur. En effet, l'appel de `Animal(0)` crée bien une nouvelle instance de la classe.
Cependant, un constructeur ne possède pas de type de retour ; le mot-clé `return` entraînera alors une erreur.

À nouveau, il faut faire appel au mot-clé `this` via `this(___)`.
La surcharge de constructeur sera alors :
```Java
public Animal() {
  this(0);
}
```
