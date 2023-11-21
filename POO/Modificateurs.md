# Modificateurs

| Module | Programmation Orientée Objet - POO |
|:------:|------------------------------------|
| Auteur | Charles ARBAUD                     |
| Data   | 15/11/2023                         |

## Modificateurs d'Accessibilité
### `public`
Grâce au mot-clé `public`, l'attribut (ou méthode) est rendue publique. Il est accessible depuis tous les fichiers du projet.
Dans le cas du développement d'une librairie (API), l'attribut (ou méthode) sera également accessible dans les projets dépendants de la librairie.

### `protected`
Lorsqu'un attribut (ou méthode) est protégée (mot-clé `protected`), il n'est accessible que depuis le paquet où elle a été définie et depuis la descendance de la classe.

Par exemple :
En considérant la hiérarchie suivante :
```
___ projet
 |___ models
 | |___ Animal.java
 | |___ UnEnum.java
 |___ impl
 | |___ Chat.java
 | |___ UneClasse.java
```
L'attribut `name` de la classe `Animal` définit dans le paquet `models` sera :
- accessible depuis le fichier `UnEnum.java` et depuis la classe `Chat` qui hérite de la classe `Animal`
- inaccessible depuis le fichier `UneClasse.java`

### `package-private` (par défaut)
Si on ne spécifie pas de mot-clé, l'attribut (ou méthode) est considéré comme privé au paquet.
Cela signifie que l'attribut (ou méthode) est considéré comme privé mais reste accessible dans les fichiers du même paquet.

Dans l'exemple précédent, seuls les fichiers `Animal.java` et `UnEnum.java` ont accès à l'attribut `name`.

### `private`
Le mot-clé `private` signale qu'un attribut (ou méthode) ne doit pas être accessible en dehors de la classe.

Le Java étant un langage orienté objet, les classes internes sont considérés comme des attributs de la classe.
Elles ont donc accès aux attributs marqués privés.

**Attention**, cela n'est pas réciproque : un attribut privé d'une sous-classe n'est pas accessible dans la classe principale.

En utilisant l'exemple précédent, l'attribut `name` ne sera accessible qu'au sein de la classe `Animal`.

## Attribut (ou Méthode) Statique ou Dynamique
La différence entre un attribut statique et un attribut dynamique est simple :
- un attribut dynamique est lié à l'instance de la classe : chaque instance peut posséder une valeur différente de l'attribut.
- un attribut statique est lié à la classe : toutes les instances de la classe possèdent la même valeur d'attribut.

Dans le cas des méthodes, la différence est plus subtile : une méthode dynamique peut accéder aux attributs et méthodes dynamiques (ce qui n'est pas le cas des méthodes statiques).

### Qu'est-ce que ça change ?
C'est simple ! Admettons que l'on crée une classe d'entitées `Entity` avec un attribut `isAlive`. Cet attribut peut alors servir à déterminer si l'entitée est vivant ou non.
Si c'est attribut est statique, lorsqu'une entitée meurt (`isAlive = false`), toutes les entitées meurent...

### Comment faire la différence ?
Les attributs (ou méthodes) statiques sont signalés par le mot-clé `static`. S'il n'y a pas de mot-clé, il s'agit d'un attribut (ou méthode) dynamique.
