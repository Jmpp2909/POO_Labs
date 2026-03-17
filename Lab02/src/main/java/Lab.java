import java.util.ArrayList;
import java.util.List;

public class Lab {
    String name;
    List<Computer> computerList;

    public Lab(String name) {
        this.name = name;
        computerList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Computer> getComputers() {
        return List.copyOf(computerList);
    }

    public boolean addComputer(Computer c){
        if(computerList.contains(c))
            return false;
        computerList.add(c);
        return true;
    }

    public Computer removeComputer(String id) {
        for (Computer computer : computerList){
            if  (computer.getId().equals(id)){
                computerList.remove(computer);
                return computer;
            }
        }
        return null;
    }

    public Computer findComputerById(String id) {
        for (Computer computer : computerList){
            if  (computer.getId().equals(id)){
                return computer;
            }
        }
        return null;
    }

    public String toString(){
        StringBuilder string = new StringBuilder();
        string.append("This Laboratory is called ").append(name).append(" and has the following computers:\n");
        for (Computer computer : computerList) {
            string.append(computer.toString()).append("\n");
        }
        return string.toString();
    }
}
