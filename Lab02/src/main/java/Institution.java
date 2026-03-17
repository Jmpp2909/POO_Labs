import java.util.ArrayList;
import java.util.List;

public class Institution {
    String name;

    List<Lab> laboratoryList;

    public Institution(String name) {
        this.name = name;
        this.laboratoryList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Lab> getLabs() {
        return List.copyOf(laboratoryList);
    }

    public boolean addLab(Lab lab){
        if(laboratoryList.contains(lab))
            return false;
        laboratoryList.add(lab);
        return true;
    }

    public String toString(){
        StringBuilder string = new StringBuilder();
        string.append("This institution is called ").append(name).append(" and has the following laboratories:\n");
        for (Lab lab : laboratoryList) {
            string.append(lab.getName()).append("\n");
        }
        return string.toString();
    }


}
