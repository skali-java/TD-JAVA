public class opt {
    public static void main(String[] args) {

        // Physics
        double[] physicsGrades = {12, 11, 8, 2, 7};

        double physicsGradesSum = 0;
        for (double grade : physicsGrades) {
            physicsGradesSum += grade;
        }

        double physicsGradesAverage = physicsGradesSum / physicsGrades.length;
        System.out.printf("Physics grade sum : %.2f\n", physicsGradesSum);
        System.out.printf("Physics grade Average : %.2f\n", physicsGradesAverage);


        // Geometry
        double[] geometryGrades = {15, 13.5, 19, 11, 13};

        double geometryGradesSum = 0;
        for (double grade : geometryGrades) {
            geometryGradesSum += grade;
        }
        double geometryGradesAverage = geometryGradesSum / geometryGrades.length;
        System.out.printf("Geometry grade sum : %.2f\n", geometryGradesSum);
        System.out.printf("Geometry grade Average : %.2f\n", geometryGradesAverage);

        // History
        double[] historyGrades = {19, 12.3, 13, 2, 17};
        double historyGradesSum = 0;
        for (double grade : historyGrades) {
            historyGradesSum += grade;
        }
        double historyGradesAverage = historyGradesSum / historyGrades.length;
        System.out.printf("History grade sum : %.2f\n", historyGradesSum);
        System.out.printf("History grade Average : %.2f\n", historyGradesAverage);

    }
}