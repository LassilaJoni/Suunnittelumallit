public class CPU {
    void freeze() {
        System.out.println("CPU freeze");
    }

    void jump(long position) {
        System.out.println("CPU jump to position: " + position);
    }

    void execute() {
        System.out.println("CPU execute");
    }
}
