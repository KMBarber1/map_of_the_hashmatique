import java.util.HashMap;

public class Hashmatique {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Just like a Pill, Pink", "Your just like a pill.");
        map.put("A Great Big World, Say  Something", "Say something, i'm giving up on you.");
        map.put("Unwell, Matchbox Twenty", "I'm not crazy, I'm just a little unwell.");
        map.put("Grenade, Bruno Mars", "Easy come, Easy go...");

        String val = map.get("Just like a Pill, Pink");

        for (String key : map.keySet()) {
            System.out.println(String.format("Track: %s: Lyrics: %s", key, map.get(key)));
        }


    }
}

