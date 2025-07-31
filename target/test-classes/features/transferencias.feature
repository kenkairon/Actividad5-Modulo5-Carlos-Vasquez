Feature: Bank Transfer Validation

Scenario Outline: Validate different transfer outcomes
  Given the user is logged in
  When the user transfers <monto> to account <cuenta>
  Then the user should see the message "<resultado>"

Examples:
  | monto | cuenta     | resultado                   |
  | 100   | 123456789  | Transferencia exitosa       |
  | -50   | 123456789  | Monto inválido              |
  | 100   | 000000000  | Cuenta destino no válida    |

Scenario: Fill in transfer form data
  Given the user is logged in
  When the user completes the following form:
    | campo    | valor         |
    | nombre   | Carla         |
    | apellido | Soto          |
    | email    | carla@qa.com  |
    | edad     | 35            |
