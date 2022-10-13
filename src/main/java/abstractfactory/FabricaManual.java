package main.java.abstractfactory;

public class FabricaManual implements FabricaAbstrata {
    @Override
    public Categoria createCategoria(){return new CategoriaSUV();}

    @Override
    public Transmissao createTransmissao(){return new TransmissaoManual();}
}
