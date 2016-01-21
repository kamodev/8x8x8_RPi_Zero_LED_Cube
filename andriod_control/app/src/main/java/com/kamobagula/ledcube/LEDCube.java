package com.kamobagula.ledcube;

public class LEDCube {

    // Private variables and functions
    private Boolean _powerOn = false;
    private String _currentPattern = "Rain";

    public LEDCube(Object config) {
        _powerOn = false;
    }

    public Boolean isOn() {
        return _powerOn;
    }

    // Get and Set the pattern the cube is running
    public String get_currentPattern() {
        return _currentPattern;
    }

    public void set_currentPattern(String pattern) {
        _currentPattern = pattern;
    }

}
