# 🧩 Actividad 1 - Gestión de Pedidos

Proyecto en **Spring Boot** que gestiona usuarios, productos, categorías, pedidos y líneas de pedido.  
Aplica una arquitectura por capas: *Entities → DAO → Repository → RestController*.

---

## ⚙️ Tecnologías

- Java 17  
- Spring Boot 3 (Web, Data JPA)  
- MySQL  
- Maven  
- Eclipse / Spring Tools Suite

---

## 🚀 Cómo ejecutar

1. Configura la conexión en `application.properties`:
   ```properties
   spring.datasource.username=root
   spring.datasource.password=admin


2. Crea la base de datos `gestion_pedidos_bbdd` con el script SQL incluido.  

3. Ejecuta el proyecto:
   ```bash
   mvn spring-boot:run

4. Prueba los endpoints (navegador o Postman):
   ```bash
   http://localhost:8080/categorias
   http://localhost:8080/productos

