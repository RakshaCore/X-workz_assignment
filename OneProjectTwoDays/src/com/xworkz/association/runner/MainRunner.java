package com.xworkz.association.runner;

import com.xworkz.association.dto.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MainRunner {
    public static void main(String[] args) {
        System.out.println("MainRunner is running");
        ChancellorDTO chancellor1 = new ChancellorDTO("Dr. Asha Menon", 60, "Ph.D. in Educational Leadership", "asha.menon@university.edu");
        ChancellorDTO chancellor2 = new ChancellorDTO("Dr. Rajiv Bansal", 58, "Ph.D. in Physics", "rajiv.bansal@university.edu");
        ChancellorDTO chancellor3 = new ChancellorDTO("Dr. Meera Patel", 62, "Ph.D. in Literature", "meera.patel@university.edu");
        ChancellorDTO chancellor4 = new ChancellorDTO("Dr. Suresh Nair", 59, "Ph.D. in Computer Science", "suresh.nair@university.edu");
        ChancellorDTO chancellor5 = new ChancellorDTO("Dr. Kavitha Reddy", 55, "Ph.D. in Chemistry", "kavitha.reddy@university.edu");
        ChancellorDTO chancellor6 = new ChancellorDTO("Dr. Anil Verma", 61, "Ph.D. in Economics", "anil.verma@university.edu");
        ChancellorDTO chancellor7 = new ChancellorDTO("Dr. Rekha Sharma", 57, "Ph.D. in Sociology", "rekha.sharma@university.edu");
        ChancellorDTO chancellor8 = new ChancellorDTO("Dr. Naveen Joshi", 63, "Ph.D. in Mathematics", "naveen.joshi@university.edu");
        ChancellorDTO chancellor9 = new ChancellorDTO("Dr. Nandini Rao", 60, "Ph.D. in Psychology", "nandini.rao@university.edu");
        ChancellorDTO chancellor10 = new ChancellorDTO("Dr. Vijay Kumar", 56, "Ph.D. in Political Science", "vijay.kumar@university.edu");

        UniversityDTO university1 = new UniversityDTO("Oxford International University", "London", "Public", 1900, chancellor1);
        UniversityDTO university2 = new UniversityDTO("Indian Institute of Technology", "Mumbai", "Autonomous", 1958, chancellor2);
        UniversityDTO university3 = new UniversityDTO("St. Xavier's University", "Kolkata", "Private", 1960, chancellor3);
        UniversityDTO university4 = new UniversityDTO("National Institute of Technology", "Trichy", "Government", 1964, chancellor4);
        UniversityDTO university5 = new UniversityDTO("Jawaharlal Nehru University", "New Delhi", "Central", 1969, chancellor5);
        UniversityDTO university6 = new UniversityDTO("University of Mysore", "Mysore", "State", 1916, chancellor6);
        UniversityDTO university7 = new UniversityDTO("Christ University", "Bangalore", "Private", 1969, chancellor7);
        UniversityDTO university8 = new UniversityDTO("Banaras Hindu University", "Varanasi", "Public", 1916, chancellor8);
        UniversityDTO university9 = new UniversityDTO("Savitribai Phule Pune University", "Pune", "State", 1949, chancellor9);
        UniversityDTO university10 = new UniversityDTO("Delhi University", "Delhi", "Public", 1922, chancellor10);

        EducationDTO education1 = new EducationDTO("B.Tech in Computer Science", 4, 86.5, "Oxford International University", university1);
        EducationDTO education2 = new EducationDTO("M.Tech in Electrical Engineering", 2, 91.0, "Indian Institute of Technology", university2);
        EducationDTO education3 = new EducationDTO("BA in English Literature", 3, 78.2, "St. Xavier's University", university3);
        EducationDTO education4 = new EducationDTO("B.Sc in Mathematics", 3, 88.6, "National Institute of Technology", university4);
        EducationDTO education5 = new EducationDTO("MA in Political Science", 2, 84.7, "Jawaharlal Nehru University", university5);
        EducationDTO education6 = new EducationDTO("B.Com", 3, 79.5, "University of Mysore", university6);
        EducationDTO education7 = new EducationDTO("BBA", 3, 82.9, "Christ University", university7);
        EducationDTO education8 = new EducationDTO("M.Sc in Physics", 2, 90.3, "Banaras Hindu University", university8);
        EducationDTO education9 = new EducationDTO("B.Sc in Psychology", 3, 85.4, "Savitribai Phule Pune University", university9);
        EducationDTO education10 = new EducationDTO("LLB", 3, 76.8, "Delhi University", university10);

        DetailDTO detail1 = new DetailDTO("Arjun Reddy", "arjun.reddy@example.com", "9876543210", "Hyderabad, Telangana", education1);
        DetailDTO detail2 = new DetailDTO("Sneha Sharma", "sneha.sharma@example.com", "9876543211", "Mumbai, Maharashtra", education2);
        DetailDTO detail3 = new DetailDTO("Ravi Deshmukh", "ravi.deshmukh@example.com", "9876543212", "Pune, Maharashtra", education3);
        DetailDTO detail4 = new DetailDTO("Divya Iyer", "divya.iyer@example.com", "9876543213", "Chennai, Tamil Nadu", education4);
        DetailDTO detail5 = new DetailDTO("Karthik Rao", "karthik.rao@example.com", "9876543214", "Bangalore, Karnataka", education5);
        DetailDTO detail6 = new DetailDTO("Pooja Nair", "pooja.nair@example.com", "9876543215", "Kochi, Kerala", education6);
        DetailDTO detail7 = new DetailDTO("Manoj Patil", "manoj.patil@example.com", "9876543216", "Nagpur, Maharashtra", education7);
        DetailDTO detail8 = new DetailDTO("Anita Verma", "anita.verma@example.com", "9876543217", "Lucknow, Uttar Pradesh", education8);
        DetailDTO detail9 = new DetailDTO("Rakesh Mehta", "rakesh.mehta@example.com", "9876543218", "Ahmedabad, Gujarat", education9);
        DetailDTO detail10 = new DetailDTO("Neha Kulkarni", "neha.kulkarni@example.com", "9876543219", "Delhi, NCR", education10);

        StaffDTO staff1 = new StaffDTO("Raghav Kumar", "₹70,000", "Assistant Professor", "Computer Science", detail1);
        StaffDTO staff2 = new StaffDTO("Meera Shah", "₹65,000", "Senior Lecturer", "Electrical", detail2);
        StaffDTO staff3 = new StaffDTO("Vikram Joshi", "₹60,000", "Lecturer", "English", detail3);
        StaffDTO staff4 = new StaffDTO("Sonal Jain", "₹72,000", "Assistant Professor", "Mathematics", detail4);
        StaffDTO staff5 = new StaffDTO("Abhay Reddy", "₹68,000", "Lecturer", "Political Science", detail5);
        StaffDTO staff6 = new StaffDTO("Lata Iyer", "₹64,000", "Professor", "Commerce", detail6);
        StaffDTO staff7 = new StaffDTO("Nitin Shetty", "₹66,000", "Senior Lecturer", "Management", detail7);
        StaffDTO staff8 = new StaffDTO("Priya Das", "₹71,000", "Associate Professor", "Physics", detail8);
        StaffDTO staff9 = new StaffDTO("Amit Verma", "₹67,000", "Lecturer", "Psychology", detail9);
        StaffDTO staff10 = new StaffDTO("Divya Singh", "₹73,000", "Professor", "Law", detail10);

        List<StaffDTO> csStaff = Arrays.asList(staff1, staff2);
        List<StaffDTO> engStaff = Arrays.asList(staff3, staff4);
        List<StaffDTO> polSciStaff = Arrays.asList(staff5, staff6);
        List<StaffDTO> physicsStaff = Arrays.asList(staff7, staff8);
        List<StaffDTO> lawStaff = Arrays.asList(staff9, staff10);

        HODDTO hod1 = new HODDTO("Dr. Ramesh Menon", 15, "Computer Science", "ramesh.menon@university.edu", csStaff);
        HODDTO hod2 = new HODDTO("Prof. Anita Rao", 18, "English", "anita.rao@university.edu", engStaff);
        HODDTO hod3 = new HODDTO("Dr. Tarun Gupta", 12, "Political Science", "tarun.gupta@university.edu", polSciStaff);
        HODDTO hod4 = new HODDTO("Prof. Seema Das", 20, "Physics", "seema.das@university.edu", physicsStaff);
        HODDTO hod5 = new HODDTO("Dr. Vikram Sinha", 17, "Law", "vikram.sinha@university.edu", lawStaff);
        HODDTO hod6 = new HODDTO("Dr. Manohar Shetty", 14, "Mathematics", "manohar.shetty@univ.edu", csStaff);
        HODDTO hod7 = new HODDTO("Dr. Neelima Kapoor", 11, "Psychology", "neelima.kapoor@univ.edu", engStaff);
        HODDTO hod8 = new HODDTO("Dr. Rajeev Menon", 16, "Biotechnology", "rajeev.menon@univ.edu", physicsStaff);
        HODDTO hod9 = new HODDTO("Dr. Sujata Verma", 12, "Economics", "sujata.verma@univ.edu", polSciStaff);
        HODDTO hod10 = new HODDTO("Dr. Farzana Noor", 15, "History", "farzana.noor@univ.edu", lawStaff);

        DepartmentDTO dept1 = new DepartmentDTO("Computer Science", 25, 300, "Focuses on software, AI, and systems", hod1);
        DepartmentDTO dept2 = new DepartmentDTO("Mechanical Engineering", 22, 280, "Covers thermodynamics and robotics", hod2);
        DepartmentDTO dept3 = new DepartmentDTO("Electrical Engineering", 18, 250, "Specializes in circuits and power systems", hod3);
        DepartmentDTO dept4 = new DepartmentDTO("Civil Engineering", 20, 220, "Emphasis on infrastructure and design", hod4);
        DepartmentDTO dept5 = new DepartmentDTO("Information Technology", 21, 310, "Deals with networks and security", hod5);
        DepartmentDTO dept6 = new DepartmentDTO("Mathematics", 15, 200, "Theoretical and applied math", hod6);
        DepartmentDTO dept7 = new DepartmentDTO("Psychology", 12, 180, "Studies mental processes and behavior", hod7);
        DepartmentDTO dept8 = new DepartmentDTO("Biotechnology", 17, 190, "Focus on genetic and cellular engineering", hod8);
        DepartmentDTO dept9 = new DepartmentDTO("Economics", 13, 210, "Economic theory, finance and policy", hod9);
        DepartmentDTO dept10 = new DepartmentDTO("History", 11, 170, "Ancient to modern historical studies", hod10);

        PortfolioDTO portfolio1 = new PortfolioDTO("IT and Innovation", "it.min@india.gov", "9876543210", "Digital tech, Policy", dept1);
        PortfolioDTO portfolio2 = new PortfolioDTO("Infrastructure", "infra.min@india.gov", "9876543211", "Construction, Roads", dept2);
        PortfolioDTO portfolio3 = new PortfolioDTO("Energy", "energy.min@india.gov", "9876543212", "Renewables, Electricity", dept3);
        PortfolioDTO portfolio4 = new PortfolioDTO("Urban Development", "urban.min@india.gov", "9876543213", "Housing, Cities", dept4);
        PortfolioDTO portfolio5 = new PortfolioDTO("Cybersecurity", "cyber.min@india.gov", "9876543214", "Network Security, Law", dept5);
        PortfolioDTO portfolio6 = new PortfolioDTO("Education", "edu.min@india.gov", "9876543215", "Higher Ed, Curriculum", dept6);
        PortfolioDTO portfolio7 = new PortfolioDTO("Health & Wellness", "health.min@india.gov", "9876543216", "Mental health, Psychology", dept7);
        PortfolioDTO portfolio8 = new PortfolioDTO("Science & Biotech", "sci.min@india.gov", "9876543217", "Bio research, Tech", dept8);
        PortfolioDTO portfolio9 = new PortfolioDTO("Finance", "finance.min@india.gov", "9876543218", "Economic Policy, Tax", dept9);
        PortfolioDTO portfolio10 = new PortfolioDTO("Culture & Heritage", "culture.min@india.gov", "9876543219", "Museums, History", dept10);

        MinisterDTO minister1 = new MinisterDTO("Arjun Mehta", "Janata Party", "Karnataka", "Minister of IT", Arrays.asList(portfolio1, portfolio5));
        MinisterDTO minister2 = new MinisterDTO("Rekha Nair", "People's Front", "Tamil Nadu", "Minister of Infrastructure", Arrays.asList(portfolio2, portfolio4));
        MinisterDTO minister3 = new MinisterDTO("Ramesh Rao", "National Alliance", "Maharashtra", "Minister of Energy", Arrays.asList(portfolio3));
        MinisterDTO minister4 = new MinisterDTO("Sneha Iyer", "Green India", "Kerala", "Minister of Urban Affairs", Arrays.asList(portfolio4, portfolio6));
        MinisterDTO minister5 = new MinisterDTO("Vikram Desai", "Progressive Bloc", "Delhi", "Minister of Cybersecurity", Arrays.asList(portfolio5));
        MinisterDTO minister6 = new MinisterDTO("Anjali Singh", "Democratic Unity", "Uttar Pradesh", "Minister of Education", Arrays.asList(portfolio6, portfolio7));
        MinisterDTO minister7 = new MinisterDTO("Karan Thakur", "Janata Party", "Punjab", "Minister of Health", Arrays.asList(portfolio7));
        MinisterDTO minister8 = new MinisterDTO("Meera Kulkarni", "Forward Movement", "Madhya Pradesh", "Minister of Science & Biotech", Arrays.asList(portfolio8));
        MinisterDTO minister9 = new MinisterDTO("Abhay Joshi", "People's Voice", "Rajasthan", "Finance Minister", Arrays.asList(portfolio9));
        MinisterDTO minister10 = new MinisterDTO("Divya Sharma", "Cultural League", "West Bengal", "Minister of Culture", Arrays.asList(portfolio10));

        StateDTO state1 = new StateDTO("Karnataka", "Siddaramaiah", "Thawar Chand Gehlot", "191,791 km²", Arrays.asList(minister1, minister2));
        StateDTO state2 = new StateDTO("Tamil Nadu", "M. K. Stalin", "R. N. Ravi", "130,058 km²", Arrays.asList(minister3));
        StateDTO state3 = new StateDTO("Maharashtra", "Eknath Shinde", "Ramesh Bais", "307,713 km²", Arrays.asList(minister4));
        StateDTO state4 = new StateDTO("Kerala", "Pinarayi Vijayan", "Arif Mohammad Khan", "38,863 km²", Arrays.asList(minister5));
        StateDTO state5 = new StateDTO("Delhi", "Arvind Kejriwal", "Vinai Kumar Saxena", "1,484 km²", Arrays.asList(minister6));
        StateDTO state6 = new StateDTO("Uttar Pradesh", "Yogi Adityanath", "Anandiben Patel", "243,286 km²", Arrays.asList(minister7));
        StateDTO state7 = new StateDTO("Punjab", "Bhagwant Mann", "Banwarilal Purohit", "50,362 km²", Arrays.asList(minister8));
        StateDTO state8 = new StateDTO("Madhya Pradesh", "Mohan Yadav", "Mangubhai C. Patel", "308,252 km²", Arrays.asList(minister9));
        StateDTO state9 = new StateDTO("Rajasthan", "Bhajan Lal Sharma", "Kalraj Mishra", "342,239 km²", Arrays.asList(minister10));
        StateDTO state10 = new StateDTO("West Bengal", "Mamata Banerjee", "C. V. Ananda Bose", "88,752 km²", Arrays.asList(minister1, minister4));

        List<StateDTO> stateList1 = Arrays.asList(state1, state2);
        List<StateDTO> stateList2 = Arrays.asList(state3, state4);
        List<StateDTO> stateList3 = Arrays.asList(state5, state6);
        List<StateDTO> stateList4 = Arrays.asList(state7, state8);
        List<StateDTO> stateList5 = Arrays.asList(state9, state10);

        CountryDTO country1 = new CountryDTO("Indoria", "New Delhiya", "President Aarya", "1350000000", stateList1);
        CountryDTO country2 = new CountryDTO("Aurathea", "Luminara", "President Elen", "980000000", stateList2);
        CountryDTO country3 = new CountryDTO("Nordovia", "Frosgard", "President Ivan", "670000000", stateList3);
        CountryDTO country4 = new CountryDTO("Zyron", "Velmora", "President Kael", "430000000", stateList4);
        CountryDTO country5 = new CountryDTO("Terranova", "Altaris", "President Selena", "1250000000", stateList5);
        CountryDTO country6 = new CountryDTO("Elvaria", "Mooncrest", "President Lyra", "560000000", stateList1);
        CountryDTO country7 = new CountryDTO("Voltara", "Electra", "President Ryon", "720000000", stateList2);
        CountryDTO country8 = new CountryDTO("Mystral", "Zephyria", "President Neris", "310000000", stateList3);
        CountryDTO country9 = new CountryDTO("Solarnia", "Ignisia", "President Varek", "850000000", stateList4);
        CountryDTO country10 = new CountryDTO("Caeloria", "Skyhelm", "President Thalia", "390000000", stateList5);

        Collection<CountryDTO>collection=new ArrayList<>(Arrays.asList(
                country1, country2, country3, country4, country5,
                country6, country7, country8, country9, country10
        ));

        collection.forEach(e-> System.out.println(e));

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Get all list of Chancellor");
        List<ChancellorDTO> chancellorDTOS = collection.stream()
                .flatMap(country -> country.getStateDTOS().stream())
                .flatMap(state -> state.getMinisterDTOS().stream())
                .flatMap(minister -> minister.getPortfolios().stream())
                .map(PortfolioDTO::getDepartmentDTO)
                .map(DepartmentDTO::getHodDTO)
                .flatMap(hod -> hod.getStaffDTOs().stream())
                .map(StaffDTO::getDetailDTO)
                .map(DetailDTO::getEducationDTO)
                .map(EducationDTO::getUniversityDTO)
                .map(UniversityDTO::getChancellorDTO)
                .collect(Collectors.toList());
        chancellorDTOS.forEach(System.out::println);

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Get all portfolio as a single list");
        List<String> portfolioNames = collection.stream()
                .flatMap(country -> country.getStateDTOS().stream())
                .flatMap(state -> state.getMinisterDTOS().stream())
                .flatMap(minister -> minister.getPortfolios().stream())
                .map(PortfolioDTO::getName)
                .collect(Collectors.toList());
        portfolioNames.forEach(System.out::println);
        System.out.println("Total Portfolios: " + portfolioNames.size());

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Get only university name");
        List<String> universityNames = collection.stream()
                .flatMap(country -> country.getStateDTOS().stream())
                .flatMap(state -> state.getMinisterDTOS().stream())
                .flatMap(minister -> minister.getPortfolios().stream())
                .map(PortfolioDTO::getDepartmentDTO)
                .map(DepartmentDTO::getHodDTO)
                .flatMap(hod -> hod.getStaffDTOs().stream())
                .map(StaffDTO::getDetailDTO)
                .map(DetailDTO::getEducationDTO)
                .map(EducationDTO::getUniversityDTO)
                .map(UniversityDTO::getName)
                .distinct()
                .collect(Collectors.toList());
        universityNames.forEach(System.out::println);

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Get all Ministers");
        List<MinisterDTO> ministerDTOS = collection.stream()
                .flatMap(country -> country.getStateDTOS().stream())
                .flatMap(state -> state.getMinisterDTOS().stream())
                .collect(Collectors.toList());
        ministerDTOS.forEach(System.out::println);

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Get Unique Department");
        List<DepartmentDTO> departmentDTOS = collection.stream()
                .flatMap(country -> country.getStateDTOS().stream())
                .flatMap(state -> state.getMinisterDTOS().stream())
                .flatMap(minister -> minister.getPortfolios().stream())
                .map(PortfolioDTO::getDepartmentDTO)
                .distinct()
                .collect(Collectors.toList());
        departmentDTOS.forEach(System.out::println);

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Get Staff and education");

        List<StaffDTO> staffDTOList = collection.stream()
                .flatMap(country -> country.getStateDTOS().stream())
                .flatMap(state -> state.getMinisterDTOS().stream())
                .flatMap(minister -> minister.getPortfolios().stream())
                .map(portfolio -> portfolio.getDepartmentDTO().getHodDTO())
                .flatMap(hod -> hod.getStaffDTOs().stream())
                .collect(Collectors.toList());

        List<EducationDTO> educationList = collection.stream()
                .flatMap(country -> country.getStateDTOS().stream())
                .flatMap(state -> state.getMinisterDTOS().stream())
                .flatMap(minister -> minister.getPortfolios().stream())
                .map(portfolio -> portfolio.getDepartmentDTO().getHodDTO())
                .flatMap(hod -> hod.getStaffDTOs().stream())
                .map(staff -> staff.getDetailDTO().getEducationDTO())
                .collect(Collectors.toList());

        System.out.println("Staff details");
        staffDTOList.forEach(System.out::println);

        System.out.println("------------------------------------------------------------------");
        System.out.println("Education details");
        educationList.forEach(System.out::println);

    }
}
