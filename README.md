# Microservicios cloud

Aplicaremos los componentes Spring cloud a los microservicios de cursos y formación con las siguientes características

- Ambos microservicios se registrarán en Eureka server
- La interacción entre ambos se realizará a través de Eureka. Existirán tres instancias del microservicio de cursos a las que podrá acceder el microservicio de formación mediante balanceado de las mismas.
- Existirá un punto único de acceso a dichos microservicios a través de Gateway
- La configuración de los dos microservicios estará centralizada en Spring Cloud Config
