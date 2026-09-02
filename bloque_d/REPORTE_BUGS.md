# 🐛 Reporte de Bugs Encontrados y Corregidos (Bloque D)
**Estudiante:** Leslie Tatiana Marin Mejia  
**Paralelo:** E1 | **Fecha:** 02/09/2026  

---

## 1. 🔍 Bug de HTML Encontrado (D1)
- **¿Qué fallaba?:** La etiqueta `<header>` no estaba cerrada, el enlace CSS apuntaba a un archivo incorrecto (`estilos-rotos.css`), y faltaban los atributos `id` en el segundo input y en el botón.
- **Causa Raíz:** Errores de sintaxis estructurales e identificadores ausentes que impedían la correcta selección por parte de JavaScript y la carga de estilos.
- **Solución Aplicada:** Se actualizó el enlace a `estilos.css`, se cerró correctamente el `<header>` con `</header>`, y se añadieron `id="nota2"` y `id="btn-calcular"`.

---

## 2. 🔍 Bug de CSS Encontrado (D2)
- **¿Qué fallaba?:** Se utilizaron propiedades y valores incorrectos como `display: flexer;`, `align-item: center;` y `cursor: pointing-hand;`.
- **Causa Raíz:** Errores tipográficos en los nombres de las propiedades y uso de valores no válidos en CSS.
- **Solución Aplicada:** Se corrigieron a `display: flex;`, `align-items: center;` y `cursor: pointer;`.

---

## 3. 🔍 Bug de JavaScript Encontrado (D3)
- **¿Qué fallaba?:** La función hacía una división antes de sumar (`a + b / 2`), los selectores buscaban elementos inexistentes, no se parseaban los valores de los inputs, y la propiedad del DOM estaba mal escrita (`textContnt`).
- **Causa Raíz:** Fallos de lógica matemática, selectores erróneos, manejo de cadenas en lugar de números y un error tipográfico.
- **Solución Aplicada:** Se ajustó la fórmula a `(a + b) / 2`, se actualizaron los selectores a `#nota2` y `#btn-calcular`, se usó `parseFloat` para los valores numéricos, y se cambió `textContnt` por `textContent`.

---

## 4. ✅ Verificación en Consola del Navegador (D5)
- [x] Presioné F12 en el navegador.
- [x] Fui a la pestaña **Console**.
- [x] Verifiqué que **NO aparezca ningún error en rojo**.