package transport;

public abstract class Driver {
    private final String name;
    private boolean drivingLicense;
    private int experience;

    public Driver(String name, boolean drivingLicense, int experience) {
        this.name = name;
        this.drivingLicense = drivingLicense;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public boolean isDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(boolean drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    public abstract void startMoving();
    public abstract void stop();
    public abstract void refuel();
}