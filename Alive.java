public class Alive {
   int health;
   
   public void takeDamage(int damage) {
      health -= damage;
      if (health <= 0)
         die();
   }
   
   public void die() {}
   
   public void pickup(Droppable item) {}
   
   public void move(double delta_time) {}
}