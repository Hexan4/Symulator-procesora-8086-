public class Main {
    public static void main(String[] args) {
        CPU8086 cpu = new CPU8086();

        cpu.setAX(10);
        cpu.setBX(20);
        cpu.setCX(30);
        cpu.setDX(1);

        cpu.addAX(6);
        cpu.subAX(5);

        cpu.addBX(2);
        cpu.subBX(8);

        cpu.addCX(2);
        cpu.subCX(3);

        cpu.addDX(6);
        cpu.subDX(0);

        System.out.println("AX: " + cpu.getAX());
        System.out.println("BX: " + cpu.getBX());
        System.out.println("CX: " + cpu.getCX());
        System.out.println("DX: " + cpu.getDX());
    }
}