package entities;

/**
 *
 * @author Evandro
 */
public class Veiculo {
    private String modeloCarro;


    public Veiculo() {
    }

    public Veiculo(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    @Override
    public String toString() {
        return "Veiculo" + ", Modelo do carro: " + modeloCarro + '}';
    }
    
}
