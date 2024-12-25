# Instructions pour tester le backend (Spring Boot) localement

Clonez le projet depuis GitHub

Utilisez la commande :

git clone https://github.com/FallouNdiaye/patient-api.git

## Assurez-vous d'avoir les prérequis suivants

Java (JDK 11 ou supérieur)

Maven

Ouvrez le projet dans un IDE

Importez le projet dans un IDE comme Eclipse ou IntelliJ IDEA.

Si vous utilisez Eclipse, assurez-vous d'installer le plugin Spring (Spring Tools).

MongoDB : Une instance locale ou distante de MongoDB.
## Créez la base de données sur MongoDB:
Créer la base de données patient_db :

## Construisez et exécutez le projet
Ouvrez un terminal dans le dossier du projet et exécutez :

mvn clean install

mvn spring-boot:run


## L'API sera disponible à l'adresse suivante :
http://localhost:8080

## Testez les endpoints

Utilisez un outil comme Postman ou Curl pour interagir avec les endpoints de l'API.
![image](https://github.com/user-attachments/assets/8070875d-966e-4289-8d9b-9d5f7752167c)

