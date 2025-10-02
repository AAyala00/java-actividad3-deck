# Actividad 3 – Colecciones (Java)

Aplicación que simula un **deck (mazo)** de cartas de póker utilizando el **Collection Framework** de Java.

---

## Descripción

El proyecto demuestra el uso de **clases personalizadas** y **colecciones estándar** de Java:

- **Card**: representa una carta de póker con atributos `palo`, `color` y `valor`.
- **Deck**: administra un conjunto de 52 cartas, almacenadas en un `ArrayList<Card>`.
  - `shuffle()` → mezcla el deck.
  - `head()` → muestra y remueve la primera carta.
  - `pick()` → selecciona y remueve una carta al azar.
  - `hand()` → reparte 5 cartas, las remueve y muestra cuántas quedan.
- **App**: clase de arranque que ejecuta y demuestra la funcionalidad.

---

## Baraja estándar de póker

- **52 cartas** divididas en 4 palos:
  - ♣ **Tréboles** (negro)
  - ♠ **Picas** (negro)
  - ♥ **Corazones** (rojo)
  - ♦ **Diamantes** (rojo)
- Cada palo tiene **13 valores**: A, 2–10, J, Q, K.

---

## Estructura del proyecto

```
src/
└─ edu/
   └─ actividad3/
      ├─ Card.java
      ├─ Deck.java
      └─ App.java
```
---

## Requisitos

- Java 11 o superior.
- Consola/terminal para ejecutar.

---

## Compilación y ejecución

```bash
# Compilar
javac src/edu/actividad3/*.java

# Ejecutar
java -cp src edu.actividad3.App
```

Ejemplo de salida:
```
Se mezcló el Deck.

--- HEAD ---
Corazones,Rojo,7
Quedan 51 cartas en deck

--- PICK ---
Picas,Negro,3
Quedan 50 cartas en deck

--- HAND ---
Tréboles,Negro,9
Diamantes,Rojo,K
Corazones,Rojo,2
Picas,Negro,A
Diamantes,Rojo,10
Quedan 45 cartas en deck
```

---

## Validaciones

- El mazo inicia siempre con 52 cartas.
- Cada método reduce el número de cartas disponibles.
- `hand()` verifica que existan al menos 5 cartas antes de repartir.

---