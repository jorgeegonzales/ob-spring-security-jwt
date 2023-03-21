 # APLICANDO JWT A UN PROYECTO

## DEPENDENCIAS
    - spring data jpa
    - spring web
    - spring boot dev tools
    - postgreSQL
    - springfox -- swagger
    - spring security
    - jjwt
## PAQUETES
      - config/swagger: se realizara configuraciones para poder integrarlo bien con jwt
      - domain o entity
      - repository
      - rest - donde va la api rest/controlador  gestiona peticiones
      - dto - data transfer object
          * son clases que estan pensadas para cargar datos, que pueden venir desde fuera de la aplicacion o desde dentro de la aplicacion.
          * son clases que tienen propiedades que sirven par pasar de JSON a java y de java a JSON.
          * son clases normales cuyo objetivo es devolver datos al front end.
      - service
          * tiene metodos para trabajar con las entidades
          * realiza operaciones
          * es donde habitualmente va la logica de negocio
      - security
          * config
          * jwt
              - jwtAuthEntryPoint:se encarga de devolver un error en caso de que no este autorizado.
              - jwtRequestFilter: cada ves que llega una peticion , pasa por este filtro , es un filtro de seguridad.Veirifica si hay un token o no.
              - jwtTokenUtil:Metodos para generar o validar los token jwt
          * payload: sirve para enviar o recibir la respuesta de que todo a ido bien, aqui tienes tu token,etc
          * service
            - UserDetailsServiceImpl:


 


