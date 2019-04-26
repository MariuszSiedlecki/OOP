package VoicesAnimals;

import java.util.Collections;

public class Animal {
    private String name;
    private String sound;
    private boolean loud;

    public Animal(String name, String sound, boolean loud) {
        this.name = name;
        this.sound = sound;
        this.loud = loud;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public boolean isLoud() {
        return loud;
    }

    public void setLoud(boolean loud) {
        this.loud = loud;
    }

    public void speak(int times) {
        String count = String.join(", ", Collections.nCopies(times,sound));
        if (loud) {
            count = count.toUpperCase();
        } else {
            count = count.toLowerCase();
        }
        System.out.println(count);
    }
}
