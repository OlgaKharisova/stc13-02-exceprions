package ru.innopolis.stc13.tryWithResources;

public class Main {
    public static void main(String[] args) {
        try (OpenDoor door = new OpenDoor()) {
            door.swing();
        } catch (Exception e) {
            System.out.println("Is there a draft " + e.getClass());
        } finally {
            System.out.println("Ok' I have to put on a sweater");
        }
    }
}
