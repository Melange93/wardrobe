package main.hanger;

import main.cloth.Cloth;
import main.cloth.UpperCloth;

import java.util.ArrayList;
import java.util.List;

public class Hanger implements GetCloth {
    protected UpperCloth upperCloth;

    public UpperCloth getUpperCloth() {
        return upperCloth;
    }

    public void setUpperCloth(UpperCloth upperCloth) {
        this.upperCloth = upperCloth;
    }

    public List<Cloth> getCloth() {
        List<Cloth> clothList = new ArrayList<Cloth>();
        clothList.add(upperCloth);
        return clothList;
    }
}
