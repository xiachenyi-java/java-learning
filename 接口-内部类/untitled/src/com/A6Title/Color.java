package com.A6Title;

@SuppressWarnings("ALL")
public enum Color implements JK {
    REN(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);

    private double redValue;
    private double greenValue;
    private double blueValue;

    Color( double redValue, double greenValue, double blueValue){
        this.blueValue = blueValue;
        this.greenValue = greenValue;
        this.redValue = redValue;
    }
    @Override
    public void show(){
        System.out.println("三原色的含量分别为" + redValue + "\t" +
                greenValue + "\t" + blueValue);
    }
}
