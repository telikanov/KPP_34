package kpp_3_4;

/**
 *
 * @author telikanov
 */
public class Athlete {

    String FIO;
    String Rank;
    String CountCompetition;
    String Heft;
    String NumberPoint;
    int Day;
    int Month;
    int Year;

    public String getFIO() {
        return FIO;
    }

    public String getRank() {
        return Rank;
    }

    public String getHeft() {
        return Heft;
    }

    public String getCountCompetition() {
        return CountCompetition;
    }

    public String getNumberPoint() {
        return NumberPoint;
    }

    public int getDay() {
        return Day;
    }

    public int getMonth() {
        return Month;
    }

    public int getYear() {
        return Year;
    }

    public void setFIO(String s) {
        this.FIO = s;
    }

    public void setRank(String s) {
        this.Rank = s;
    }

    public void setHeft(String s) {
        this.Heft = s;
    }

    public void setCountCompetition(String s) {
        this.CountCompetition = s;
    }

    public void setNumberPoint(String s) {
        this.NumberPoint = s;
    }

    public void setDay(int s) {
        this.Day = s;
    }

    public void setMonth(int s) {
        this.Month = s;
    }

    public void setYear(int s) {
        this.Year = s;
    }

    @Override
    public String toString() {
        return String.format("[Athlete: FIO='%s', Rank=%s, Heft=%s, CountCompetition=%s, NumberPoint=%s, Day=%d, Month=%d, Year=%d]", FIO, Rank, Heft, CountCompetition, NumberPoint, Day, Month, Year);
    }
}
