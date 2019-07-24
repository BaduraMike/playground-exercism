class Darts {
    private double x;
    private double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public int score() {
        int score;

        if (withinRadius(1)) {
            score = 10;
        } else if (withinRadius(5)) {
            score = 5;
        } else if (withinRadius(10)) {
            score = 1;
        } else
            score = 0;

        return score;
    }

    private boolean withinRadius(int radius) {
        return (radius * radius >= (x * x) + (y * y));
    }
}
