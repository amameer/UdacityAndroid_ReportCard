/**
 * Created by amna on 4/1/2017 AD.
 */

public class ReportCard {


    private String mSubject;
    private Integer mGrade;
    private String mGradeInLetter;

    public ReportCard(String subject, Integer grade)
    {
        mSubject=subject;
        mGrade=grade;
        mGradeInLetter=DeterminGradeInletter();
    }

    public void SetSubject(String subject) {
        mSubject=subject;
    }
    public void SetGrade(Integer grade) {
        mGrade=grade;
    }
    public String GetSubject() {
        return mSubject;
    }
    public Integer GetGrade() {
        return mGrade;
    }
    public String DeterminGradeInletter() {

        if (mGrade>=95)
            mGradeInLetter="A+";
        else if (mGrade>=90)
            mGradeInLetter="A+";
        else if (mGrade>=85)
            mGradeInLetter="B+";
        else if (mGrade>=80)
            mGradeInLetter="B";
        else if (mGrade>=75)
            mGradeInLetter="C+";
        else if (mGrade>=70)
            mGradeInLetter="C";
        else if (mGrade>=65)
            mGradeInLetter="D+";
        else if (mGrade>=60)
            mGradeInLetter="D";
        else
            mGradeInLetter="F";
        return mGradeInLetter;
    }

    @Override
    public String toString() {
        return "Report Card details:{" +
                "Subject='" + mSubject + '\'' +
                ", Grade='" + mGrade + '\'' +
                ", (" + mGradeInLetter +  ")"+
                '}';
    }
}


