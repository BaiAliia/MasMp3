package masMP3s19239.masmp1Overlap;

import mas.mp1.s19239.model.exceptions.ModelValException;

import java.time.LocalDate;
import java.util.EnumSet;

;


public class Game {
    private LocalDate releaseDate;
    private String Name ;
    private int numberOfDowloads;



    private Integer maxNofgamers;//multiplayer attribute
    private Integer levels;//attribute for Escape type
    private Integer ageRestriction;//horror 16+ or 18 +


    private EnumSet<GameType> types ;


    public Game(LocalDate releaseDate, String name, int numberOfDowloads, EnumSet<GameType> types,Integer max,Integer lvl
    ,Integer Age) {
        this.releaseDate = releaseDate;
        setName(name);
        this.numberOfDowloads = numberOfDowloads;
       SetTypes(types);
     if(this.IsMulti()){
        setMaxNofgamers(max);
    }
      if(this.IsHorror()){
          setAgeRestriction(Age);
        }

        if(this.IsEscsape()){
          setLevels(lvl);
        }
    }


    private void SetTypes(EnumSet<GameType> types){
        if(types==null|| types.isEmpty()){
            throw new ModelValException("The types cant be empty or null");
        }

        this.types=types;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        if(name==null||name.isBlank()){
            throw new ModelValException("Name of the game cant be null or Empty");
        }
        Name = name;
    }

    public int getNumberOfDowloads() {
        return numberOfDowloads;
    }

    public void setNumberOfDowloads(Integer numberOfDowloads) {
        this.numberOfDowloads = numberOfDowloads;
    }

    public Integer getMaxNofgamers() {
        if (types.contains(GameType.MultiPlayer)) {
            return maxNofgamers;
        } else {
          throw new ModelValException("This game is not multiplayer cant return mx number of players");
        }
    }



    public void setMaxNofgamers(Integer maxNofgamers) {
        if(this.IsMulti()) {
            this.maxNofgamers = maxNofgamers;
        }else{
            throw new ModelValException("Cant set the max number of players game is not multiplayer");
        }
    }

    public Integer getLevels() {
        if(this.IsEscsape()) {
            return levels;
        }else{
            throw new ModelValException("Cant get levels this game is not escape game");
        }
    }

    public void setLevels(Integer levels) {
        if(this.IsEscsape()) {
           this.levels=levels;
        }else{
            throw new ModelValException("Cant set levels this game is not escape game");
        }
    }

    public Integer getAgeRestriction() {
        if(this.IsHorror()) {
            return ageRestriction;
        }else{
            throw new ModelValException("Cant get age restriction this game is not horror game");
        }
    }

    public void setAgeRestriction(Integer ageRestriction) {
        if(this.IsHorror()  && ageRestriction>3) {
          this.ageRestriction=ageRestriction;
        }else{
            throw new ModelValException("Cant set age restriction this game is not horror game");
        }
    }

    public EnumSet<GameType> getTypes() {
        return types;
    }

  public  boolean  IsMulti(){
        return this.types.contains(GameType.MultiPlayer);
  }
    public  boolean  IsHorror(){
        return this.types.contains(GameType.Horror);
    }

    public  boolean  IsEscsape(){
        return this.types.contains(GameType.Escape);
    }

    @Override
   public  String toString(){
        return "Name "+ this.Name +"Downloads " + this.numberOfDowloads+" Types " + types ;

    }
}
