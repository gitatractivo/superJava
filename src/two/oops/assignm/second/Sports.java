package two.oops.assignm.second;

import two.oops.assignm.first.Info;
import two.oops.assignm.first.Student;

public class Sports extends Student implements Info {
    private float height, weight;
    private String game;

    public Sports(String name, String fatherName, String city, int roll, int mNo, float height, float weight, String game) {
        super(name, fatherName, city, roll, mNo);
        this.height = height;
        this.weight = weight;
        this.game = game;
    }
    @Override
    public void show() {

        System.out.println("Institute:"+collegeName);

        System.out.println("height:"+height);
        System.out.println("weight:"+weight);
        System.out.println("game:"+game);



    }
    @Override
    public void calculate_performance() {
        System.out.println("Performance:"+(height)/weight*100);
    }
}
