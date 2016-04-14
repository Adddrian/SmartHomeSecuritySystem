package org.gortz.alarm.Controller;
import org.gortz.alarm.model.Alarm;
/**
 * Created by adrian on 02/04/16.
 */
public class Controller {
    Alarm alarm;
    Thread Sensor;
    public Controller() {
        startSensor();
        alarm =  Alarm.getInstance();
    }
    private boolean startSensor(){
        //Create thread to handle Sensors
        Sensor = new Thread(new SensorController());
        Sensor.start();
        return true; //TODO - fix a better way to check if it succeeded
    }

    public boolean changeAlarmStatus(Alarm.Status newAlarmStatus){
        return alarm.changeStatus(newAlarmStatus);
    }

}