import java.util.Random;
import java.util.UUID;

public class Cliente {

    UUID clientId;
    int telephone;

    Cliente(int telephone) {
        this.telephone = telephone;
        clientId = UUID.randomUUID();
    }
}
