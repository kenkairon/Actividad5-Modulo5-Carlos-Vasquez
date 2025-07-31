package cl.kibernumacademy.steps;

import io.cucumber.java.en.*;

import java.util.Map;

import org.junit.jupiter.api.Assertions;

public class TransferenciasSteps {
    private String mensaje;

    @Given("the user is logged in")
    public void el_usuario_ha_iniciado_sesion() {
        System.out.println("➡️ Usuario ha iniciado sesión correctamente.");
    }

    @When("the user transfers {int} to account {int}")
    public void the_user_transfers_to_account(Integer monto, Integer cuenta) {
        System.out.println("💸 Transfiriendo " + monto + " a la cuenta " + cuenta);

        if (monto <= 0) {
            mensaje = "Monto inválido";
        } else if (!cuenta.toString().equals("123456789")) {
            mensaje = "Cuenta destino no válida";
        } else {
            mensaje = "Transferencia exitosa";
        }
    }

    @Then("the user should see the message {string}")
    public void the_user_should_see_the_message(String esperado) {
        System.out.println("✅ Esperado: " + esperado);
        System.out.println("🔍 Obtenido: " + mensaje);
        Assertions.assertEquals(esperado, mensaje);
    }

    @When("the user completes the following form:")
    public void the_user_completes_the_following_form(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> form = dataTable.asMap();
        form.forEach((campo, valor) -> {
            System.out.println("📝 " + campo + ": " + valor);
        });
    }

}
