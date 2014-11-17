public class Root {  //clientside info
   static final int dosh_to_win;
   //player info (6 per team, two teams)
   Player[] players;
   Player me;
   
   //home base info
   HomeBase base1, base2;
   
   //map info
   Map map;
   
   //game and team state info
   long game_start_time;   //set at start
   int dosh1, dosh2;       //team money amounts
   
}