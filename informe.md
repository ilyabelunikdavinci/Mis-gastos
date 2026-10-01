PARCIAL 1 — APLICACIÓN “MIS GASTOS”

1. Descripción de la pantalla

La aplicación “Mis Gastos” presenta una pantalla destinada al registro y visualización de gastos personales.

La pantalla contiene un ícono relacionado con las finanzas, el título de la aplicación, el total acumulado de los gastos, campos para ingresar la información de un nuevo gasto, un botón para registrarlo y una sección donde se muestran los movimientos agregados.

La pantalla fue desarrollada utilizando ConstraintLayout y diferentes LinearLayout para organizar los elementos de manera vertical y horizontal.

2. Elementos de la interfaz

La pantalla contiene los siguientes elementos:

Ícono de billetera: representa visualmente el objetivo de la aplicación.
“Mis gastos”: título principal de la pantalla.
“Gastos del mes”: indica el total acumulado.
Total: muestra la suma de los gastos registrados.
Campo “Descripción”: permite ingresar una descripción del gasto.
Campo para ingresar el monto: permite introducir el importe del gasto.
“ARS”: indica la moneda utilizada.
Botón “Agregar gasto”: permite registrar el nuevo movimiento.
Sección “Movimientos”: muestra los gastos registrados durante la ejecución de la aplicación.

3. Funcionalidad

El usuario puede ingresar una descripción y un monto correspondiente a un gasto.

Al presionar el botón “Agregar gasto”, la aplicación:

Obtiene la descripción ingresada.
Obtiene el monto ingresado.
Crea dinámicamente un nuevo elemento para representar el movimiento.
Agrega el nuevo movimiento a la lista.
Actualiza el total acumulado de los gastos.

Los nuevos movimientos son creados mediante Java durante la ejecución, fuera del XML.

4. Flujo de uso

El funcionamiento de la pantalla es el siguiente:

El usuario inicia la aplicación.
Se muestra el total actual de gastos.
El usuario ingresa la descripción del gasto.
Ingresa el monto correspondiente.
Presiona el botón “Agregar gasto”.
El nuevo movimiento aparece en la sección “Movimientos”.
El total acumulado se actualiza automáticamente.
El usuario puede continuar agregando nuevos gastos y visualizarlos en la lista.

5. Comportamiento dinámico

La aplicación presenta comportamiento dinámico mediante la interacción con el botón “Agregar gasto”.

Cada vez que el usuario registra un gasto, se crea un nuevo elemento visual mediante Java y se incorpora a la lista de movimientos. Al mismo tiempo, se modifica el total acumulado mostrado en la pantalla.

De esta manera, la pantalla responde a las acciones del usuario y permite visualizar varios movimientos registrados durante la ejecución.
