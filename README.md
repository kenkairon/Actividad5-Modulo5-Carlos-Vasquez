🏦 Validación de Transferencias Bancarias - BDD con Cucumber
🎯 Objetivo
Automatizar pruebas de transferencias bancarias con diferentes escenarios de entrada y validación de formularios usando Cucumber + Selenium + Java, aplicando la metodología BDD (Behavior Driven Development).

📁 Estructura del Proyecto
````arduino

bdd-bank-transfer/
├── src/
│   ├── test/
│   │   ├── java/
│   │   │   ├── runner/
│   │   │   │   └── RunCucumberTest.java
│   │   │   ├── steps/
│   │   │   │   └── BankTransferSteps.java
│   │   │   └── pages/
│   │   │       └── BankTransferPage.java
│   │   └── resources/
│   │       └── features/
│   │           └── bank_transfer.feature
├── pom.xml

📄 Escenarios Cubiertos
✅ Escenario 1: Transferencia exitosa
El usuario transfiere 100 a la cuenta 123456789.

Resultado esperado: Transferencia exitosa.

🚫 Escenario 2: Monto inválido
El usuario intenta transferir -50.

Resultado esperado: Monto inválido.

❌ Escenario 3: Cuenta inválida
Se intenta transferir a una cuenta inexistente 000000000.

Resultado esperado: Cuenta destino no válida.

🧾 Escenario 4: Formulario con datos personales
El usuario completa un formulario con nombre, apellido, email y edad.

🧪 Cómo Ejecutar las Pruebas
````bash

mvn test
🛠️ Dependencias Clave (pom.xml)
cucumber-java

cucumber-junit

selenium-java

webdrivermanager

💡 Notas
Asegúrate de implementar todos los step definitions (BankTransferSteps.java) para que no aparezcan errores UndefinedStepException.

Puedes copiar los snippets sugeridos por Cucumber y completar la lógica dentro.