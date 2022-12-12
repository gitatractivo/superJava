package two.oops;

public class Distance {
    private int feet, inch;

    public Distance(){

    }

    public Distance(int feet, int inch) {
        this.feet = feet;
        this.inch = inch;
    }

    public static Distance add(Distance a, Distance b){
        Distance ans = new Distance(a.feet+b.feet,a.inch+b.inch);
        if(ans.inch>=12){
            ans.feet++;
            ans.inch%=12;
        }
        return ans;
    }

    @Override
    public String toString() {
        return feet + " feet " + inch + " inches " ;
    }
}
