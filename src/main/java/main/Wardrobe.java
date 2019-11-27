package main;

import main.cloth.Cloth;
import main.cloth.LowerCloth;
import main.cloth.UpperCloth;
import main.hanger.Hanger;
import main.hanger.HangerPlus;

import java.util.UUID;

public class Wardrobe {
    private final int capacity;
    private Hanger[] hangers;

    public Wardrobe(int capacity) {
        this.capacity = capacity;
        this.hangers = new Hanger[capacity];
    }

    public boolean isFreeSlot() {
        for (Hanger hanger : hangers) {
            if (hanger == null) {
                return true;
            }
        }
        return false;
    }

    public boolean isFreeSlot(UpperCloth upperCloth) {
        for (Hanger hanger : hangers) {
            if (hanger == null || hanger.getUpperCloth() == null) {
                return true;
            }
        }
        return false;
    }

    public boolean isFreeSlot(LowerCloth lowerCloth) {
        for (Hanger hanger : hangers) {
            if (hanger == null || (hanger instanceof HangerPlus && ((HangerPlus) hanger).getLowerCloth() == null)) {
                return true;
            }
        }
        return false;
    }

    public Cloth getCloth(UUID uuid){
        for (Hanger hanger: hangers) {
            if (hanger != null && hanger.getCloth() != null) {
                for (Cloth cloth: hanger.getCloth()) {
                    if (cloth.getId() == uuid) {
                        return cloth;
                    }
                }
            }
        }
        return null;
    }

    public void addHanger(Hanger hanger) {
        for (int i = 0; i < capacity; i++) {
            if (hangers[i] == null) {
                hangers[i] = hanger;
            }
        }
    }

}
