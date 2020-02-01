public class detergent extends Cleanser{

  public void scrub(){
    append(" Detergent.scrub()");
    super.scrub();
  }

  public void foam(){
    append("  foam()");
  }

  public static void main(String[] s){
    detergent x = new detergent();
    x.dilute();
    x.apply();
    x.scrub();
    x.foam();
    System.out.println(x);
    System.out.println("test base class:");
    Cleanser.main(s);
  }
}
