package main.java.abstractfactory;

public class Carro {

    private Categoria categoria;
    private Transmissao transmissao;

    public Carro(FabricaAbstrata fabrica){
        this.categoria = fabrica.createCategoria();
        this.transmissao = fabrica.createTransmissao();
    }

    public String emitirCategoria(){return this.categoria.emitir();}

    public String emitirTransmissao(){return this.transmissao.emitir();}
}
