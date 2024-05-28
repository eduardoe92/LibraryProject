# Proyecto Biblioteca

Bienvenido al proyecto Biblioteca. Esta es una aplicación diseñada para gestionar una biblioteca digital, permitiendo a los usuarios registrar, actualizar y gestionar sus libros, autores y cuentas de usuario.

## Características

- **Registro de Usuarios:** Los usuarios pueden registrarse en la plataforma para acceder a funcionalidades adicionales.
- **Gestión de Libros:** Permite a los usuarios agregar, editar y eliminar libros de su biblioteca personal.
- **Gestión de Autores:** Permite la creación y gestión de autores asociados a los libros.
- **Seguridad de Contraseñas:** Utiliza técnicas de seguridad para almacenar contraseñas de manera segura.
- **Gestión de Sesiones:** Proporciona una experiencia de usuario segura con control de sesiones.
- **Roles de Usuario:** Los usuarios tienen roles asignados que determinan sus privilegios en la plataforma.

## Tecnologías Utilizadas

- **Java:** Lenguaje de programación principal utilizado en el backend.
- **Spring Boot:** Framework utilizado para desarrollar la lógica del servidor y las API REST.
- **Spring Security:** Proporciona funcionalidades de seguridad y autenticación.
- **Spring Data JPA:** Para el acceso y manipulación de la base de datos.
- **MySQL:** Base de datos utilizada para almacenar datos relacionados con la biblioteca.
- **Maven:** Herramienta de gestión de dependencias y construcción del proyecto.
- **HTML:** Lenguaje de marcado utilizado para estructurar el contenido web.
- **Bootstrap:** Framework de CSS utilizado para diseñar y crear la interfaz del usuario.

## Instalación
### Requisitos

- Java JDK 17 o superior
- Maven 3.6.0 o superior
- MySQL 5.7 o superior

### Pasos para Clonar y Configurar el Proyecto

1. Clona el repositorio:

    ```bash
    git clone https://github.com/eduardoe92/LibraryProject.git
    cd LibraryProject
    ```

2. Crea una base de datos en MySQL:

    ```sql
    CREATE DATABASE library_db;
    ```

3. Actualiza el archivo `application.properties` en `src/main/resources` con tu configuración de MySQL:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/library_db
    spring.datasource.username=your_username
    spring.datasource.password=your_password

    spring.jpa.hibernate.ddl-auto=update
    ```

### Construcción y Ejecución de la Aplicación

1. Navega al directorio del proyecto y construye el proyecto usando Maven:

    ```bash
    mvn clean install
    ```

2. Ejecuta la aplicación:

    ```bash
    mvn spring-boot:run
    ```

### Acceso a la Aplicación

- Accede a `http://localhost:8080` en tu navegador web para usar la aplicación.

¡Gracias por tu interés!

---

# Library Project

Welcome to the Library Project. This is an application designed to manage a digital library, allowing users to register, update, and manage their books, authors, and user accounts.

## Features

- **User Registration:** Users can register on the platform to access additional functionalities.
- **Book Management:** Allows users to add, edit, and delete books from their personal library.
- **Author Management:** Enables the creation and management of authors associated with the books.
- **Password Security:** Utilizes security techniques to store passwords securely.
- **Session Management:** Provides a secure user experience with session control.
- **User Roles:** Users have assigned roles that determine their privileges on the platform.

## Technologies Used

- **Java:** Primary programming language used in the backend.
- **Spring Boot:** Framework used to develop server logic and REST APIs.
- **Spring Security:** Provides security and authentication functionalities.
- **Spring Data JPA:** For database access and manipulation.
- **MySQL:** Database used to store data related to the library.
- **Maven:** Dependency management and project build tool.
- **HTML:** Markup language used to structure web content.
- **Bootstrap:** CSS framework used to design and create the user interface.

## Installation

### Requirements

- Java JDK 17 or higher
- Maven 3.6.0 or higher
- MySQL 5.7 or higher

### Steps to Clone and Configure the Project

1. Clone the repository:

    ```bash
    git clone https://github.com/eduardoe92/LibraryProject.git
    cd LibraryProject
    ```

2. Create a database in MySQL:

    ```sql
    CREATE DATABASE library_db;
    ```

3. Update the `application.properties` file in `src/main/resources` with your MySQL configuration:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/library_db
    spring.datasource.username=your_username
    spring.datasource.password=your_password

    spring.jpa.hibernate.ddl-auto=update
    ```

### Building and Running the Application

1. Navigate to the project directory and build the project using Maven:

    ```bash
    mvn clean install
    ```

2. Run the application:

    ```bash
    mvn spring-boot:run
    ```

### Accessing the Application

- Go to `http://localhost:8080` in your web browser to use the application.

Thank you for your interest!
