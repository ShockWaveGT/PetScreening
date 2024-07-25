# Pet Screening API

## Description

This API allows you to manage pet records and perform queries based on different criteria such as weight, vaccination status, breed, and training level. The API is built with Spring Boot and uses GraphQL for queries and mutations. The database used is PostgreSQL.

## Prerequisites

Make sure you have the following prerequisites installed:

- Java 17 or higher
- Maven
- PostgreSQL

## Project Setup

### 1. Clone the Repository

First, clone the repository to your local machine:

```sh
git clone https://github.com/ShockWaveGT/PetScreening.git
cd PetScreening
```

or on GitHub DeskTop

```yaml
File->Clone Repository->URL-> https://github.com/ShockWaveGT/PetScreening.git
and choose path with an empty folder
```

### 2. Configure the Database
Install PostgreSQL database and update the configuration in following the next steps:

- Open pgAdmin 4
- Go to Servers -> PostgreSQL -> Databases and Right Click-> Create -> DataBase
- On Database Field write "PetScreening" and then Save
- On "PetScreening" Right Click->Restore and Select on Filename put the directory of the PetScreening Backup that is located on PetScreening\DataBase Backup in project. The name of the File is "PetScreeningDB"

## API Endpoints

First of all run "PetScreeningApplication" and on your browser write http://localhost:8080/graphiql?path=/graphql

### GraphQL Queries

### 1- Add a new Pet
For example:

```yaml
mutation AddPet {
    addPet(
        name: "Choco"
        weight: 8.0
        breedId: 2
        vaccinated: true
        trainingLevel: 6
    ) {
        id
        name
        weight
        vaccinationStatus
        trainingLevel
    }
}
```

### 2- Get Pet weight less than X value
For example:

```yaml
query WeightLessThan {
    weightLessThan(weight: 7) {
        id
        name
        weight
        vaccinationStatus
        trainingLevel
    }
}
```
### 3- Filter for not a Poodle
For example:

```yaml
query IsNotAPoodle {
    isNotAPoodle {
        id
        name
        weight
        vaccinationStatus
        trainingLevel
    }
}
```

### 4- Filter if its Vaccinated
For example:

```yaml
query IsVaccinated {
    isVaccinated {
        id
        name
        weight
        vaccinationStatus
        trainingLevel
    }
}
```
