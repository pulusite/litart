package tba.mianshi.book;

/**
 * Created by zhangdong on 2018/12/8.
 */
public class HanoiTower {
    public void hanoi(int n,char origin, char assist, char destination){
        if (n==1){
            move(origin,destination);
        }else {
            hanoi(n-1,origin,destination,assist);
            move(origin,destination);
            hanoi(n-1,assist,origin,destination);
        }
    }

    private void move(char origin, char destination){
        System.out.println("Direction:"+origin+"----->"+destination);
    }

    public static void main(String[] args) {
        HanoiTower hanoiTower=new HanoiTower();
        hanoiTower.hanoi(3,'A','B','c');
    }
}
