import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ObjectFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObjectFactory {
	
   //use createObject method to create object of type  
   public Objects createObject(String objectType)
   {
      if(objectType == null)
      {
         return null;
      }		
      if(objectType.equalsIgnoreCase("FISH"))
      {
         return new Fish();  
      } 
      else if(objectType.equalsIgnoreCase("TURTLE"))
      {
         return new Turtle();  
      } 
      else if(objectType.equalsIgnoreCase("HOOK"))
      {
         return new Hook();
      }
      
      return null;
   }
}
