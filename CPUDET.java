 class CPU
{
 double price;
 class Processor
 {
  double cores;
  String manufacturer;
 double getCache()
 {
  return 4.3;
 }
}
protected class RAM
{
 double memory;
String manufacturer;
double getClk()
{
  return 5.5;
 }
}
}
public class CPUDET
{
  public static void main(String[] args)
{
  CPU cpu=new CPU();
  CPU.Processor processor=cpu.new Processor();
  CPU.RAM ram=cpu.new RAM();
  System.out.println("Processor Cache"+processor.getCache());
  System.out.println("Ram Clockspeed"+ram.getClk());
 }
}  


 
 
 
