public enum Planet {
    MERCURY(1, 0, 2439.7, null),
    VENUS(2, 1, 6051.8, MERCURY),
    EARTH(3, 2, 6371.01, VENUS),
    MARS(4, 3, 3389.5, EARTH),
    JUPITER(5, 4, 69911.00, MARS),
    SATURN(6, 5, 58232.00, JUPITER),
    URANUS(7, 6, 25362.00, SATURN),
    NEPTUNE(8, 7, 24622.00, URANUS);


    private final Integer numberFromSun;
    private final Integer distanceFromThePreviousPlanet;
    private final Double radius;
    private final Planet previousPlanet;
    private final Double distanceToTheSun;


    Planet(Integer numberFromSun, Integer distanceFromThePreviousPlanet, Double radius, Planet previousPlanet) {
        this.numberFromSun = numberFromSun;
        this.distanceFromThePreviousPlanet = distanceFromThePreviousPlanet;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.distanceToTheSun = previousPlanet.getDistanceToTheSun() + distanceFromThePreviousPlanet;
    }

    public Integer numberFromSun() {
        return numberFromSun;
    }

    public Integer distanceFromThePreviousPlanet() {
        return distanceFromThePreviousPlanet;
    }

    public Planet previousPlanet() {
        return previousPlanet;
    }

    public Double radius() {
        return radius;
    }

    public Double getDistanceToTheSun() {
        return distanceToTheSun;
    }

}
