/**
 * Subject interface to attach/detach observers
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Subject
{

    public  void attach(Observer obj);
    public  void detach(Observer obj);
    public  void notifyObservers(String s, GameMessage msg);

}