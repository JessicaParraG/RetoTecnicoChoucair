#language:es

Característica: Registro de un usuario en utest

  Esquema del escenario: : Registrar exitosamente un usuario
    Dado que el usuario ingresa a la pagina de <Utest>
    Cuando el usuario se quiera registrar para crear una cuenta
    Entonces el visualizara un mensaje de <bienvenido>

    Ejemplos:
      | Utest              | bienvenido             |
      | https://utest.com/ | Welcome to the world's |