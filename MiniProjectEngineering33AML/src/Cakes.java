import java.util.ArrayList;
import java.util.*;

public class Cakes {

    //seting the cakes via a UML/descriptive  createing a private DataTypes
    private String Name;
    private String Flavour;
    private double SugarContent;
    private String Origin;
    private double Price;

    public Cakes(String name, String flavour,
                 double sugarcontent, String origin,
                 double price)
    {
        this.Name = name;
        this.Flavour = flavour;
        this.SugarContent = sugarcontent;
        this.Origin = origin;
        this.Price = price;
    }

    //
    public String getName() {
        return this.Name;
    }

    public String getName(String newName) {
        return (this.Name = newName);
    }

    public String getFlavour() {
        return this.Flavour;
    }

    public String getFlavour(String newFlavour) {
        return (this.Flavour = newFlavour);
    }

    public double getSugarContent() {
        return this.SugarContent;
    }

    public double setSugarContent(double newSugarContent) {
        return (this.SugarContent = newSugarContent);
    }

    public String getOrigin() {
        return this.Origin;
    }

    public String getOrigin(String newOrigin) {
        return (this.Origin = newOrigin);
    }

    public double getPrice() {
        return this.Price;
    }

    public double setPrice(double newPrice) {
        return (this.Price = newPrice);
    }


    public String toString() {
        return String.format("\t\t\t\t\t", this.Name, this.Flavour,
                this.SugarContent, this.Origin, this.Price);
    }
}
