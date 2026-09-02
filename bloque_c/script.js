/**
 * ============================================================================
 * 🎓 EVALUACIÓN DIAGNÓSTICA — BLOQUE C: JAVASCRIPT & DOM (CE3)
 * ============================================================================
 */

// C2 & C4: Seleccionamos los elementos del DOM usando const y querySelector
const inputNombre = document.querySelector('#input-nombre');
const btnSaludar = document.querySelector('#btn-saludar');
const btnLimpiar = document.querySelector('#btn-limpiar');
const mensajeResultado = document.querySelector('#mensaje-resultado');

// C3: Declaramos una función nombrada para procesar el saludo
function generarSaludo() {
    const nombre = inputNombre.value.trim();
    
    if (nombre !== "") {
        mensajeResultado.textContent = `¡Hola, ${nombre}! Bienvenido a la evaluación de Mecatrónica. 🚀`;
        mensajeResultado.style.color = "#166534";
    } else {
        mensajeResultado.textContent = "Por favor, ingresa un nombre válido.";
        mensajeResultado.style.color = "#991b1b";
    }
}

// C5: Agregamos interactividad escuchando eventos con addEventListener
btnSaludar.addEventListener('click', generarSaludo);

btnLimpiar.addEventListener('click', function() {
    inputNombre.value = "";
    mensajeResultado.textContent = "Esperando interacción...";
    mensajeResultado.style.color = "#333";
});