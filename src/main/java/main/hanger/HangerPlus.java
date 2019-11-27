package main.hanger;

import main.cloth.Cloth;
import main.cloth.LowerCloth;

import java.util.ArrayList;
import java.util.List;

public class HangerPlus extends Hanger implements GetCloth {
    private LowerCloth lowerCloth;

    public LowerCloth getLowerCloth() {
        return lowerCloth;
    }

    public void setLowerCloth(LowerCloth lowerCloth) {
        this.lowerCloth = lowerCloth;
    }

    public List<Cloth> getCloth() {
        List<Cloth> clothList = new ArrayList<Cloth>();
        clothList.add(upperCloth);
        clothList.add(lowerCloth);
        return clothList;
    }
}
