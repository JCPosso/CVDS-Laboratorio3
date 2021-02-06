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

![Compilar y ejecutar img](../Img/eject.JPEG)


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
p.setAlive(false);
Registry result = new Registry();
assertEquals(RegistryResult.DEAD, result.registervoter(p));
```
 - Verificar que el usuario este vivo y sea menor de edad:
```
Person p = new Person();
p.setAge(10);
p.setAlive(true);
Registry result = new Registry();
assertEquals(RegistryResult.UNDERAGE, result.registerVoter(p));
```
 - Verificar que la edad sea invalida (menor a cero, mayor que 125):
```
Person p = new Person();
p.setAge(-1);
Registry result = new Registrty();
assertEquals(RegistryResult.INVALID_AGE, result.registerVoter(p));
```

```
Person p = new Person();
p.setAge(126);
Registry result = new Registrty();
assertEquals(RegistryResult.INVALID_AGE, result.registerVoter(p));
```

```
Person p = new Person();
p.setAge(0);
Registry result = new Registrty();
assertEquals(RegistryResult.INVALID_AGE, result.registerVoter(p));
```

```
Person p = new Person();
p.setAge(1231246);
Registry result = new Registrty();
assertEquals(RegistryResult.INVALID_AGE, result.registerVoter(p));
```

 - Verificar que la identificación es invalida (menor a cero, logitud mayor a 13 digitos):
```
Person p = new Person();
p.setId(-1234);
Registry result = new Registry();
assertEquals(RegistryResult.INVALID_ID, result.registerVoter(p));
```

Person p = new Person();
p.setId(12345678912346);
Registry result = new Registry();
assertEquals(RegistryResult.INVALID_ID, result.registerVoter(p));
```

Person p = new Person();
p.setId(-1234523542326);
Registry result = new Registry();
assertEquals(RegistryResult.INVALID_ID, result.registerVoter(p));
```

 - Verificar que el documento esté duplicado
```
Person p1,p2 = new Person(), new Person();
p1.setId(123);
p2.setId(123);
RegistryResult result = new Registry();
result.registerVoter(p1);
assertEquals(RegistryResult.DUPLICATED, result.registerVoter(p2));
```

Y vemos el resultado de las pruebas correctamente
![test ok](../Img/testOk.PNG)