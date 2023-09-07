import java.util.Scanner;

public class Team {
    private String name;
    private float height;
    private int age;
    private String position;

    public Team(){
        System.out.println("Construtor Team vazio ATIVO");
    }

    public Team(String name, float height, int age, String position){
        this.name = name;
        this.height = height;
        this.age = age;
        this.position = position;
    }

    public int changeNamePlayer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero do jogador que deseja alterar o nome: ");
        int numero = input.nextInt();
        input.close();
        return numero;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public float getHeight(){
        return height;
    }

    public void setHeight(float height){
        this.height = height;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getPosition(){
        return position;
    }

    public void setPosition(String position){
        this.position = position;
    }
}
