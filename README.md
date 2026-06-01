# Sistema Punto de Venta en Java

Sistema de Punto de Venta desarrollado en Java como proyecto académico para practicar Programación Orientada a Objetos (POO), manejo de inventarios y lógica de negocio.

El sistema permite administrar productos, realizar ventas, actualizar existencias automáticamente y generar tickets de compra desde una interfaz de consola.

## Funcionalidades

* Visualización de productos disponibles.
* Registro de ventas.
* Actualización automática del stock.
* Agregar nuevos productos.
* Eliminar productos.
* Generación de ticket de compra.
* Menú interactivo por consola.

## Tecnologías Utilizadas

* Java 8
* Programación Orientada a Objetos (POO)
* Visual Studio Code
* Git y GitHub

## Estructura del Proyecto

```text
SistemaPuntoVenta
│
├── src
│   ├── modelo
│   │   └── Producto.java
│   │
│   ├── servicio
│   │   └── Inventario.java
│   │
│   └── Main.java
│
├── README.md
└── .gitignore
```

## Ejecución del Proyecto

### Compilar

```bash
javac src\modelo\Producto.java src\servicio\Inventario.java src\Main.java
```

### Ejecutar

```bash
java -cp src Main
```

## Ejemplo de Uso

===== PUNTO DE VENTA =====
1. Ver productos
2. Realizar venta
3. Agregar producto
4. Eliminar producto
5. Salir

### Ticket de Compra

======================
       TICKET
======================
Producto: Laptop
Cantidad: 1
Precio Unitario: CRC 350000.0
Total: CRC 350000.0
======================
Venta realizada


## Objetivos de Aprendizaje

Este proyecto fue desarrollado para fortalecer conocimientos en:

* Programación Orientada a Objetos.
* Estructuras de datos básicas.
* Manejo de inventarios.
* Diseño de aplicaciones de consola.
* Control de versiones con Git y GitHub.

---

## 🔮 Mejoras Futuras

* Integración con MySQL.
* Persistencia de datos.
* Registro histórico de ventas.
* Gestión de usuarios.
* Sistema de autenticación.
* Interfaz gráfica con Java Swing.

---

## Autor

Victor Centeno Perez 

Estudiante de Ingeniería en Sistemas.

Intereses:

* Desarrollo de Software
* Ciencia de Datos
* Redes
* Ciberseguridad
