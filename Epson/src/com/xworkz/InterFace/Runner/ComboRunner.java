package com.xworkz.InterFace.Runner;

import com.xworkz.InterFace.External.*;
import com.xworkz.InterFace.Internal.*;

public class ComboRunner {
    public static void main(String[] args) {
        System.out.println("ClassWork");
        Connector connector=new ConnectorImpl();
        ConnectorUser connectorUser=new ConnectorUser(connector);
        connectorUser.random();

        System.out.println("HomeWork");
        System.out.println("---------1---------");
        ICC icc = new IndianCricketTeamICCImpl();
        BCCI bcci = new BCCI(icc);
        bcci.play();

        System.out.println("---------2---------");
        Constitution constitution= new CitizenConstituionImpl();
        Government government=new Government(constitution);
        government.scam();

        System.out.println("---------3---------");
        Laptop laptop=new LaptopImpl();
        OperatingSystem operatingSystem=new OperatingSystem(laptop);
        operatingSystem.setLaptop();

        System.out.println("---------4---------");
        Engine engine = new DieselEngine();
        Car car = new Car(engine);
        car.stop();

        System.out.println("---------5---------");
        Animal animal = new Dog();
        Zoo zoo = new Zoo(animal);
        zoo.eat();

        System.out.println("---------6---------");
        Printer printer = new LaserPrinter();
        PrintManager printManager = new PrintManager(printer);
        printManager.use();

        System.out.println("---------7---------");
        Camera camera=new DSLR();
        Photographer photographer=new Photographer(camera);
        photographer.capture();

        System.out.println("---------8---------");
        Shape shape=new Circle();
        DrawingTool drawingTool=new DrawingTool(shape);
        drawingTool.create();

        System.out.println("---------9---------");
        Light light =new LightImpl();
        SmartHome smartHome=new SmartHome(light);
        smartHome.turnOn();

        System.out.println("---------10---------");
        Payment payment=new PaymentImpl();
        PaymentApp paymentApp=new PaymentApp(payment);
        paymentApp.makepay();

        System.out.println("---------11---------");
        Speaker speaker=new SpeakerImpl();
        MusicSystem musicSystem=new MusicSystem(speaker);
        musicSystem.playMusic();

        System.out.println("---------12---------");
        Notification notification=new NotificationImpl();
        AlertSystem alertSystem=new AlertSystem(notification);
        alertSystem.sendAlert();

        System.out.println("---------13---------");
        Charger charger=new ChargerImpl();
        MobileDevice mobileDevice=new MobileDevice(charger);
        mobileDevice.discharge();

        System.out.println("---------14---------");
        Fuel fuel=new FuelImpl();
        Petrol petrol=new Petrol(fuel);
        petrol.burn();

        System.out.println("---------15---------");
        File file=new FileImpl();
        FileReader fileReader=new FileReader(file);
        fileReader.readFile();

        System.out.println("---------16---------");
        Robot robot=new RobotImpl();
        RobotLab robotLab=new RobotLab(robot);
        robotLab.work();

        System.out.println("---------17---------");
        Message message=new MessageImpl();
        Communication communication=new Communication(message);
        communication.send();

        System.out.println("---------18---------");
        Battery battery=new BatteryImpl();
        Gadget gadget=new Gadget(battery);
        gadget.powerOn();

        System.out.println("---------19---------");
        Button button=new ButtonImpl();
        Remote remote=new Remote(button);
        remote.press();

        System.out.println("---------20---------");
        Storage storage=new StorageImpl();
        DataCenter dataCenter=new DataCenter(storage);
        storage.clearStorage();

        System.out.println("---------21---------");
        Sensor sensor=new SensorImpl();
        WeatherStation weatherStation=new WeatherStation(sensor);
        weatherStation.collectData();

        System.out.println("---------22---------");
        Lock lock = new LockImpl();
        DoorSystem doorSystem = new DoorSystem(lock);
        doorSystem.lockDoor();

        System.out.println("---------23---------");
        Media media = new MediaImpl();
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();

        System.out.println("---------24---------");
        Display display = new DisplayImpl();
        Monitor monitor = new Monitor(display);
        monitor.displayProperly();

        System.out.println("---------25---------");
        Tool tool = new ToolImpl();
        Hammer hammer = new Hammer(tool);
        hammer.useTool();

        System.out.println("---------26---------");
        Currency currency = new CurrencyImpl();
        ExchangeSystem exchangeSystem = new ExchangeSystem(currency);
        exchangeSystem.convert();

        System.out.println("---------27---------");
        Game game = new GameImpl();
        GTAVC gtavc = new GTAVC(game);
        gtavc.play();

        System.out.println("---------28---------");
        Service service = new ServiceImpl();
        HouseCleaning houseCleaning = new HouseCleaning(service);
        houseCleaning.cleanit();

        System.out.println("---------29---------");
        Machine machine = new MachineImpl();
        WashingMachine washingMachine = new WashingMachine(machine);
        washingMachine.startwashing();

        System.out.println("---------30---------");
        App app = new AppImpl();
        Instagram instagram = new Instagram(app);
        instagram.open();

        System.out.println("---------31---------");
        Task task = new TaskImpl();
        CodeDayNIght codeDayNIght = new CodeDayNIght(task);
        codeDayNIght.executeit();

        System.out.println("---------32---------");
        Beverage beverage = new BeverageImpl();
        Cafe cafe = new Cafe(beverage);
        cafe.serve();

        System.out.println("---------33---------");
        Authentication authentication = new AuthenticationImpl();
        Login login = new Login(authentication);
        login.authenticate();

        System.out.println("---------34---------");
        Ticket ticket = new TicketImpl();
        MovieTicket movieTicket = new MovieTicket(ticket);
        movieTicket.bookTicket();

        System.out.println("---------35---------");
        Internet internet = new InternetImpl();
        NetworkProvider networkProvider = new NetworkProvider(internet);
        networkProvider.connect();

        System.out.println("---------36---------");
        Transport transport = new TransportImpl();
        TransportHub transportHub = new TransportHub(transport);
        transportHub.transport();

        System.out.println("---------37---------");
        Fan fan = new FanImpl();
        RoomControl roomControl = new RoomControl(fan);
        roomControl.controlFan();

        System.out.println("---------38---------");
        Toy toy = new ToyImpl();
        ToyStore toyStore = new ToyStore(toy);
        toyStore.play();

        System.out.println("---------39---------");
        Reminder reminder = new ReminderImpl();
        ReminderApp reminderApp = new ReminderApp(reminder);
        reminderApp.setReminder();

        System.out.println("---------40---------");
        VehicleMode vehicleMode = new VehicleModeImpl();
        DrivingSystem drivingSystem = new DrivingSystem(vehicleMode);
        drivingSystem.drive();

        System.out.println("---------41---------");
        Recipe recipe = new RecipeImpl();
        CookingApp cookingApp = new CookingApp(recipe);
        cookingApp.cook();

        System.out.println("---------42---------");
        Keyboard keyboard = new KeyboardImpl();
        TypingApp typingApp = new TypingApp(keyboard);
        typingApp.type();

        System.out.println("---------43---------");
        Discount discount = new DiscountImpl();
        ShoppingCart shoppingCart = new ShoppingCart(discount);
        shoppingCart.applyDiscount();

        System.out.println("---------44---------");
        Transaction transaction = new TransactionImpl();
        BankTransaction bankTransaction = new BankTransaction(transaction);
        bankTransaction.processTransaction();

        System.out.println("---------45---------");
        Navigation navigation = new NavigationImpl();
        GPS gps = new GPS(navigation);
        gps.showDirection();

        System.out.println("---------46---------");
        Event event = new EventImpl();
        Aakriti aakriti = new Aakriti(event);
        aakriti.showEvent();

        System.out.println("---------47---------");
        MusicPlayer musicPlayer = new MusicPlayerImpl();
        Spotify spotify = new Spotify(musicPlayer);
        spotify.playMusic();

        System.out.println("---------48---------");
        Scanner scanner = new ScannerImpl();
        BarcodeScanner barcodeScanner = new BarcodeScanner(scanner);
        barcodeScanner.scan();

        System.out.println("---------49---------");
        Map map = new MapImpl();
        GoogleMap googleMap = new GoogleMap(map);
        googleMap.getDirections();

        System.out.println("---------50---------");
        Ad ad = new AdImpl();
        Admanager admanager = new Admanager(ad);
        admanager.displayAd();

        System.out.println("DONE AND DUSTED FINALLY ,GOOD NIGHT!!");


    }
}
