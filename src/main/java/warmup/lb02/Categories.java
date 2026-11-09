package warmup.lb02;

public class Categories {
    public static String categoryOf(String shop) {
        shop = shop.toLowerCase();
        String category = switch (shop){
            case "biedronka", "lidl", "żabka" -> "JEDZENIE";
            case "orlen", "pkp", "jakdojade" -> "TRANSPORT";
            case "netflix", "spotify"-> "ROZRYWKA";
            default  -> "INNE";
        };
        return category;
    }
}
