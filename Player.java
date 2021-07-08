public class Player{
  private String Name;
  private int Age;
  private String Type;
  private int Statistics;

  public Player(){ // Default Constructor

  }
  public Player(String Name, int Age, String Type, int Statistics){// Overloaded Constuctor

    this.Name = Name;
    this.Age = Age;
    this.Type = Type;
    this.Statistics = Statistics;


  }
  public double batAverage(){

  }

  public double bowlAverage(){

  }
  
  public void playerDetails(){
    System.out.println("Player Details");
    System.out.println();
    System.out.println("Player Name: " + Name);
    System.out.println("Player Type: " + Type);
    System.out.println("Player Age: " + Age);
    System.out.println("Statistics: " + Statistics);

  }
  public void bestPlayer(){

  }
