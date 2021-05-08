package sg.edu.np.practical2;

public class User {
    private static String name;
    private static String description;
    private static int id;
    private static boolean followed;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        User.name = name;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        User.description = description;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        User.id = id;
    }

    public static boolean isFollowed() {
        return followed;
    }

    public static void setFollowed(boolean followed) {
        User.followed = followed;
    }

    public User(String name, String description, Integer id, Boolean followed) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.followed = followed;
    }
}
