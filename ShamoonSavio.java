
/**
 * 
 * 
 * @author Mr. Jaffe
 * @version 1.0 2017-07-14
 */
public class ShamoonSavio extends Animal
{
  public ShamoonSavio() {
    super("Savio Shamoon", "red", 4);
  }
  
  @Override
  public String getType() {
    return "DingDong";
  }
  
  @Override
  public String getName() {
      return "DinglyDong";
  }
  @Override
  public String speak() {
      return "WHAA";
  }
  @Override
  public String getDisposition() {
      return "blah";
  }
}
