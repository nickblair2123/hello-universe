/**
 * Wake up and greet the Universe
 *
 * @author Nicholas Blair
 * @version 7/14/2017.
*/
public class HelloUniverse {

    public static void main(String[] arg) {
        //Create list of planets in the solar system
        String[] solarSystem = {
                "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"
        };

        //Print greetings to the Universe
        System.out.println("Greetings Universe");
        for (String planet: solarSystem) {
            System.out.println("Hello " + planet + "!!");
        }
    }
}
