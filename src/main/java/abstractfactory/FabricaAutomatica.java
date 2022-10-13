package main.java.abstractfactory;

public class FabricaAutomatica implements FabricaAbstrata{
    @Override
    public Categoria createCategoria(){return new CategoriaCompacto();}

    @Override
    public Transmissao createTransmissao(){return new TransmissaoAutomatica();}
}
