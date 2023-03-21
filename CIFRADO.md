CIFRADO EN SPRING
------------------------
- DEPENDENCIAS
    - Spring Security
    - alguna base de datos: H2, PostgreSql,etc.
- OBJETIVO : Almacenar contraseñas cifradas en base de datos.
- -------------------------------------------------------------

## Cifrado

Es el proceso de codificar la informacion de su representacion original(texto plano)
a texto cifrado, de manera que solamente pueda ser descifrado utilizando una clave.

# Historia del Cifrado

1. Almacenar contraseñas en texto plano
2. Almacenar contraseñas cifradas con una funcion hash
3. Almacenar contraseñas cifradas con una funcion hash + salt
4. Almacenar contraseñas cifradas con una funcion adaptativa + factor de trabajo

La seguridad se gana haciendo que la validacion de contraseñas sea costosa computacionalmente

## Algoritmos en Spring Security

* BCrypt
* PBkdf2
* scrypt 
* argon2
