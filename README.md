Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Sistema de Cálculo de Costos de Envíos (Clases Abstractas y Patrón Strategy en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 📦 Simulación de Cálculo de Costos de Envíos y Logística (POO y Patrón Strategy en Java)

Este proyecto es una aplicación en Java que modela un sistema flexible de tarificación para diferentes modalidades de transporte y despacho logístico (Envío Estándar, Expreso Aéreo y Marítimo). Pone en práctica conceptos clave de la **Programación Orientada a Objetos (POO)** como **clases abstractas**, **atributos protegidos**, **herencia**, el **Patrón de Comportamiento Strategy** y manejo robusto de excepciones en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una superclase abstracta que define la estructura monetaria y múltiples implementaciones especializadas en cada tipo de tarifa:

* **`EstrategiaEnvio` (Clase Abstracta)**: Define el contrato base y la propiedad monetaria compartida para cualquier modalidad de envío.
* **Atributo protegido (`protected`)**: `tarifaBase`, que almacena el costo fijo inicial configurable desde el constructor.
* **Método abstracto**: `calcularCosto(double pesoKg, double distanciaKm)`, que obliga a las subclases a calcular el valor total basándose en el peso y la distancia.


* **`EnvioEstandar`**: Modela el transporte terrestre tradicional.
* **Comportamiento:** Calcula el costo sumando la tarifa base, un cargo moderado por kilogramo ($2) y un valor estándar por kilómetro recorridos ($0.5).


* **`EnvioExpresoAereo`**: Modela el servicio de paquetería rápida por vía aérea.
* **Comportamiento:** Aplica tarifas incrementadas por peso ($5/kg) y distancia ($1.5/km) debido a la prioridad del servicio.


* **`EnvioMaritimo`**: Modela el transporte de carga pesada a gran escala.
* **Comportamiento:** Establece un costo reducido por kilogramo ($1) optimizado para grandes volúmenes.


* **`Main`**: Punto de entrada del programa. Agrupa las distintas estrategias en una lista polimórfica (`ArrayList<EstrategiaEnvio>`), define un paquete de prueba estándar (10 kg y 100 km) y recorre las opciones calculando e imprimiendo los costos resultantes.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Validación Defensiva de Parámetros:** Todas las clases concretas implementan una validación estricta al inicio de `calcularCosto(...)` para verificar que ni el peso ni la distancia sean negativos (`if (pesoKg < 0 || distanciaKm < 0)`).
2. **Lanzamiento de Excepciones:** Si se detectan valores inválidos, el sistema interrumpe de inmediato la ejecución lanzando una excepción controlada (`IllegalArgumentException`), asegurando la integridad de los datos de cálculo.
3. **Reutilización de Constructores (`super`):** Las subclases heredan la inicialización de la tarifa base mediante la palabra reservada `super(tarifaBase)`, evitando la duplicación de código de asignación.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main` con un paquete de **10 kg** y **100 km**, el programa genera el siguiente desglose:

```text
Costo del envío: $1070.0
Costo del envío: $2750.0
Costo del envío: $1590.0

```

---

## 🚀 Conceptos de Programación Aplicados

* **Patrón Strategy:** Permite encapsular distintas fórmulas de tarificación logística en clases separadas, haciendo que los algoritmos de cálculo sean completamente intercambiables.
* **Polimorfismo en Colecciones:** El uso de una lista tipada con la clase abstracta (`ArrayList<EstrategiaEnvio>`) permite procesar diferentes modalidades de transporte de manera idéntica.
* **Principio Abierto/Cerrado (OCP):** Es posible añadir nuevas modalidades de transporte (ej. `EnvioBicicletaUrbana`, `EnvioDrone`) creando una nueva clase que extienda de `EstrategiaEnvio`, sin alterar la lógica de procesamiento del `Main`.

---

### 💡 Materiales de Apoyo y Videos

Los videos recomendados arriba ilustran cómo implementar correctamente el **Patrón Strategy** y el diseño de jerarquías con clases abstractas en Java para resolver escenarios logísticos y de tarificación comercial.
