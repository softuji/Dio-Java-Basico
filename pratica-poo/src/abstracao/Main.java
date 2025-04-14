package abstracao;

public class Main {
    public static void main(String[] args) {
        var male = new Person("Joao");
        var female = new Person("Maria");
        System.out.println("Nome: " + male.getName() + " Idade: " + male.getAge());
        System.out.println("Nome: " + female.getName() + " Idade: " + female.getAge());
    }
    
}
