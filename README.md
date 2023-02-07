# Movienote

__Movienote__ – сервис для поиска фильма.


## Технологии
- Внедрённые:
    - Java SE 15
    - Springboot
    - Spring Web
    - Spring Data JPA
    - Hibernate
    - PostgreSQL
    - Liquibase
    - Spring Security

## Первый запуск программы в тестовом режиме
1. Клонируйте этот репозиторий командой:
```sh
$ git clone https://github.com/AnastasiyaIlkevich/Movienote.git
```
2. В IntelliJ IDEA собирите проек в формате jar. Для этого выполните следующие действия:
    - откройте build.gradle:
    - запустите bootJar - ___Run___.
3. Запуск:
    - откройте папку с проектом …\Movienote\build\libs
    - Запустите командную строку в этой папке и введите для старта команду:
  ```sh
java -jar -DSpring.profiles.active=test Movienote-0.0.1-SNAPSHOT.jar
- Запустите браузер и введите http://localhost:8084/registration
  - Зарегестрируйтесь и войдите
  - Для тестирования rest controller пройдите по одному из ниже предложеных вариантов http://localhost:8084/"..."
  
|Значение “...”|RestController|
|----|-----|
|user|UserController| 
|genre|GenreController| 
|movie|MovieController| 
|status|StatusController| 
|notes|UserMoviesController|


Access address to UI Swagger
  ```sh
http://localhost:8080/swagger-ui/index.html
```
