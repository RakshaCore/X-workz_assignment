
class ExistenceStatus {
    public static boolean isAliveOrNot(String name) {
        if (name == "Albert Einstein") { return false; }
        else if (name == "CR7") { return true; }
        else if (name == "Elon Musk") { return true; }
        else if (name == "Steve Jobs") { return false; }
        else if (name == "APJ Abdul Kalam") { return false; }
        else if (name == "Narendra Modi") { return true; }
        else if (name == "Virat Kholi") { return true; }
        else if (name == "Messi") { return true; }
        else if (name == "MK Gandhi") { return false; }
        else return false;
    }
}