package masMP3s19239;

import mas.mp1.s19239.model.exceptions.ModelValException;

public class Aquatic extends Animal{
    private String Features;
    private boolean isDangerous;
    private int depth;//How deep in water it lives

    public Aquatic(String name, int weight, String features, boolean isDangerous, int depth) {
        super(name, weight);
        Features = features;
        this.isDangerous = isDangerous;
        this.depth = depth;
    }

    public String getFeatures() {
        return Features;
    }

    public void setFeatures(String features) {
        if(features==null||features.isBlank()){
            throw new ModelValException("The features cant be null or blank");
        }
        Features = features;
    }

    public boolean isDangerous() {
        return isDangerous;
    }

    public void setDangerous(boolean dangerous) {
        isDangerous = dangerous;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}
