package Test.java.abstractfactory;

import main.java.abstractfactory.Carro;
import main.java.abstractfactory.FabricaAbstrata;
import main.java.abstractfactory.FabricaAutomatica;
import main.java.abstractfactory.FabricaManual;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {
    @Test
    void deveInformarCategoriaCompacto(){
        FabricaAbstrata fabrica = new FabricaAutomatica();
        Carro carro = new Carro(fabrica);
        assertEquals("Categoria Compacto", carro.emitirCategoria());
    }

    @Test
    void deveInformarCategoriaSUV(){
        FabricaAbstrata fabrica = new FabricaManual();
        Carro carro = new Carro(fabrica);
        assertEquals("Categoria SUV", carro.emitirCategoria());
    }

    @Test
    void deveInformarTransmissaoAutomatica(){
        FabricaAbstrata fabrica = new FabricaAutomatica();
        Carro carro = new Carro(fabrica);
        assertEquals("Transmissão Automática", carro.emitirTransmissao());
    }

    @Test
    void deveInformarTransmissaoManual(){
        FabricaAbstrata fabrica = new FabricaManual();
        Carro carro = new Carro(fabrica);
        assertEquals("Transmissão Manual", carro.emitirTransmissao());
    }
}
