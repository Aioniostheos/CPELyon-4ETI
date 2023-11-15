# Surcharge

| Module | Programmation Orientée Objet - POO |
|:------:|------------------------------------|
| Auteur | Charles ARBAUD                     |
| Data   | 15/11/2023                         |

## Paramètres par Défaut
En Java, il existe deux méthodes permettant de créer des méthodes avec des paramètres par défaut :
- les créateurs de paramètres (méthodes `Factory`) : c'est une méthode longue et fastidieuse qu'on ne retrouve que dans quelques projets Java (Minecraft par exemple).
- la surcharge : un système pré-implémenté en Java (`built-in`).

## Java et les Paramètres
En Java, l'interpréteur différencie les méthodes à l'aide de leur nom et des types des paramètres.

En considérant le code :
```Java
void maFonction(int p1, int p2, String p3, bool p4) { ... }
void maFonction(int p2, int p1, String p3, bool p4) { ... }
void maFonction(bool p1, int p2, String p3, int p4) { ... }
```

Pour l'interpréteur, les deux premières méthodes sont identiques mais différentes de la troisième.

## La Surcharge :
Il est possible de définir la surcharge d'une fonction de la façon suivante :
```Java
void maFonction(int p1, int p2, String p3, bool p4) { ... }
void maFonction(int p1, int p2, String p3) {
  maFonction(p1, p2, p3, false);
}
void maFonction(String p3) {
  maFonction(0, 0, p3, false);
}
void maFonction() {
  maFonction(0, 0, "Bonjour", false);
}
```

Il est important de noter que les méthodes n'ont pas besoin d'avoir le même nom ou les mêmes valeurs par défaut pour les paramètres.
De même, les méthodes ne sont pas obligatoirement des surcharges ; l'interpréteur ne déclenchera pas d'erreur.

Toutefois, le Java est un langage fortement conventionné. Par convention, on attend de méthodes possédant le même nom qu'elles soient des surcharges.
On attend également que les paramètres par défaut soient identiques entre les surcharges ; il faudra donc penser à préciser dans la documentation si les valeurs diffèrent.
