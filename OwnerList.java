class OwnerList
{
 public static String fetchOwner(String companyName){
 if (companyName == "Tesla") { return "Elon Musk"; }
        else if (companyName == "Microsoft") { return "Bill Gates"; }
        else if (companyName == "Amazon") { return "Jeff Bezos"; }
        else if (companyName == "Google") { return "Sundar Pichai"; }
        else if (companyName == "Facebook") { return "Mark Zuckerberg"; }
        else if (companyName == "Apple") { return "Tim Cook"; }
        else if (companyName == "SpaceX") { return "Elon Musk"; }
        else if (companyName == "Netflix") { return "Reed Hastings"; }
        else if (companyName == "Reliance") { return "Mukesh Ambani"; }
        else if (companyName == "Tata") { return "Ratan Tata"; }
        else if (companyName == "Walmart") { return "Sam Walton"; }
        else if (companyName == "Infosys") { return "Narayan Murthy"; }
        else return "Owner not found";
    }

}