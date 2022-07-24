public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public boolean isFlying() {
        return flying;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s takes off in the sky.%n", this.getName());
        }
    }

    @Override
    public int ascend(int meters) {
        if ( this.flying ) {
            this.altitude = Math.min( this.altitude + meters, 10000 );
            System.out.printf( "%s flies upward, altitude : %d%n", this.getName(), this.altitude );
        }
        return this.altitude;
    }

    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.printf("%s flies downward, depths : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void land() {
        if (this.flying && this.altitude == 1) {
            System.out.printf("%s lands .%n", this.getName());
        } else {
            System.out.printf("%s is too high in the air, it can't lands.%n", this.getName());
        }
    }

    @Override
    public void glide() {
        Fly.super.glide();
    }


}