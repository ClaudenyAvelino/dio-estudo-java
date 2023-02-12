public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.aumentarVolume();
        System.out.println("Canal atual :" + smartTv.canal);
        smartTv.mudarDeCanal(13);
        System.out.println("Canal novo :" + smartTv.canal);

        System.out.println("TV Ligada ? " + smartTv.ligada);

        System.out.println("Volume atual :" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status => TV Ligada ? " + smartTv.ligada);

    }
}
