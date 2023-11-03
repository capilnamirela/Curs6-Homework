public class Bottle {
    private Integer totalCapacityML;
    private Integer availableLiquidML;
    private boolean open;
    private Integer emptyCapacityML;

    public Bottle(Integer totalCapacityML, Integer availableLiquidML, boolean open) {
        this.totalCapacityML = totalCapacityML;
        this.availableLiquidML = availableLiquidML;
        this.open = open;
    }

    public Integer getTotalCapacityML() {
        return totalCapacityML;
    }

    public Integer getAvailableLiquidML() {
        return availableLiquidML;
    }

    // public boolean isOpen(){
    //    return open;
    // }
    public boolean isMoreLiquid() {
        if (availableLiquidML > totalCapacityML) {
            return true;
        } else {
            return false;
        }
    }

    public Integer getEmptyCapacity() {
        emptyCapacityML = totalCapacityML - availableLiquidML;
        return emptyCapacityML;
    }

    public boolean openBottle() {
        if (open == true) {
            System.out.println("Sticla este deja deschisa!");
        } else {
            open = true;
            System.out.println(("Ai deschis sticla!"));
        }
        return open;
    }

    public boolean closeBottle() {
        if (open == false) {
            System.out.println("Sticla este deja inchisa!");
        } else {
            open = false;
            System.out.println(("Ai inchis sticla!"));
        }
        return open;
    }

    public String drankLiquid(Integer drankLiquidML) {
        if (open == true) {
            if (availableLiquidML >= drankLiquidML) {
                availableLiquidML = availableLiquidML - drankLiquidML;
                return drankLiquidML + " baut, noua cantitate disponibila este: " + availableLiquidML;
            } else {
                return "Cantitatea dorita nu este disponibila, se poate bea maxim: " + availableLiquidML;
            }
        } else {
            return "Trebuie deschisa sticla pentru a bea din ea!";
        }


    }

}
