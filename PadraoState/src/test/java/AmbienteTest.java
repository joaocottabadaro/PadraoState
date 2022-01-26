import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AmbienteTest {


        Ambiente ambiente;
        @BeforeEach
        public void setUp() {
            ambiente = new Ambiente();

        }

        ///////// Dev

        @Test
        public void nãoDeveMergiarParaRelease() {
            ambiente.setEstado(AmbienteDev
                    .getInstance());
            assertEquals("Merge feito para o ambiente Homolog", ambiente.merge());
        }
        @Test
        public void nãoDevePoderComitarDev() {
            ambiente.setEstado(AmbienteDev
                    .getInstance());
            assertEquals("Commit não deve ser feito na branch", ambiente.commit());
        }

    @Test
    public void devePuxarOriginDev() {
        ambiente.setEstado(AmbienteDev
                .getInstance());
        assertEquals("Git pull origin dev", ambiente.gitPull());
    }

                ////Cartao Credito
                @Test
                public void deveMergiarParaRelease () {
                ambiente.setEstado(AmbienteHomolog
                        .getInstance());
                assertEquals("Merge feito para o ambiente release", ambiente.merge());
            }
                @Test
                public void devePoderComitarHomolog () {
                ambiente.setEstado(AmbienteHomolog
                        .getInstance());
                assertEquals("Realizado commit para o ambiente homolog", ambiente.commit());


            }
    @Test
    public void devePuxarOriginHomolog() {
        ambiente.setEstado(AmbienteHomolog
                .getInstance());
        assertEquals("Git pull origin dev", ambiente.gitPull());
    }


            }


