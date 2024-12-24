# Instructions pour tester le backend (Spring Boot) localement

Clonez le projet depuis GitHub

Utilisez la commande :

git clone https://github.com/FallouNdiaye/patient-api.git
Assurez-vous d'avoir les prérequis suivants

Java (JDK 11 ou supérieur)
Maven
Ouvrez le projet dans un IDE

Importez le projet dans un IDE comme Eclipse ou IntelliJ IDEA.
Si vous utilisez Eclipse, assurez-vous d'installer le plugin Spring (Spring Tools).
Construisez et exécutez le projet

Ouvrez un terminal dans le dossier du projet et exécutez :

mvn clean install
mvn spring-boot:run


L'API sera disponible à l'adresse suivante :
http://localhost:8080

Testez les endpoints

Utilisez un outil comme Postman ou Curl pour interagir avec les endpoints de l'API.
