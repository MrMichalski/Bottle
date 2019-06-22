public class Bottle {
    private int cpacity;
    private int serialNumber;
    private int liquid;
    private boolean broken;

    public Bottle (int cpacity, int serialNumber) {
        this.cpacity = cpacity;
        this.serialNumber =  serialNumber;
        this.liquid = 0;
    }


    public Bottle(int cpacity, int serialNumber, int liquid) {
        this.cpacity = cpacity;
        this.serialNumber = serialNumber;
        if (liquid > cpacity) {
            this.liquid = cpacity;
        }
        else {this.liquid = liquid;}

        if (liquid < 0) {
            this.liquid = 0;
        }
    }

    public void setCpacity (int capacity) {
        this.cpacity = capacity;
    }
    public int getCpacity () {
        return cpacity;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getLiquid() {
        return liquid;
    }

    public void setLiquid(int liquid) {
        this.liquid = liquid;
    }

    public boolean isBroken() {
        return broken;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "cpacity=" + cpacity +
                ", serialNumber=" + serialNumber +
                ", liquid=" + liquid +
                ", Broken=" + broken +
                '}';
    }
}
