package masMP3s19239.masAbstractPolymorth;

import mas.mp1.s19239.model.exceptions.ModelValException;

public class Youtuber extends Person{
     private String channelName;
     private int foll;
     private String Type;

    public Youtuber(String name, String surname, int age, String channelName, int foll,String type) {
        super(name, surname, age);
        this.channelName = channelName;
        this.foll = foll;
        setType(type);
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        if(channelName==null||channelName.isBlank()){
            throw new ModelValException("The channel name cant be null ");
        }
        this.channelName = channelName;
    }

    public int getFoll() {
        return foll;
    }

    public void setFoll(int foll) {
        this.foll = foll;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        if(type==null ||type.isBlank()){
            throw new ModelValException("The type cant be null or emply");
        }
        Type = type;
    }

    @Override
    public int getIncome() {
        return (int) (foll*1.3);
    }
}
