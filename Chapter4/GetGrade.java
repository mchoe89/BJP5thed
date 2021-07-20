// Write a method called getGrade that accepts an integer representing a student’s grade in a course and returns
// that student’s numerical course grade. The grade can be between 0.0 (failing) and 4.0 (perfect). Assume that scores
// are in the range of 0 to 100 and that grades are based on the following scale: For an added challenge, make your
// method throw an IllegalArgumentException if the user passes a grade lower than 0 or higher than 100 .

public class GetGrade {
    public static void main(String[] args) {

    }

    public static double getGrade(int score) {
        double grade = 0.0;
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Not Allowed");
        } else if (score < 60) {
            return 0.0;
        } else if (score >= 60 && score <= 62) {
            return 0.7;
        } else if (score > 62 && score < 95) {
            return 0.8 + (score - 63) * 0.1;
        } else {
            return 4.0;
        }
    }
}
