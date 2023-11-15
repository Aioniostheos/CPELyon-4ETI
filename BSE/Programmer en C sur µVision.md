# Programmation en C sur µVision 5

| Module | Base des Systèmes Embarqués - BSE |
|:------:|-----------------------------------|
| Auteur | Charles ARBAUD                    |
| Date   | 15/11/2023                        |

## Déclaration de Variables et Types
###  Adressage Bit-à-Bit
Le type `sbit` permet de définir une variable adressable bit-à-bit. Par exemple :
```C
sbit P1_6 = P1^6; // Accès au port P1.6
sbit P3_7 = P3^7; // Accès au port P3.7
```

## Accès aux Ports I/O
### Entrée Numérique
Afin de définir un port comme entrée numérique, il faut définir la sortie correspondante en mode "Open-Drain" et mettre le bit à 1 dans le registre des ports.

Par exemple, pour le port `P3.7`, il suffit de faire :
```C
P3MDOUT &= ~(1 << 7);
PORT = 1;
```

### Accès via un Signal Extérieur
Il est possible de connecter un signal extérieur comme signal de port en utilisant le GPIO. Le brochage peut être trouvé dans le brochage du connecteur D41612 (sur E-Campus).

<u>Attention :</u> Le micro-contrôleur 8051F020 ne supporte que des signaux de `0 V` à `3,3 V`.

## Interruptions
### Activer les Interruptions
Afin d'activer les interruptions, il faut commencer par activer toutes les interruptions en passant `IE.7` au niveau logique 1.

On peut ensuite activer les interruptions une à une.

### Pending Flag
Le `Pending Flag` indique une attente d'exécution d'une interruption. Il est au niveau logique 1 lorsqu'une interruption doit s'exécuter. Ainsi, s'il n'est pas remis au niveau logique 0 dans l'interruption, l'interruption s'exécute en boucle.
