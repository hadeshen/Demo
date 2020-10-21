package week3.day2;

/**
 * @author：陈林
 * @date：2020/8/18 8:59
 * 员工类
 */
public class Emloyee {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Emloyee(){

    }
    public void work(){
        System.out.println("员工号为"+id+"的"+name+"员工");
    }
    public Emloyee(int id,String name){
        this.id=id;
        this.name=name;
    }
}
