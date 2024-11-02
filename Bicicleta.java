class Bicicleta extends Veiculo{
    // ATRIBUTOS
    private String marca;
    private String cor;
    private String material;
    private int marcha;
    private boolean amortecedor;

    // CONSTRUTORES
    Bicicleta(){
    }

    Bicicleta(String modelo, String fabricacao, String marca, String cor, String material , int marcha, boolean amortecedor){
        super(modelo, fabricacao);
        this.marca = marca;
        this.cor = cor;
        this.material = material;
        this.marcha = marcha;
        this.amortecedor = amortecedor;
    }

    // MÉTODOS
    @Override
    protected String printaTudo(){
        String veiculo = super.printaTudo();
        String marca = this.marca;
        String cor = this.cor;
        String material = this.material;
        String marcha = String.valueOf(this.marcha);
        String amortecedor = String.valueOf(this.amortecedor);

        return "\nBICILETA" +veiculo+ "\nMarca: " +marca+ "\nCor: " +cor+ "\nMaterial: " +material+ "\nQtd. Marchas: " +marcha+ "\nAmortecedor: " +amortecedor;
    }

    protected String insert(){
        String modelo = getModelo();
        String fabricacao = getFabricacao().format(formatador);
        String marca = this.marca;
        String cor = this.cor;
        String material = this.material;
        String marcha = String.valueOf(this.marcha);
        String amortecedor = String.valueOf(this.amortecedor);
        return "INSERT INTO Bicicleta (modelo, fabricacao, marca, cor, material, marcha, amortecedor)\nVALUES ('"+modelo+"', '"+fabricacao+"', '"+marca+"', '"+cor+"', '"+material+"', '"+marcha+"', '"+amortecedor+"');";
    }

    // GETTERS
    public String getMarca(){
        return marca;
    }

    public String getCor(){
        return cor;
    }

    public String getMaterial(){
        return material;
    }
    
    public int getMarcha(){
        return marcha;
    }

    public boolean getAmortecedor(){
        return amortecedor;
    }

    // SETTERS
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public void setMarcha(int marcha){
        this.marcha = marcha;
    }

    public void setAmortecedor(boolean amortecedor){
        this.amortecedor = amortecedor;
    }
}
