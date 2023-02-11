# Movienote

___

__Movienote__ – сервис для поиска фильма.

#

#### Технологии

___

- Внедрённые:
    - Java SE 15
    - Springboot
    - Spring Web
    - Spring Data JPA
    - Hibernate
    - PostgresSQL
    - Liquibase
    - Spring Security

#

#### Первый запуск программы в тестовом режиме

___

- Клонируйте этот репозиторий командой:

```sh
$ git clone https://github.com/NadezhdaPenkrat/MovieNote.git
```
- В IntelliJ IDEA собирите проек в формате jar. Для этого выполните следующие действия:
    - откройте build.gradle:
    - запустите bootJar - ___Run___.
- Запуск:
    - откройте папку с проектом …\MovieNote\build\libs
    - Запустите командную строку в этой папке и введите для старта команду:
 ```sh
$ java -jar -DSpring.profiles.active=test MovieNote-0.0.1-SNAPSHOT.jar
```



- Запустите браузер и введите http://localhost:8084/registration
- Зарегестрируйтесь и войдите
- Для тестирования rest controller пройдите
  по одному из ниже предложеных вариантов
  http://localhost:8084/"..."

| Значение “...” | RestController       |
|----------------|----------------------|
| user           | UserController       | 
| genre          | GenreController      | 
| movie          | MovieController      | 
| status         | StatusController     | 
| notes          | UserMoviesController |

---

#

#### Access address to UI Swagger

```sh
$ http://localhost:8080/swagger-ui/index.html
```

