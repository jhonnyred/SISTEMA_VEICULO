class Motocicleta extends Automotor{
    // ATRIBUTOS
    private int cilindradas;
    private double torque;
    
    // CONSTRUTORES
    Motocicleta(){
    }

    Motocicleta(String modelo, String fabricacao, String montadora, String cor, double kilometragem, int cilindradas, double torque){
        super(modelo, fabricacao, montadora, cor, kilometragem);
        this.cilindradas = cilindradas;
        this.torque = torque;
    }

    // MÉTODOS
    @Override
    protected String printaTudo(){
        String automotor = super.printaTudo();
        String cilindradas = String.valueOf(this.cilindradas);
        String torque = String.valueOf(this.torque);
        
        return "\nMOTOCICLETA" +automotor+ "\nCilindradas: " +cilindradas+ "\nTorque: " +torque+ "N.m";
    }

    protected String insert(){
        String modelo = getModelo();
        String fabricacao = getFabricacao().format(formatador);
        String montadora = getModelo();
        String cor = getCor();
        String kilometragem = String.valueOf(getKilometragem());
        String cilindradas = String.valueOf(this.cilindradas);
        String torque = String.valueOf(this.torque);
        return "INSERT INTO Automotor (modelo, fabricacao, montadora, cor, kilometragem, cilindradas, torque)\nVALUES ('"+modelo+"', '"+fabricacao+"', '"+montadora+"', '"+cor+"', '"+kilometragem+"', '"+cilindradas+"', '"+torque+"');";
    }

    // GETTERS
    public int getCilindradas(){
        return cilindradas;
    }

    public double getTorque(){
        return torque;
    }

    // SETTERS
    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }

    public void setTorque(double torque){
        this.torque = torque;
    }
}
