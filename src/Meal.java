

public class Meal {
    public Meal(int mealNum) {
        this.mealNum = mealNum;
    }

    int mealNum;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Meal meal = (Meal) o;

        if (mealNum != meal.mealNum) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return mealNum;
    }
}
