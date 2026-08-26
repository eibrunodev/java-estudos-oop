package java_poo;

public class Humano extends SerVivo{

    public Humano(){
        super(32);
    }

    @Override
    public void respirar() {
        System.out.println(this.idade);
        System.out.println("respirando!");
    }
}
