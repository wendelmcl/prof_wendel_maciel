package q2;

import java.util.ArrayList;
import java.util.Random;
import java.util.random.RandomGenerator;

public class exec {
    public static void main(String[] args){

        ArrayList<Veiculo> Vc = new ArrayList<>();
        Carro BMW = new Carro();
        Caminhao Volvo = new Caminhao();
        Motocileta Biz = new Motocileta();
        Vc.add(BMW);
        Vc.add(Volvo);
        Vc.add(Biz);
        System.out.println(Vc.get(0));
        System.out.println("VAMOS COMEÇAR A CORRIDA MALUCA, Na primeira possição temos Carter e seu BMW "+Vc.get(0).acelerar()
        +" Na segunda possição temos Becka com sua BIZ "+Vc.get(2).acelerar()+"Na teceira e ultima temos JAck com seu grande Volvo"+Vc.get(1).acelerar()+"Vamos começarrr");
        System.out.println("------------------------------------------------");
        for(int i = 1; i<11 ; i++){
            System.out.println("BMW vem acelerando "+Vc.get(0).acelerar());
            System.out.println("Mas a Biz vem pedindo passagem "+Vc.get(2).fazerBbarulho());
            System.out.println("Parece que o Volvo sobrou na curva "+Vc.get(1).frear());
            System.out.println("Bmw freo para a Biz"+Vc.get(0).frear());
            System.out.println("Biz passou BMW"+Vc.get(2).acelerar());
            System.out.println("Volvo ta pedindo passagem tbm"+Vc.get(1).fazerBbarulho());
            System.out.println(("Bmw pede passagem para biz"+Vc.get(0).fazerBbarulho()));
            System.out.println("Biz deixa o Volvo passar por todo mundo"+Vc.get(2).frear());
            System.out.println(("Volvo passou por todos"+Vc.get(1).acelerar()));
            System.out.println("A "+i+"º volta já foi");



        }
        System.out.println("Corrida encerrada !!!");



    }
}
