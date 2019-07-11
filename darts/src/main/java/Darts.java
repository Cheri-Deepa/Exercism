class Darts {

    private Double radius;
    private int points;
    Darts(double x, double y) {

      radius = Math.sqrt((x*x+y*y));

    }

    int score() {
        if(radius>10)
            points =0;
        else if(radius>5)
            points = 1;
        else if(radius>1)
            points = 5;
        else if(radius>0)
            points = 10;

        return points;

    }

}
