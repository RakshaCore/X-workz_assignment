package com.xworkz.HeavyDriver.Runner;

import com.xworkz.HeavyDriver.Internal.*;

import java.util.Calendar;

public class Runner {
    public static void main(String[] args) {
        System.out.println("------------------------1------------------------");
        Student student = new Student();
        student.teach();
        student.learn();
        Classroom.study();

        System.out.println("------------------------2------------------------");
        Car car = new Car();
        car.start();
        car.stop();
        car.check();

        System.out.println("------------------------3------------------------");
        Bus bus = new Bus();
        bus.start();
        bus.stop();
        bus.check();

        System.out.println("------------------------4------------------------");
        Ship ship = new Ship();
        ship.swim();
        ship.dive();
        ship.floatOnWater();

        System.out.println("------------------------5------------------------");
        Plane plane = new Plane();
        plane.fly();
        plane.land();
        plane.takeOff();

        System.out.println("------------------------6------------------------");
        StudentResponds studentResponds = new StudentResponds();
        studentResponds.respond();
        studentResponds.acknowledge();
        studentResponds.reject();

        System.out.println("------------------------7------------------------");
        Doctor doctor = new Doctor();
        doctor.update();
        doctor.notifyObservers();
        doctor.registerObserver();

        System.out.println("------------------------8------------------------");
        Nurse nurse = new Nurse();
        nurse.render();
        nurse.display();
        nurse.refresh();

        System.out.println("------------------------9------------------------");
        Robot robot = new Robot();
        robot.analyze();
        robot.interpret();
        robot.report();

        System.out.println("------------------------10------------------------");
        Server server = new Server();
        server.track();
        server.monitor();
        server.log();

        System.out.println("------------------------11------------------------");
        Client client = new Client();
        client.process();
        client.execute();
        client.manage();

        System.out.println("------------------------12------------------------");
        Teacher teacher = new Teacher();
        teacher.communicate();
        teacher.sendMessage();
        teacher.receiveMessage();

        System.out.println("------------------------13------------------------");
        Animal animal = new Animal();
        animal.enhance();
        animal.upgrade();
        animal.optimize();

        System.out.println("------------------------14------------------------");
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment();
        creditCardPayment.refundPayment();
        creditCardPayment.generateInvoice();

        System.out.println("------------------------15------------------------");
        OAuthLogin oAuthLogin = new OAuthLogin();
        oAuthLogin.authenticateUser();
        oAuthLogin.authorizeUser();
        oAuthLogin.logAuthenticationAttempt();

        System.out.println("------------------------16------------------------");
        LocalFileManager localFileManager = new LocalFileManager();
        localFileManager.deleteFile();
        localFileManager.downloadFile();
        localFileManager.uploadFile();

        System.out.println("------------------------17------------------------");
        CSVExporter csvExporter = new CSVExporter();
        csvExporter.exportData();
        csvExporter.importData();
        csvExporter.deleteData();

        System.out.println("------------------------18------------------------");
        EmailNotification emailNotification = new EmailNotification();
        emailNotification.sendNotification();
        emailNotification.scheduleNotification();
        emailNotification.cancelNotification();

        System.out.println("------------------------19------------------------");
        ProductSearch productSearch = new ProductSearch();
        productSearch.search();
        productSearch.index();
        productSearch.delete();

        System.out.println("------------------------20------------------------");
        AesEncryption aesEncryption = new AesEncryption();
        aesEncryption.encrypt();
        aesEncryption.decrypt();
        aesEncryption.generateKey();

        System.out.println("------------------------21------------------------");
        SalesReport salesReport = new SalesReport();
        salesReport.generateReport();
        salesReport.generateErrorReport();
        salesReport.generateWarningReport();

        System.out.println("------------------------22------------------------");
        MouseClickListener mouseClickListener = new MouseClickListener();
        mouseClickListener.onEvent();
        mouseClickListener.onError();
        mouseClickListener.onWarning();

        System.out.println("------------------------23------------------------");
        DailyTaskScheduler dailyTaskScheduler = new DailyTaskScheduler();
        dailyTaskScheduler.schedule();
        dailyTaskScheduler.reschedule();
        dailyTaskScheduler.cancel();

        System.out.println("------------------------24------------------------");
        FileLogger fileLogger = new FileLogger();
        fileLogger.log();
        fileLogger.logError();
        fileLogger.logWarning();

        System.out.println("------------------------25------------------------");
        MemoryCache memoryCache = new MemoryCache();
        memoryCache.cacheData();
        memoryCache.clearCache();
        memoryCache.removeCachedData();

        System.out.println("------------------------26------------------------");
        InputValidator inputValidator = new InputValidator();
        inputValidator.validate();
        inputValidator.validateData();
        inputValidator.validateInput();

        System.out.println("------------------------27------------------------");
        JobExecutor executor = new JobExecutor();
        executor.runTask();
        executor.pauseTask();
        executor.stopTask();

        System.out.println("------------------------28------------------------");
        GmailService gmailService = new GmailService();
        gmailService.sendEmail();
        gmailService.receiveEmail();
        gmailService.deleteEmail();

        System.out.println("------------------------29------------------------");
        ThumbnailGenerator thumbnailGenerator = new ThumbnailGenerator();
        thumbnailGenerator.filterImage();
        thumbnailGenerator.resizeImage();
        thumbnailGenerator.processImage();

        System.out.println("------------------------30------------------------");
        SpringInjector springInjector = new SpringInjector();
        springInjector.configureDependencies();
        springInjector.injectDependencies();
        springInjector.manageDependencies();

        System.out.println("------------------------31------------------------");
        XmlDocumentParser xmlDocumentParser = new XmlDocumentParser();
        xmlDocumentParser.parseDocument();
        xmlDocumentParser.validateDocument();
        xmlDocumentParser.extractDataFromDocument();

        System.out.println("------------------------32------------------------");
        Phone phone = new Phone();
        phone.powerOff();
        phone.powerOff();
        phone.reset();

        System.out.println("------------------------33------------------------");
        Cricketer cricketer = new Cricketer();
        cricketer.play();
        cricketer.quit();
        cricketer.score();

        System.out.println("------------------------34------------------------");
        Chef chef = new Chef();
        chef.cook();
        chef.bake();
        chef.grill();

        System.out.println("------------------------35------------------------");
        TVRemote tvRemote = new TVRemote();
        tvRemote.start();
        tvRemote.stop();
        tvRemote.check();

        System.out.println("------------------------36------------------------");
        LightSwitch lightSwitch = new LightSwitch();
        lightSwitch.on();
        lightSwitch.off();
        lightSwitch.check();

        System.out.println("------------------------37------------------------");
        Cat cat = new Cat();
        cat.makeSound();
        cat.eat();
        cat.sleep();

        System.out.println("------------------------38------------------------");
        FloorCleaner floorCleaner = new FloorCleaner();
        floorCleaner.clean();
        floorCleaner.wash();
        floorCleaner.sanitize();

        System.out.println("------------------------39------------------------");
        Puzzle puzzle = new Puzzle();
        puzzle.play();
        puzzle.pause();
        puzzle.stop();

        System.out.println("------------------------40------------------------");
        ShoeBox shoeBox = new ShoeBox();
        shoeBox.close();
        shoeBox.lock();
        shoeBox.open();

        System.out.println("------------------------41------------------------");
        SchoolBag schoolBag = new SchoolBag();
        schoolBag.open();
        schoolBag.close();
        schoolBag.changeZip();

        System.out.println("------------------------42------------------------");
        TubeLight tubeLight = new TubeLight();
        tubeLight.syncWithApp();
        tubeLight.adjustBrightnessAutomatically();
        tubeLight.respondToVoiceCommands();

        System.out.println("------------------------43------------------------");
        WallClock wallClock = new WallClock();
        wallClock.showTime();
        wallClock.setAlarm();
        wallClock.snoozeAlarm();

        System.out.println("------------------------44------------------------");
        DocToPdfConverter docToPdfConverter = new DocToPdfConverter();
        docToPdfConverter.convertToExcel();
        docToPdfConverter.convertToPDF();
        docToPdfConverter.convertToWord();

        System.out.println("------------------------45------------------------");
        MovieRecommender movieRecommender = new MovieRecommender();
        movieRecommender.recommendProducts();
        movieRecommender.analyzeUserBehavior();
        movieRecommender.providePersonalizedRecommendations();

        System.out.println("------------------------46------------------------");
        MobileCharger mobileCharger = new MobileCharger();
        mobileCharger.chargeDevice();
        mobileCharger.fastCharge();
        mobileCharger.wirelessCharge();

        System.out.println("------------------------47------------------------");
        Bangalore bangalore = new Bangalore();
        bangalore.getCityArea();
        bangalore.getCityAttractions();
        bangalore.getCityWeather();

        System.out.println("------------------------48------------------------");
        WiFi wifi = new WiFi();
        wifi.checkConnectionSpeed();
        wifi.connectToInternet();
        wifi.disconnectFromInternet();

        System.out.println("------------------------49------------------------");
        SteeringWheel steeringWheel = new SteeringWheel();
        steeringWheel.getPartMaterial();
        steeringWheel.getPartType();
        steeringWheel.getPartName();

        System.out.println("------------------------50------------------------");
        Apple apple = new Apple();
        apple.getFruitName();
        apple.getFruitColor();
        apple.getFruitTaste();

        System.out.println("------------------------51------------------------");
        Carrot carrot = new Carrot();
        carrot.getVegetableName();
        carrot.getVegetableColor();
        carrot.getVegetableTaste();

        System.out.println("------------------------52------------------------");
        OfficeChair officeChair = new OfficeChair();
        officeChair.move();
        officeChair.rotate();
        officeChair.adjustHeight();

        System.out.println("------------------------53------------------------");
        BookReader bookReader = new BookReader();
        bookReader.write();
        bookReader.edit();
        bookReader.publish();

        System.out.println("------------------------54------------------------");
        SmartWatch smartWatch = new SmartWatch();
        smartWatch.setAlarm();
        smartWatch.showTime();
        smartWatch.trackSteps();

        System.out.println("------------------------55------------------------");
        HB2Pencil hb2Pencil = new HB2Pencil();
        hb2Pencil.draw();
        hb2Pencil.erase();
        hb2Pencil.sharpen();

        System.out.println("------------------------56------------------------");
        BlackPen blackPen = new BlackPen();
        blackPen.draw();
        blackPen.refill();
        blackPen.write();

        System.out.println("------------------------57------------------------");
        TextBook textBook = new TextBook();
        textBook.publish();
        textBook.write();
        textBook.read();

        System.out.println("------------------------58------------------------");
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.setMode();
        washingMachine.turnOff();
        washingMachine.turnOn();

        System.out.println("------------------------59------------------------");
        WhatsApp WhatsApp = new WhatsApp();
        WhatsApp.install();
        WhatsApp.uninstall();
        WhatsApp.update();

        System.out.println("------------------------60------------------------");
        GooogleSite google = new GooogleSite();
        google.load();
        google.refresh();
        google.close();

        System.out.println("------------------------61------------------------");
        TeddyBear teddyBear = new TeddyBear();
        teddyBear.deliver();
        teddyBear.wrap();
        teddyBear.open();

        System.out.println("------------------------62------------------------");
        DBoss dBoss = new DBoss();
        dBoss.pause();
        dBoss.play();
        dBoss.stop();

        System.out.println("------------------------63------------------------");
        FootBall football = new FootBall();
        football.play();
        football.practice();
        football.compete();

        System.out.println("------------------------64------------------------");
        Juice juice = new Juice();
        juice.pour();
        juice.sip();
        juice.finish();

        System.out.println("------------------------65------------------------");
        CeilingFan ceilingFan = new CeilingFan();
        ceilingFan.play();
        ceilingFan.practice();
        ceilingFan.compete();

        System.out.println("------------------------66------------------------");
        English english = new English();
        english.speak();
        english.write();
        english.read();

        System.out.println("------------------------67------------------------");
        HPLaptop hpLaptop = new HPLaptop();
        hpLaptop.connectToInternet();
        hpLaptop.powerOn();
        hpLaptop.powerOff();

        System.out.println("------------------------68------------------------");
        GoogleDrive googleDrive = new GoogleDrive();
        googleDrive.uploadFile();
        googleDrive.downloadFile();
        googleDrive.deleteFile();

        System.out.println("------------------------69------------------------");
        Spotify spotify = new Spotify();
        spotify.playMusic();
        spotify.repeatTrack();
        spotify.shufflePlaylist();

        System.out.println("------------------------70------------------------");
        ChikkuMilkshake chikkuMilkshake = new ChikkuMilkshake();
        chikkuMilkshake.drink();
        chikkuMilkshake.prepare();
        chikkuMilkshake.serve();

        System.out.println("------------------------71------------------------");
        AmoungUs amoungUs = new AmoungUs();
        amoungUs.customizeCharacter();
        amoungUs.joinMultiplayer();
        amoungUs.sendInGameMessage();

        System.out.println("------------------------72------------------------");
        Harmonium harmonium = new Harmonium();
        harmonium.play();
        harmonium.clean();
        harmonium.tune();

        System.out.println("------------------------73------------------------");
        WaterBottle waterBottle = new WaterBottle();
        waterBottle.clean();
        waterBottle.fill();
        waterBottle.drink();

        System.out.println("------------------------74------------------------");
        ScientificCalci scientificCalci = new ScientificCalci();
        scientificCalci.modulus();
        scientificCalci.power();
        scientificCalci.squareRoot();

        System.out.println("------------------------75------------------------");
        LetUsRest letUsRest = new LetUsRest();
        letUsRest.eat();
        letUsRest.pamper();
        letUsRest.sleep();
        letUsRest.relax();

    }
}
