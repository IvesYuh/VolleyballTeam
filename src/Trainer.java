public class Trainer extends Team{

    private String nameTeam;
    private String rank;
    public Trainer(){
    }

    public Trainer(String name, float height, int age, String position ,String nameTeam, String rank){
        super(name, height, age, position);
        this.nameTeam = nameTeam;
        this.rank = rank;
    }

    public String getNameTeam(){
        return nameTeam;
    }

    public void setNameTeam(String nameTeam){
        this.nameTeam = nameTeam;
    }

    public String getRank(){
        return rank;
    }

    public void setRank(String rank){
        this.rank = rank;
    }
}