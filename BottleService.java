public class BottleService {

  public void changeLiqiudAmount(Bottle source, Bottle target) {

      target.setLiquid(source.getLiquid()+ target.getLiquid() );
      source.setLiquid(source.getLiquid() - source.getLiquid() );

  }
// z 5 do 3
  public boolean changeLiqiudAmount(Bottle source, Bottle target, int amount) {
      if (target.getLiquid() + amount > target.getCpacity()) {
          System.out.println("Przelewam z butelki " + source.getSerialNumber() + " do butelki " + target.getSerialNumber() +" " + amount + " LITRÓW");
          target.setLiquid(target.getCpacity());
          source.setLiquid(source.getLiquid() - amount);
          return true;
      }




      if (source.getLiquid() - amount >= 0) {
          target.setLiquid(target.getLiquid() + amount);
          source.setLiquid(source.getLiquid() - amount);
      }

return true;

  }

  public void drink (Bottle bottle, Drinker drinker) {
      System.out.println("Pijak " + drinker.getName() + " bedzie pil" + bottle.getLiquid() + "litrow");
      drinker.setBottlesCount(drinker.getBottlesCount() + 1);
      drinker.setHealthPoint(drinker.getHealthPoint() - bottle.getLiquid());
      bottle.setLiquid(0);
      System.out.println("pijak " + drinker.getBottlesCount());
  }

  public void breakBottle(Bottle butelka) {
      butelka.setBroken(true);
      butelka.setLiquid(0);
      butelka.setCpacity(0);
      System.out.println("Oj kurła Sąsiad");
  }




}
