
package Model;

public class Country implements Comparable<Country>{
    private String code, name, terrain;
    private int area;

    public Country(String code, String name, int area, String terrain) {
        this.code = code;
        this.name = name;
        this.area = area;
        this.terrain = terrain;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public float getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return String.format("%-10s%-15s%-15s%-10s", code, name, terrain, area);
    }

    @Override
    public int compareTo(Country o) {
        return this.name.compareTo(o.name);
    }
}