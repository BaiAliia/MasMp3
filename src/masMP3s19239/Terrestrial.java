package masMP3s19239;

import mas.mp1.s19239.model.exceptions.ModelValException;

public class Terrestrial extends Animal implements ITerrestrial {

    private String Features;
    private String Area;
    private boolean isDangerous;

    public Terrestrial(String name, int weight, String features, String area, boolean isDangerous) {
        super(name, weight);
       setFeatures(features);
        setArea(area);
        this.isDangerous = isDangerous;
    }

    @Override
    public String getFeatures() {
        return Features;
    }

    @Override
    public void setFeatures(String features) {
        if(features==null||features.isBlank()){
            throw new ModelValException("The features  cant be null or blank");
        }
        Features = features;
    }

    @Override
    public String getArea() {
        return Area;
    }

    @Override
    public void setArea(String area) {
        if(area==null||area.isBlank()){
            throw new ModelValException("The area cant be null or blank");
        }
        Area = area;
    }

    @Override
    public boolean isDangerous() {
        return isDangerous;
    }

    @Override
    public void setDangerous(boolean dangerous) {
        isDangerous = dangerous;
    }

    @Override
    public String Animals() {
        return "Terrestrials are cute ";
    }
}
