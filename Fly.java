public interface Fly {
    /**
     * takeOff
     */
    void takeOff();

    /**
     * ascend
     */
    int ascend(int meters);

    /**
     * descend
     */
    int descend(int meters);

    /**
     * land
     */
    void land();

    default void glide() {
        System.out.println("glides into the air");
    }
}
