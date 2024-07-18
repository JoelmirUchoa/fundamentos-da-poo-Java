public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro estado: EstadoBrasileiro.values()){
            //System.out.println(estado.getSigla() + " - " + estado.getNome());
        }
        EstadoBrasileiro EB = EstadoBrasileiro.CEARA;
        System.out.println(EB.getNome());
        System.out.println(EB.getSigla());
        System.out.println(EB.getNomeMaiusculo());
        System.out.println(EB.getIbge());
    }
}
