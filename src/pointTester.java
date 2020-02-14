class PointTester {
    //(3, 4) and (–3, –4)
    double point1X1 = 3;
    double point1Y1 = 4;
    double point2X2 = -3;
    double point2Y2 = -4;
    double distance;
    double x;
    double y;

/** Constructor */
  PointTester() {
       this.point1X1 = 3;
      this.point1Y1 = 4;
       this.point2X2 = -3;
      this. point2Y2 = -4;
      this. distance = 0 ;
      this. x =0;
      this. y =0;

  }

    double distance() {
        x = Math.pow((point2X2 - point1X1), 2);
        y = Math.pow((point2Y2 - point1Y1), 2);
        distance = x+y;
        distance = Math.sqrt(distance);
        return distance;
    }
}