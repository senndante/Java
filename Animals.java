package lesson6;

public abstract class Animals {
    protected String name;
    protected int max_length; //дистанция по суше
    protected int max_length_swim; //дистанция по воде
    protected double max_height; //высота прыжка

    public Animals(String name, int max_length, int max_length_swim, double max_height) {
        this.name = name;
        this.max_length = max_length;
        this.max_length_swim = max_length_swim;
        this.max_height = max_height;
    }

    protected void running(int distance_run) {

        if (max_length >= distance_run)
            System.out.println(name + " пробежала " + distance_run + "м");
        else
            System.out.println(name + " не может пробежать " + distance_run + " слишком далеко");
    }


    protected void swimming(int distance_sw) {

        if (max_length_swim >= distance_sw)
            System.out.println(name + " проплыла " + distance_sw + "м");
        else
            System.out.println(name + " не может проплыть");
    }

    protected void jumping(double distance_jump) {

        if (max_height >= distance_jump)
            System.out.println(name + " прыгнула на " + distance_jump + "м\n");
        else
            System.out.println(name + " слишком высоко\n");
    }

}