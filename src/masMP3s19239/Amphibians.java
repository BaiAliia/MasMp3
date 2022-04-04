package masMP3s19239;

import mas.mp1.s19239.model.exceptions.ModelValException;

public class Amphibians extends Aquatic implements ITerrestrial{
    private String area;
    private boolean IsItCute;

    public Amphibians(String name, int weight, String features, boolean isDangerous, int depth,boolean cute,String area) {
        super(name, weight, features, isDangerous, depth);
        IsItCute=cute;
        setArea(area);
    }

    public boolean isItCute() {
        return IsItCute;
    }

    public void setItCute(boolean itCute) {
        IsItCute = itCute;
    }

    @Override
    public String getArea() {
        return area;
    }

    @Override
    public void setArea(String area) {
        if(area==null||area.isBlank()){
            throw new ModelValException("The area cant be null or blank");
        }
        this.area=area;

    }

    @Override
    public String Animals() {
        return "amphibians are cute";
    }
}
