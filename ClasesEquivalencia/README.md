# Ciclos de vida y desarrollo de software - Laboratorio 3

# CLASES DE EQUIVALENCIA

## CREAR UN PROYECTO CON MAVEN

- Creamos un nuevo proyecto basado en un arquetipo con la siguiente configuracion:
 - Grupo: edu.eci.cvds
 - Artefacto: ClasesEquivalencia
 - Paquete: edu.eci.cvds.tdd
 - archetypeArtifactId: maven-archetype-quickstart

### **Actualizar y crear dependencias en el proyecto**

Cambiamos nuestra version del compilador de Java a la version 8

```
    <properties>
        <maven.compiler.target>1.8</maven.compiler.target>
        <maven.compiler.source>1.8</maven.compiler.source>
    </properties>
```

### COMPILAR Y EJECUTAR

- Ejecutamos el proyecto utilizando el comando:

```
mvn package
```

- Y para correr los Test Unitarios

```
mvn surefire:test
```

![Compilar y ejecutar img](Img/eject.JPEG)


### EJECRICIO "REGISTRADURIA"
Crearemos un proyecto base para un requirimiento de la registraduria en el cual
se registraran personas con intencion de votar para las proximas elecciones y 
se generaran los certificados electorales de aquellas personas cuyo voto sea valido.

### PROPIEDADES

- Solo se reistraran votantes validos
- Solo se permite una inscripcion por numero de documento

### FINALIZAR EL EJERCICIO

- Casos de equivalencia:
 - Verificar que el usuario este vivo:
```
Person p = new Person();
assertEquals(true, p.isAlive());
```
 - Verificar que el usuario sea mayor de edad:
```
Person p = new Person();
p.setAge(10);
Registry result = new Registry();
assertEquals(RegistryResult.UNDERAGE, result.registerVoter(p));
```
 - Verificar que la edad sea validad:
```
Person p = new Person();
p.setAge(-1);
Registry result = new Registrty();
assertEquals(RegistryResult.INVALID_AGE, result.registerVoter(p));
```

 - Verificar que la identificación sea valida:
```
Person p = new Person();
p.setId(-1234);
Registry result = new Registry();
assertEquals(RegistryResult.VALID_ID, result.registerVoter(p));
```

 - Verificar que el documento no este duplicado
```
Person p1,p2 = new Person(), new Person();
p1.setId(123);
p2.setId(123);
RegistryResult result = new Registry();
result.registerVoter(p1);
assertEquals(RegistryResult.DUPLICATED, result.registerVoter(p2));
```
