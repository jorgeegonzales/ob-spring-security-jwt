# JASON WEB TOKEN - JWT
## 1 JWT - JSON Web Token
    Sitio web : https://jwt.io/
    Es un estandar abierto que permite transmitir informacion entre dos partes:
    •	Cliente( Navegador: una app de reac , angular, etc )
    •	Servidor (Nuestra app de Spring boot)

## 2 Funcionamiento Session

          1.Cliente envia una peticion a un servidor (/api/login) // a un endpoint REST, a una url
          2.Servidor valida el username y password, si no son validos devolvera una respuesta 401 unauthorized.
          3.Servidor valida username y password , si si son validos entonces se almacena el usuario en session(Conjunto de peticiones seguidas durante un determinado tiempo).
          4.Se genera una cookie en el Cliente.
          5.En proximas peticiones se comprueba que el Cliente esta en session.

### 2.1 Desventajas
        •	La informacion de la session se alamacena en el servidor, lo cual consume recursos.
        •	Para utilizar la session es sencillo, en el spring boot en el API REST , puedes recibir un parametro que sea HttpSession, a partir de la sesion puedes extarer el usuario o guardar el usuario y en cada peticion se comprueba la session.
## 3 Funcionamiento JWT

          1.Cliente envia una peticion a un servidor (/api/login) // a un endpoint REST, a una url
          2.Servidor valida el username y password, si no son validos devolvera una respuesta 401 unauthorized
          3.Servidor valida username y password , si si son validos entonces genera un token JWT utilizando una secret key(Clave secreta que se encuentra en el servidor concretamente en application.properties o leerse de una variable de entorno)
          4.Servidor devuelve el token JWT generado al Cliente
          5.Cliente envia peticiones a los endpoints REST del servidor utilizando el token JWT en las cabeceras( cabecera Authorization)
          6.Servidor valida el token JWT en cada peticion y si es correcto permite el acceso a los datos.

      3.1 Ventajas:
      •	El token se almacena en el Cliente, de manera que consume menos recursos en el Servidor, lo cual permite mejor escalabilidad.
      3.2 Desventajas:
      •	El token esta en el navegador, no podriamos invalidarlo antes de la fecha de expiracion asignada cuando se creo.
      •	Lo que se realiza es dar la opcion de logout, lo cual simplemente borra el token.

## 4 Estructura del token JWT
    3 partes separadas por un punto (.) y codificadas en base 64 cada una:
   ### 4.1 Header
            """json
            {
            "alg": "HS512",
            "typ": "JWT"
            }
            """
   ### 4.2  Payload (informacion,datos del usuario, no sensibles)
            """json
            {
            "name": "John Doe",
            "admin":true
            }
            """
   ### 4.3 Signatura
            """
            HMACKSHA256(
            base64UrlEncode(header) + "." + base64UrlEncode(payload), secret(se va aplicar un algoritmo para generar el token, y el secret estara almacenado en le servidor)
            )
            """
   #### 4.3.1 Ejemplo del token generado:
            """
            eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c
            """



#### 4.3.2 El User-Agent envia el token JWT en las cabeceras:
            """
            Authorization: Bearer<Token>
            """
## 5 Configuracion Spring

### 5.1 Crear proyecto Spring Boot con:

    •	Spring Security
    •	Spring Web
    •	Spring boot devtools
    •	Spring Data JPA
    •	PostgreSQL
    •	Dependencia JWT (Se añade manualmente en pom.xml)

### 5.2 Dependencia JWT

    """xml
    <!-- https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt -->
      <dependency>
          <groupId>io.jsonwebtoken</groupId>
          <artifactId>jjwt</artifactId>
          <version>0.9.1</version>
      </dependency>
    """
