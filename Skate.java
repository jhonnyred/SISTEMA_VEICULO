class Skate extends Veiculo{
    // ATRIBUTOS
    private String marca;
    private String cor;
    private int dureza;
    private int diametro;

    // CONSTRUTORES
    Skate(){
    }

    Skate(String modelo, String fabricacao, String marca, String cor, int dureza, int diametro){
        super(modelo, fabricacao);
        this.marca = marca;
        this.cor = cor;
        this.dureza = dureza;
        this.diametro = diametro;
    }

    // MÉTODOS
    @Override
    protected String printaTudo(){
        String veiculo = super.printaTudo();
        String marca = this.marca;
        String cor = this.cor;
        String roda = String.valueOf(this.dureza)+ "A " +String.valueOf(this.diametro)+ "mm";
        
        return "\nSKATE" +veiculo +"\nMarca: " +marca+ "\nCor: " +cor+ "\nRoda: " +roda;
    }

    protected String insert(){
        String modelo = getModelo();
        String fabricacao = getFabricacao().format(formatador);
        String cor = this.cor;
        String roda = String.valueOf(this.dureza)+ "A " +String.valueOf(this.diametro)+ "mm";
        return "INSERT INTO Skate (modelo, fabricacao, marca , cor, roda)\nVALUES ('"+modelo+"', '"+fabricacao+"', '"+cor+"', '"+roda+"');";
    }

    // GETTERS
    public String getMarca(){
        return marca;
    }

    public String getCor(){
        return cor;
    }

    public String getRoda(){
        return  String.valueOf(this.dureza)+ "A " +String.valueOf(this.diametro)+ "mm";
    }

    // SETTER
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setRoda(int dureza, int diametro){
        this.dureza = dureza;
        this.diametro = diametro;
    }
}
