package org.gortz.alarm.model;

/**
 * Created by jimmy on 4/23/16.
 */
public class SensorData {
    private String protocol;
    private String id;
    private String model;
    private String humidity;
    private String temp;

    public SensorData(String protocol, String id, String model, String humidity, String temp){
        this.protocol = protocol;
        this.id = id;
        this.model = model;
        this.humidity = humidity;
        this.temp = temp;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getTemp() {
        return temp;
    }

    public boolean compareTo(SensorData sd){
        if(!this.getProtocol().equals(sd.getProtocol())) return false;
        else if(!this.getId().equals(sd.getId())) return false;
        else if(!this.getModel().equals(sd.getModel())) return false;
        else if(!this.getHumidity().equals(sd.getHumidity())) return false;
        else if(!this.getTemp().equals(sd.getTemp())) return false;
        else return true;
    }

}