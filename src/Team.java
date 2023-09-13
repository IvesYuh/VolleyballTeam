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

    public Trainer[] changeNamePlayer(Trainer[] newTeamTrainer){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero do jogador que deseja alterar o nome: ");
        int number = input.nextInt();
        System.out.println("Digite o nome do novo jogador: ");
        String changeName = input.next();
        newTeamTrainer[number].setName(changeName);
        return newTeamTrainer;
    }

    public Trainer[] changeHeighPlayer(Trainer[] newTeamTrainer){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero do jogador que deseja alterar a altura: ");
        int number = input.nextInt();
        System.out.println("Digite a altura nova do jogador: ");
        float changeHeight = input.nextFloat();
        newTeamTrainer[number].setHeight(changeHeight);
        input.close();
        return newTeamTrainer;
    }

    public Trainer[] changeAgePlayer(Trainer[] newTeamTrainer){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero do jogador que deseja alterar a idade: ");
        int number = input.nextInt();
        System.out.println("Digite a idade atual do jogador: ");
        int changeAge = input.nextInt();
        newTeamTrainer[number].setAge(changeAge);
        input.close();
        return newTeamTrainer;
    }

    public Trainer[] changePositionPlayer(Trainer[] newTeamTrainer){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero do jogador que deseja a posição: ");
        int number = input.nextInt();
        System.out.println("Digite a posição atual do jogador: ");
        String changePosition = input.next();
        newTeamTrainer[number].setPosition(changePosition);
        input.close();
        return newTeamTrainer;
    }

    public Trainer[] changeRankPlayer(Trainer[] newTeamTrainer){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero do jogador que deseja o rank: ");
        int number = input.nextInt();
        System.out.println("Digite o rank atual do jogador: ");
        String changeRank = input.next();
        newTeamTrainer[number].setPosition(changeRank);
        input.close();
        return newTeamTrainer;
    }

    public void play(){
        System.out.println("O time está jogando");
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
