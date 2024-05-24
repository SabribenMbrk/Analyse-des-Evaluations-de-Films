# Analyse des Évaluations de Films

Ce projet analyse les évaluations des films en utilisant Apache Spark et Scala.

## Structure du Projet

- **data/** : Dossier contenant les fichiers CSV de données.
- **src/** : Contient le code source Scala.
  - **main/** : Contient le code source principal.
    - **scala/** : Contient les packages et classes Scala.
      - **processor** : Contient la classe `MovieProcessor.scala`.
      - **runner** : Contient la classe `MovieRatingsApp.scala`.
      - **model** : Contient les classes `MovieModels.scala`.
      - **util** : Contient la classe `CSVUtils.scala`.
  - **test/** : Contient les tests.
    - **scala** : Contient les tests Scala.
      - **MovieRatingsTest.scala** : Contient les tests pour les évaluations de films.

## Configuration du Projet

- **build.sbt** : Configuration du projet avec sbt.

## Exécution du Projet

1. Assurez-vous que vous avez [Apache Spark](https://spark.apache.org/) installé.
2. Cloner le dépôt :

   ```sh
   git clone https://github.com/votre-nom-utilisateur/Analyse-des-Evaluations-de-Films.git
   cd Analyse-des-Evaluations-de-Films
