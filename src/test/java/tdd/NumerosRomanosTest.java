package tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumerosRomanosTest {

    private NumerosRomanos numerosRomanos = new NumerosRomanos();

    @Test
    public void pasar1ANumerosRomanos() {
        String romano = this.numerosRomanos.convertirARomano(1);
        assertEquals(romano,"I");
    }

    @Test
    public void pasar2ANumerosRomanos() {
        String romano = this.numerosRomanos.convertirARomano(2);
        assertEquals(romano,"II");
    }

    @Test
    public void pasar3ANumerosRomanos() {
        String romano = this.numerosRomanos.convertirARomano(3);
        assertEquals(romano,"III");
    }

    @Test
    public void pasar4ANumerosRomanos() {
        String romano = this.numerosRomanos.convertirARomano(4);
        assertEquals(romano,"IV");
    }

    @Test
    public void pasar5ANumerosRomanos() {
        String romano = this.numerosRomanos.convertirARomano(5);
        assertEquals(romano,"V");
    }

    @Test
    public void pasar6ANumerosRomanos() {
        String romano = this.numerosRomanos.convertirARomano(6);
        assertEquals(romano,"VI");
    }

    @Test
    public void pasar7ANumerosRomanos() {
        String romano = this.numerosRomanos.convertirARomano(7);
        assertEquals(romano,"VII");
    }

}
