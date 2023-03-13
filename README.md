# POO - Parcelles

- [Sujet](#sujet)
  - [Parcelles](#parcelles)
  - [Activités de culture](#activités-de-culture)
    - [Activités de récolte](#activités-de-récolte)
    - [Activités de traitement anti-insectes](#activités-de-traitement-anti-insectes)

---

## Sujet

On vous demande de développer un programme en Java pour gérer des parcelles agricoles. Le cahier des charges est donné ci-dessous.

### Parcelles

Une __parcelle__ est caractérisée par une __section__ (_chaîne de caractères_), un __numéro de parcelle__ (_entier_), une __superficie__ en hectares (_double_), et une __liste d'activités de culture réalisées__ sur cette parcelle. On doit pouvoir __mettre à jour le numéro__ d'une parcelle, mais il ne faut pas permettre d'attribuer des __numéros négatifs__. Ceci doit être géré proprement dans le code que vous allez développer en exploitant les mécanismes appropriés de Java dédiés à la __gestion des erreurs__. En outre, on veut pouvoir __retourner l'activité ayant le coût le plus élevé__.

On veut aussi pouvoir __afficher des informations__ des parcelles. Pour cela, on veut avoir la section concaténée au numéro de parcelle comme suit : `Parcelle : Section : <section de la parcelle>, Numéro: <numéro de la parcelle>`. Il est cependant interdit de faire :

```java
System.out.println("Parcelle : Section :"+this.section+", numéro :"+ this.numeroParcelle) ;
```

### Activités de culture

Une __activité de culture__ est réalisée sur une parcelle. Elle est caractérisée par un __nom__ (_exemple : traitement anti-phylloxera, récolte de blé, etc._), une liste contenant les __numéros des semaines__ (entiers) où l'activité est réalisée, et un __coût annuel__. Pour chaque activité, on doit pouvoir __estimer l'aide__ à laquelle on peut prétendre qui est de 1000€ par hectare. En outre, on doit pouvoir __calculer la quantité d'eau consommée__ pour une activité de culture. Cela est déterminé en fonction de l'activité pratiquée. En effet, on distingue plusieurs activités, mais ici on ne considère que les activités de récolte et de traitement anti-insectes.  On souhaiterait pouvoir __connaître le nombre d'activités__ toute confondues et aussi le nombre d'activités de récolte et de traitement.

#### Activités de récolte

Une __activité de récolte__ est en plus décrite par une __période de la journée favorable__ à la récolte (_par exemple matin, après midi ...etc_), et un __matériel__ (_par exemple moissonneuse, faucheuse, main, etc._). Pour cette activité, la quantité d'eau consommée est de __200 litres par hectare__.

#### Activités de traitement anti-insectes

Une __activité de traitement anti-insectes__ est en plus décrite par le __type d'insectes à traiter__ (_chaine de caractères_) et la __férocité de ces insectes__ (_chaine de caractères_). La quantité d'eau consommée est de __100 litres par hectare__. On ajoute __2000€ en plus pour l'aide__.
