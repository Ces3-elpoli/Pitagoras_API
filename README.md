Se utilizo la variante A, numeros pares

No se termino la validacion de ruta de aprendizaje

-------------Doget----------------

Hay 3 formas para acceder al do get

http://localhost:8085/PitagorasAPI/cursos  ----------->> De esta forma se obtienen todos los registros
http://localhost:8085/PitagorasAPI/cursos?id=1  ------>> De esta forma se obtien el registro con el id 1
http://localhost:8085/PitagorasAPI/cursos/facultad?nombre=ed    ---------->  De esta forma se obtienen todos los cursos que hacen parte de una facultad  (ED es educacion fisica, esta en los cursos que se inicializan con el init)


-----------DoPost---------------

Para hacer un post solo se usa la ruta base

http://localhost:8085/PitagorasAPI/cursos

ejemplo de post:

{
    "id": 5,
  "nombre": "sistemico",
  "codigo": "ASK124", 
  "profesor": "Juan",
  "cupoMaximo": 10,
  "inscritos": 0,
  "facultad": "Ingenieria",
  "prerrequisitos": [],
  "nivel": 1,
  "fechaInicio": "abril 20"
  }


Las validaciones del post estan en ID, Codigo, cupomaximo
para comprobar validaciones se puede usar id=3, codigo=ASK123, cupomaximo=0.
