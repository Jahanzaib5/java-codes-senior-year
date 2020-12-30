public class SpaceAge {

    private double seconds;

    public SpaceAge(double seconds){
        this.seconds = seconds;
    }

    public double calculateYear(double orbitalPeriod){
        double earth = 31557600;
        return this.seconds / (earth * orbitalPeriod);
    }

    double OnEarth(){
        return calculateYear(1);
    }

    double onMercury(){
        double mercury = 0.2408467;
        return calculateYear(mercury);
    }

    double onVenus(){
        double venus = 0.61519726;
        return calculateYear(venus);
    }

    double onMars(){
        double mars = 1.8808158;
        return calculateYear(mars);
    }

    double onJupiter(){
        double jupiter = 11.862615;
        return calculateYear(jupiter);
    }

    double onSaturn(){
        double saturn = 29.447498;
        return calculateYear(saturn);
    }

    double onUranus(){
        double uranus = 84.016846;
        return calculateYear(uranus);
    }

    double onNeptune(){
        double neptune = 164.79132;
        return calculateYear(neptune);
    }
}
