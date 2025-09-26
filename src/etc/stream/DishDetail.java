package etc.stream;

public class DishDetail {
    private final String name;
    private final String type;

    public DishDetail(Dish dish) {
        this.name = dish.getName();
        this.type = dish.getType().getDesc();
    }

    @Override
    public String toString() {
        return "DishDetail{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
