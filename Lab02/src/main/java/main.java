public class main {
    public static void main(String[] args) {
        System.out.println("INSTITUTION / LABORATORIES\n");
        Institution ips = new Institution("IPS");
        Lab LabRedes = new Lab("LabRedes");
        Lab LabProgramacao1 = new Lab("LabProgramacao1");
        Lab LabProgramacao2 = new Lab("LabProgramacao2");

        if(ips.addLab(LabRedes)) {
            System.out.println("LabRedes added sucessfully");
        } else System.out.println("LabRedes already exists");
        if(ips.addLab(LabProgramacao1)){
            System.out.println("LabProgramacao1 added sucessfully");
        } else System.out.println("LabProgramacao1 already exists");
        if(ips.addLab(LabProgramacao2)){
            System.out.println("LabProgramacao2 added sucessfully");
        } else System.out.println("LabProgramacao2 already exists");

        if(ips.addLab(LabProgramacao2)){
            System.out.println("LabProgramacao2 added sucessfully");
        } else System.out.println("LabProgramacao2 already exists");
        System.out.println(ips.toString());

        System.out.println("COMPUTERS\n");
        Computer PC1 = new Computer("PC1", "Dell");
        Computer PC2 = new Computer("PC2", "HP");

        LabProgramacao1.addComputer(PC1);
        LabProgramacao1.addComputer(PC2);
        System.out.println("Getting PC2 by id:" + LabProgramacao1.findComputerById("PC2"));
        System.out.println("removeComputer(PC1) " + LabProgramacao1.removeComputer("PC1"));
        System.out.println("getComputers() " + LabProgramacao1.getComputers());
        System.out.println("Laboratory/Computers ToString() " + LabProgramacao1.toString());


    }
}
