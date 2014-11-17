public class Player extends Alive {
   boolean team;  //team 1 or 2?
   int player_id; //0 - 11
   
   //position information
   
   //stats
   PlayerBaseStats stats;
   
   public void takeDamage(int damage) {
      //shield handling
      super.takeDamage(damage);
   }
}