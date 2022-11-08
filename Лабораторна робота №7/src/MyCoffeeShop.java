abstract class Coffee {
    public void makeCoffee() {
    }
    public void pourIntoCup() {
    }
    public void addSomeSpecial() {
    }
}
class Americano extends Coffee {}
class Cappuccino extends Coffee {}
class CaffeLatte extends Coffee {}
class Espresso extends Coffee {}

class ItalianStyleAmericano extends Coffee {}
class ItalianStyleCappuccino extends Coffee {}
class ItalianStyleCaffeLatte extends Coffee {}
class ItalianStyleEspresso extends Coffee {}

class AmericanStyleAmericano extends Coffee {
    @Override
    public void addSomeSpecial() {
        System.out.println("Using our secret secret originated in North America...");
    }
}
class AmericanStyleCappuccino extends Coffee {}
class AmericanStyleCaffeLatte extends Coffee {}
class AmericanStyleEspresso extends Coffee {}

class UkrainianStyleAmericano extends Coffee {
    @Override
    public void addSomeSpecial() {
        System.out.println("Adding some oriental spices, just like in times of Bohdan Khmelnytskiy...");
    }
}
class UkrainianStyleCappuccino extends Coffee {
    @Override
    public void addSomeSpecial() {
        System.out.println("Adding frothed milk of cows grazing in the Carpathians...");
    }
}
class UkrainianStyleCaffeLatte extends Coffee {
    @Override
    public void addSomeSpecial() {
        System.out.println("Adding a little bit of spiciness...");
    }
}
class UkrainianStyleEspresso extends Coffee {
    @Override
    public void addSomeSpecial() {
        System.out.println("Adding our secret ingredient...");
    }
}
enum CoffeeType {
    ESPRESSO,
    AMERICANO,
    CAFFE_LATTE,
    CAPPUCCINO
}
class SimpleCoffeeFactory {
    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case AMERICANO:
                coffee = new Americano();
                break;
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case CAPPUCCINO:
                coffee = new Cappuccino();
                break;
            case CAFFE_LATTE:
                coffee = new CaffeLatte();
                break;
        }
        return coffee;
    }
}
abstract class CoffeeShop {
    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = createCoffee(type);
        coffee.makeCoffee();
        coffee.pourIntoCup();
        coffee.addSomeSpecial();
        System.out.println("Here you go, see ya!");
        return coffee;
    }
    protected abstract Coffee createCoffee(CoffeeType type);
}

class ItalianCoffeeShop extends CoffeeShop {
    @Override
    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;
        switch (type) {
            case AMERICANO:
                coffee = new ItalianStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new ItalianStyleEspresso();
                break;
            case CAPPUCCINO:
                coffee = new ItalianStyleCappuccino();
                break;
            case CAFFE_LATTE:
                coffee = new ItalianStyleCaffeLatte();
                break;
        }
        return coffee;
    }
}
class AmericanCoffeeShop extends CoffeeShop {
    @Override
    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case AMERICANO:
                coffee = new AmericanStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new AmericanStyleEspresso();
                break;
            case CAPPUCCINO:
                coffee = new AmericanStyleCappuccino();
                break;
            case CAFFE_LATTE:
                coffee = new AmericanStyleCaffeLatte();
                break;
        }
        return coffee;
    }
}
class UkrainianCoffeeShop extends CoffeeShop {
    @Override
    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case AMERICANO:
                coffee = new UkrainianStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new UkrainianStyleEspresso();
                break;
            case CAPPUCCINO:
                coffee = new UkrainianStyleCappuccino();
                break;
            case CAFFE_LATTE:
                coffee = new UkrainianStyleCaffeLatte();
                break;
        }
        return coffee;
    }
}
public class MyCoffeeShop {
    public static void main(String[] args) {
        System.out.println("Welcome to the CoffeeShop!");
        CoffeeShop ukrainianCoffeeShop = new UkrainianCoffeeShop();
        CoffeeShop americanCoffeeShop = new AmericanCoffeeShop();
        ukrainianCoffeeShop.orderCoffee(CoffeeType.AMERICANO);
        americanCoffeeShop.orderCoffee(CoffeeType.AMERICANO);
        ukrainianCoffeeShop.orderCoffee(CoffeeType.CAPPUCCINO);
    }
}