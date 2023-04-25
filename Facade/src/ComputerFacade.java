public class ComputerFacade {

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    private static final long kBootAddress = 01;
    private static final long kBootSector = 10;
    private static final int kSectorSize = 128;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        memory.load(kBootAddress, hardDrive.read(kBootSector, kSectorSize));
        cpu.jump(kBootAddress);
        cpu.execute();
    }
}
