# 🏦 Validación de Transferencias Bancarias - BDD con Cucumber

## 🎯 Objetivo  
Automatizar pruebas de transferencias bancarias con diferentes escenarios de entrada y validación de formularios usando **Cucumber**, **Selenium** y **Java**, aplicando la metodología **BDD** (Behavior Driven Development).

---

## 📁 Estructura del Proyecto

bdd-bank-transfer/
├── src/
│ ├── test/
│ │ ├── java/
│ │ │ ├── runner/
│ │ │ │ └── RunCucumberTest.java
│ │ │ ├── steps/
│ │ │ │ └── BankTransferSteps.java
│ │ │ └── pages/
│ │ │ └── BankTransferPage.java
│ │ └── resources/
│ │ └── features/
│ │ └── bank_transfer.feature
├── pom.xml


---

## 📄 Escenarios Cubiertos

✅ **Escenario 1: Transferencia exitosa**  
- Monto: `100`  
- Cuenta: `123456789`  
- Resultado: `Transferencia exitosa`

🚫 **Escenario 2: Monto inválido**  
- Monto: `-50`  
- Resultado: `Monto inválido`

❌ **Escenario 3: Cuenta inválida**  
- Cuenta: `000000000`  
- Resultado: `Cuenta destino no válida`

🧾 **Escenario 4: Formulario con datos personales**  
- Nombre: Carla  
- Apellido: Soto  
- Email: carla@qa.com  
- Edad: 35

---

## 🧪 Cómo Ejecutar las Pruebas

```bash
mvn test

