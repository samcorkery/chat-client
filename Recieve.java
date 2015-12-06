class Recieve{
  String test = " ";
  String name = " ";
  public void recieve(String names, String input){
    test = input;
    name = names;

  }
  public String getMessage(){
    return name+test;
  }
}
