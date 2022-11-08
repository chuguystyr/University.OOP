abstract class Sushi {
    public void prepareRiceOrNori() {
    }
    public void prepareFilling() {
    }
    public void serving() {
    }
}
enum SushiType {
    SASHIMI,
    FILADELFIA,
    HOT_ROLL,
    MAKI_ROLL,
    KETO_SUSHI
}
class Sashimi extends Sushi {}
class Filadelfia extends Sushi {}
class HotRoll extends Sushi {}
class MakiRoll extends Sushi {}
class KetoRoll extends Sushi {}

class UkrainianStyleSashimi extends Sushi {
    @Override
    public void serving() {
        System.out.println("Adding horseradish instead of vasabi...");
    }
}
class UkrainianStyleFiladelfia extends Sushi {
    @Override
    public void serving() {
        System.out.println("Adding horseradish instead of vasabi...");
    }
}
class UkrainianStyleHotRoll extends Sushi {
    @Override
    public void serving() {
        System.out.println("Adding horseradish instead of vasabi...");
    }
}
class UkrainianStyleMakiRoll extends Sushi {
    @Override
    public void serving() {
        System.out.println("Adding horseradish instead of vasabi...");
    }
}
class UkrainianStyleKetoRoll extends Sushi {
    @Override
    public void serving() {
        System.out.println("Adding horseradish instead of vasabi...");
    }
}
class SimpleSushiFactory {
    public Sushi createSushi (SushiType type) {
        Sushi sushi = null;
        switch (type) {
            case SASHIMI:
                sushi = new Sashimi();
                break;
            case FILADELFIA:
                sushi = new Filadelfia();
                break;
            case HOT_ROLL:
                sushi = new HotRoll();
                break;
            case MAKI_ROLL:
                sushi = new MakiRoll();
                break;
            case KETO_SUSHI:
                sushi = new KetoRoll();
        }
        return sushi;
    }
}
abstract class SushiShop {
    public Sushi orderSushi(SushiType type) {
        Sushi sushi = createSushi(type);
        sushi.prepareRiceOrNori();
        sushi.prepareFilling();
        sushi.serving();
        System.out.println("Here you go, see ya!");
        return sushi;
    }
    protected abstract Sushi createSushi(SushiType type);
}
class TraditionalSushiShop extends SushiShop {
    @Override
    public Sushi createSushi (SushiType type) {
        Sushi sushi = null;
        switch (type) {
            case SASHIMI:
                sushi = new Sashimi();
                break;
            case FILADELFIA:
                sushi = new Filadelfia();
                break;
            case HOT_ROLL:
                sushi = new HotRoll();
                break;
            case MAKI_ROLL:
                sushi = new MakiRoll();
                break;
                case KETO_SUSHI:
                sushi = new KetoRoll();
                break;
        }
        return sushi;
    }
}
class UkrainianSushiShop extends SushiShop {
    @Override
    public Sushi createSushi (SushiType type) {
        Sushi sushi = null;
        switch (type) {
            case SASHIMI:
                sushi = new UkrainianStyleSashimi();
                break;
            case FILADELFIA:
                sushi = new UkrainianStyleFiladelfia();
                break;
            case HOT_ROLL:
                sushi = new UkrainianStyleHotRoll();
                break;
            case MAKI_ROLL:
                sushi = new UkrainianStyleMakiRoll();
                break;
                case KETO_SUSHI:
                sushi = new UkrainianStyleKetoRoll();
                break;
        }
        return sushi;
    }
}
public class SushiBar {
    public static void main(String[] args) {
        System.out.println("Welcome to the SushiBar!");
        SushiShop traditionalSuhiShop = new TraditionalSushiShop();
        SushiShop ukrainianSushiShop = new UkrainianSushiShop();
        ukrainianSushiShop.orderSushi(SushiType.FILADELFIA);
        traditionalSuhiShop.orderSushi(SushiType.KETO_SUSHI);
}
}