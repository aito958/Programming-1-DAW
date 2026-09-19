<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="utf-8" />
    <title>Actividad 1 - Generador de cadena aleatoria (comentado)</title>
    <meta name="viewport" content="width=device-width,initial-scale=1" />
    <script>
        /*
         * Cadena que contiene todos los caracteres que queremos poder elegir:
         * - Letras mayúsculas A-Z
         * - Letras minúsculas a-z
         * - Dígitos 0-9
         */
        const caracteresPosibles = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';

        /**
         * generarCadenaAleatoria(longitudCadena)
         * -------------------------------------
         * Genera y devuelve una cadena aleatoria compuesta por caracteres
         * tomados de la variable 'caracteresPosibles'.
         *
         * @param {number} longitudCadena - número de caracteres que debe tener la cadena resultante
         * @returns {string} - cadena aleatoria de longitud 'longitudCadena'
         */
        function generarCadenaAleatoria(longitudCadena) {
            // Variable que acumulará el resultado. Empezamos con cadena vacía '' (sin espacio inicial).
            let cadenaResultado = '';

            // Guardamos la longitud total de la cadena de caracteres disponibles (62 en este caso).
            const totalCaracteres = caracteresPosibles.length;

            // Bucle que se repite tantas veces como la longitud solicitada.
            for (let indice = 0; indice < longitudCadena; indice++) {
                // Math.random() devuelve un número decimal aleatorio en [0, 1).
                // Al multiplicarlo por totalCaracteres obtenemos un número en [0, totalCaracteres).
                let numeroAleatorio = Math.random() * totalCaracteres;

                // Math.floor() redondea hacia abajo para convertir el número decimal en un índice entero
                // válido que va desde 0 hasta totalCaracteres - 1.
                numeroAleatorio = Math.floor(numeroAleatorio);

                // charAt(numeroAleatorio) obtiene el carácter en la posición indicada dentro de la cadena.
                // Se concatena ese carácter al resultado.
                cadenaResultado += caracteresPosibles.charAt(numeroAleatorio);
            }

            // Devolvemos la cadena final con la longitud solicitada.
            return cadenaResultado;
        }

        // EJEMPLOS: mostramos en la consola una cadena de 5 caracteres y un mensaje de fin.
        console.log("Cadena aleatoria (5 caracteres):", generarCadenaAleatoria(5));
        console.log("Fin del programa");
    </script>
</head>

<body>
    <main>
        <h1>Actividad 1 – Generador de cadena aleatoria</h1>
        <p>Abre la consola del navegador para ver el resultado del ejemplo (cadena de 5 caracteres).</p>
    </main>
</body>
</html>
