import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class DocumentoTest {
    @Test
    @DisplayName("Testa se o método getNome retorna o nome do documento")
    public void testaClasse() {
        Documento sut = new Documento("Nome", 10);
        Assertions.assertEquals("Nome", sut.getNome());
    }
}
