# Classes

| Module | Programmation Orientée Objet - POO |
|:------:|------------------------------------|
| Auteur | Charles ARBAUD                     |
| Data   | 15/11/2023                         |

En Java, il est possible de créer des classes personnalisées grâce au mot-clé `class`.

## Équivalence Java - C
Considérons la classe `Point` :
```Java
public class Point {
  public int x;
  public int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}
```

Cette classe est alors équivalente à la structure :
```C
struct Point {
  int * x;
  int * y;
}
```

On peut alors remarquer qu'il ne suffit pas de copier une instance pour en faire une véritable copie.
Ce phénomène est similaire aux listes et dictionnaires en Python.

## Copie d'Instance
Afin de copier complètement l'instance, il est nécessaire d'implémenter au moins une des solutions suivantes :
```Java
public Point(Point point) {
  this.x = point.x;
  this.y = point.y;
}

public static Point copyOf(Point point) {
  return new Point(point.x, point.y);
}

public Point getPoint() {
  return new Point(this.x, this.y);
}
```
