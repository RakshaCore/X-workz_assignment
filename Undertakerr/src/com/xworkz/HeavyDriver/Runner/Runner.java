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
        student.logClassroom();

        System.out.println("------------------------2------------------------");
        Car car = new Car();
        car.start();
        car.stop();
        car.check();
        car.logEngine();

        System.out.println("------------------------3------------------------");
        Bus bus = new Bus();
        bus.start();
        bus.stop();
        bus.check();
        bus.logVehicle();

        System.out.println("------------------------4------------------------");
        Ship ship = new Ship();
        ship.swim();
        ship.dive();
        ship.floatOnWater();
        ship.logSwim();

        System.out.println("------------------------5------------------------");
        Plane plane = new Plane();
        plane.fly();
        plane.land();
        plane.takeOff();
        plane.logFlight();

        System.out.println("------------------------6------------------------");
        StudentResponds studentResponds = new StudentResponds();
        studentResponds.respond();
        studentResponds.acknowledge();
        studentResponds.reject();
        studentResponds.logResponse();

        System.out.println("------------------------7------------------------");
        Doctor doctor = new Doctor();
        doctor.update();
        doctor.notifyObservers();
        doctor.registerObserver();
        doctor.logUpdate();

        System.out.println("------------------------8------------------------");
        Nurse nurse = new Nurse();
        nurse.render();
        nurse.display();
        nurse.refresh();
        nurse.logRender();

        System.out.println("------------------------9------------------------");
        Robot robot = new Robot();
        robot.analyze();
        robot.interpret();
        robot.report();
        robot.logAnalysis();

        System.out.println("------------------------10------------------------");
        Server server = new Server();
        server.track();
        server.monitor();
        server.log();
        server.logTracking();

        System.out.println("------------------------11------------------------");
        Client client = new Client();
        client.process();
        client.execute();
        client.manage();
        client.logProcess();

        System.out.println("------------------------12------------------------");
        Teacher teacher = new Teacher();
        teacher.communicate();
        teacher.sendMessage();
        teacher.receiveMessage();
        teacher.logCommunication();

        System.out.println("------------------------13------------------------");
        Animal animal = new Animal();
        animal.enhance();
        animal.upgrade();
        animal.optimize();
        animal.logTransformation();

        System.out.println("------------------------14------------------------");
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment();
        creditCardPayment.refundPayment();
        creditCardPayment.generateInvoice();
        creditCardPayment.logPayment();

        System.out.println("------------------------15------------------------");
        OAuthLogin oAuthLogin = new OAuthLogin();
        oAuthLogin.authenticateUser();
        oAuthLogin.authorizeUser();
        oAuthLogin.logAuthenticationAttempt();
        oAuthLogin.logAuthentication();

        System.out.println("------------------------16------------------------");
        LocalFileManager localFileManager = new LocalFileManager();
        localFileManager.deleteFile();
        localFileManager.downloadFile();
        localFileManager.uploadFile();
        localFileManager.logFileOperation();

        System.out.println("------------------------17------------------------");
        CSVExporter csvExporter = new CSVExporter();
        csvExporter.exportData();
        csvExporter.importData();
        csvExporter.deleteData();
        csvExporter.logExport();

        System.out.println("------------------------18------------------------");
        EmailNotification emailNotification = new EmailNotification();
        emailNotification.sendNotification();
        emailNotification.scheduleNotification();
        emailNotification.cancelNotification();
        emailNotification.logNotification();

        System.out.println("------------------------19------------------------");
        ProductSearch productSearch = new ProductSearch();
        productSearch.search();
        productSearch.index();
        productSearch.delete();
        productSearch.logSearch();

        System.out.println("------------------------20------------------------");
        AesEncryption aesEncryption = new AesEncryption();
        aesEncryption.encrypt();
        aesEncryption.decrypt();
        aesEncryption.generateKey();
        aesEncryption.logEncryption();

        System.out.println("------------------------21------------------------");
        SalesReport salesReport = new SalesReport();
        salesReport.generateReport();
        salesReport.generateErrorReport();
        salesReport.generateWarningReport();
        salesReport.generateInfoReport();

        System.out.println("------------------------22------------------------");
        MouseClickListener mouseClickListener = new MouseClickListener();
        mouseClickListener.onEvent();
        mouseClickListener.onError();
        mouseClickListener.onWarning();
        mouseClickListener.onInfo();

        System.out.println("------------------------23------------------------");
        DailyTaskScheduler dailyTaskScheduler = new DailyTaskScheduler();
        dailyTaskScheduler.schedule();
        dailyTaskScheduler.reschedule();
        dailyTaskScheduler.cancel();
        dailyTaskScheduler.logSchedule();

        System.out.println("------------------------24------------------------");
        FileLogger fileLogger = new FileLogger();
        fileLogger.log();
        fileLogger.logError();
        fileLogger.logWarning();
        fileLogger.logInfo();

        System.out.println("------------------------25------------------------");
        MemoryCache memoryCache = new MemoryCache();
        memoryCache.cacheData();
        memoryCache.clearCache();
        memoryCache.removeCachedData();
        memoryCache.logCache();

        System.out.println("------------------------26------------------------");
        InputValidator inputValidator = new InputValidator();
        inputValidator.validate();
        inputValidator.validateData();
        inputValidator.validateInput();
        inputValidator.logValidation();

        System.out.println("------------------------27------------------------");
        JobExecutor executor = new JobExecutor();
        executor.runTask();
        executor.pauseTask();
        executor.stopTask();
        executor.logTask();

        System.out.println("------------------------28------------------------");
        GmailService gmailService = new GmailService();
        gmailService.sendEmail();
        gmailService.receiveEmail();
        gmailService.deleteEmail();
        gmailService.logEmail();

        System.out.println("------------------------29------------------------");
        ThumbnailGenerator thumbnailGenerator = new ThumbnailGenerator();
        thumbnailGenerator.filterImage();
        thumbnailGenerator.resizeImage();
        thumbnailGenerator.processImage();
        thumbnailGenerator.displayImage();

        System.out.println("------------------------30------------------------");
        SpringInjector springInjector = new SpringInjector();
        springInjector.configureDependencies();
        springInjector.injectDependencies();
        springInjector.manageDependencies();
        springInjector.logDependencies();

        System.out.println("------------------------31------------------------");
        XmlDocumentParser xmlDocumentParser = new XmlDocumentParser();
        xmlDocumentParser.parseDocument();
        xmlDocumentParser.validateDocument();
        xmlDocumentParser.extractDataFromDocument();
        xmlDocumentParser.displayDocument();

        System.out.println("------------------------32------------------------");
        Phone phone = new Phone();
        phone.powerOff();
        phone.powerOff();
        phone.reset();
        phone.connectToWiFi();

        System.out.println("------------------------33------------------------");
        Cricketer cricketer = new Cricketer();
        cricketer.play();
        cricketer.quit();
        cricketer.score();
        cricketer.displayPlayerStatus();

        System.out.println("------------------------34------------------------");
        Chef chef = new Chef();
        chef.cook();
        chef.bake();
        chef.grill();
        chef.displayCookingSkills();

        System.out.println("------------------------35------------------------");
        TVRemote tvRemote = new TVRemote();
        tvRemote.start();
        tvRemote.stop();
        tvRemote.check();
        tvRemote.displayRemoteStatus();

        System.out.println("------------------------36------------------------");
        LightSwitch lightSwitch = new LightSwitch();
        lightSwitch.on();
        lightSwitch.off();
        lightSwitch.check();
        lightSwitch.displaySwitchStatus();

        System.out.println("------------------------37------------------------");
        Cat cat = new Cat();
        cat.makeSound();
        cat.eat();
        cat.sleep();
        cat.displayAnimalSound();

        System.out.println("------------------------38------------------------");
        FloorCleaner floorCleaner = new FloorCleaner();
        floorCleaner.clean();
        floorCleaner.wash();
        floorCleaner.sanitize();
        floorCleaner.displayCleanerStatus();

        System.out.println("------------------------39------------------------");
        Puzzle puzzle = new Puzzle();
        puzzle.play();
        puzzle.pause();
        puzzle.stop();
        puzzle.displayGameStatus();

        System.out.println("------------------------40------------------------");
        ShoeBox shoeBox = new ShoeBox();
        shoeBox.close();
        shoeBox.lock();
        shoeBox.open();
        shoeBox.displayBoxStatus();

        System.out.println("------------------------41------------------------");
        SchoolBag schoolBag = new SchoolBag();
        schoolBag.open();
        schoolBag.close();
        schoolBag.changeZip();
        schoolBag.displayBagStatus();

        System.out.println("------------------------42------------------------");
        TubeLight tubeLight = new TubeLight();
        tubeLight.syncWithApp();
        tubeLight.adjustBrightnessAutomatically();
        tubeLight.respondToVoiceCommands();
        tubeLight.displayLightStatus();

        System.out.println("------------------------43------------------------");
        WallClock wallClock = new WallClock();
        wallClock.showTime();
        wallClock.setAlarm();
        wallClock.snoozeAlarm();
        wallClock.displayTime();

        System.out.println("------------------------44------------------------");
        DocToPdfConverter docToPdfConverter = new DocToPdfConverter();
        docToPdfConverter.convertToExcel();
        docToPdfConverter.convertToPDF();
        docToPdfConverter.convertToWord();
        docToPdfConverter.convert();

        System.out.println("------------------------45------------------------");
        MovieRecommender movieRecommender = new MovieRecommender();
        movieRecommender.recommendProducts();
        movieRecommender.analyzeUserBehavior();
        movieRecommender.providePersonalizedRecommendations();
        movieRecommender.recommend();

        System.out.println("------------------------46------------------------");
        MobileCharger mobileCharger = new MobileCharger();
        mobileCharger.chargeDevice();
        mobileCharger.fastCharge();
        mobileCharger.wirelessCharge();
        mobileCharger.charge();

        System.out.println("------------------------47------------------------");
        Bangalore bangalore = new Bangalore();
        bangalore.getCityArea();
        bangalore.getCityAttractions();
        bangalore.getCityWeather();
        bangalore.getCityPopulation();

        System.out.println("------------------------48------------------------");
        WiFi wifi = new WiFi();
        wifi.checkConnectionSpeed();
        wifi.connectToInternet();
        wifi.disconnectFromInternet();
        wifi.getServiceProvider();

        System.out.println("------------------------49------------------------");
        SteeringWheel steeringWheel = new SteeringWheel();
        steeringWheel.getPartMaterial();
        steeringWheel.getPartType();
        steeringWheel.getPartName();
        steeringWheel.getPartFunction();

        System.out.println("------------------------50------------------------");
        Apple apple = new Apple();
        apple.getFruitName();
        apple.getFruitColor();
        apple.getFruitTaste();
        apple.getFruitShape();

        System.out.println("------------------------51------------------------");
        Carrot carrot = new Carrot();
        carrot.getVegetableName();
        carrot.getVegetableColor();
        carrot.getVegetableTaste();
        carrot.getVegetableShape();

        System.out.println("------------------------52------------------------");
        OfficeChair officeChair = new OfficeChair();
        officeChair.move();
        officeChair.rotate();
        officeChair.adjustHeight();
        officeChair.recline();

        System.out.println("------------------------53------------------------");
        BookReader bookReader = new BookReader();
        bookReader.write();
        bookReader.edit();
        bookReader.publish();
        bookReader.proofread();

        System.out.println("------------------------54------------------------");
        SmartWatch smartWatch = new SmartWatch();
        smartWatch.setAlarm();
        smartWatch.showTime();
        smartWatch.trackSteps();
        smartWatch.connectToPhone();

        System.out.println("------------------------55------------------------");
        HB2Pencil hb2Pencil = new HB2Pencil();
        hb2Pencil.draw();
        hb2Pencil.erase();
        hb2Pencil.sharpen();
        hb2Pencil.write();

        System.out.println("------------------------56------------------------");
        BlackPen blackPen = new BlackPen();
        blackPen.draw();
        blackPen.refill();
        blackPen.write();
        blackPen.clean();

        System.out.println("------------------------57------------------------");
        TextBook textBook = new TextBook();
        textBook.publish();
        textBook.write();
        textBook.read();
        textBook.bookmark();


        System.out.println("------------------------58------------------------");
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.setMode();
        washingMachine.turnOff();
        washingMachine.turnOn();
        washingMachine.reset();

        System.out.println("------------------------59------------------------");
        WhatsApp WhatsApp = new WhatsApp();
        WhatsApp.install();
        WhatsApp.uninstall();
        WhatsApp.update();
        WhatsApp.launch();

        System.out.println("------------------------60------------------------");
        GooogleSite google = new GooogleSite();
        google.load();
        google.refresh();
        google.close();
        google.bookmark();

        System.out.println("------------------------61------------------------");
        TeddyBear teddyBear = new TeddyBear();
        teddyBear.deliver();
        teddyBear.wrap();
        teddyBear.open();
        teddyBear.thankYou();

        System.out.println("------------------------62------------------------");
        DBoss dBoss = new DBoss();
        dBoss.pause();
        dBoss.play();
        dBoss.stop();
        dBoss.rewind();

        System.out.println("------------------------63------------------------");
        FootBall football = new FootBall();
        football.play();
        football.practice();
        football.compete();
        football.show();

        System.out.println("------------------------64------------------------");
        Juice juice = new Juice();
        juice.pour();
        juice.sip();
        juice.finish();
        juice.serve();

        System.out.println("------------------------65------------------------");
        CeilingFan ceilingFan = new CeilingFan();
        ceilingFan.play();
        ceilingFan.practice();
        ceilingFan.compete();
        ceilingFan.show();

        System.out.println("------------------------66------------------------");
        English english = new English();
        english.speak();
        english.write();
        english.read();
        english.translate();


        System.out.println("------------------------67------------------------");
        HPLaptop hpLaptop = new HPLaptop();
        hpLaptop.connectToInternet();
        hpLaptop.powerOn();
        hpLaptop.powerOff();
        hpLaptop.runDiagnostics();

        System.out.println("------------------------68------------------------");
        GoogleDrive googleDrive = new GoogleDrive();
        googleDrive.uploadFile();
        googleDrive.downloadFile();
        googleDrive.deleteFile();
        googleDrive.shareFile();

        System.out.println("------------------------69------------------------");
        Spotify spotify = new Spotify();
        spotify.playMusic();
        spotify.repeatTrack();
        spotify.shufflePlaylist();
        spotify.stopMusic();


        System.out.println("------------------------70------------------------");
        ChikkuMilkshake chikkuMilkshake = new ChikkuMilkshake();
        chikkuMilkshake.drink();
        chikkuMilkshake.prepare();
        chikkuMilkshake.serve();
        chikkuMilkshake.enjoy();

        System.out.println("------------------------71------------------------");
        AmoungUs amoungUs = new AmoungUs();
        amoungUs.customizeCharacter();
        amoungUs.joinMultiplayer();
        amoungUs.sendInGameMessage();
        amoungUs.playGame();

        System.out.println("------------------------72------------------------");
        Harmonium harmonium = new Harmonium();
        harmonium.play();
        harmonium.clean();
        harmonium.tune();
        harmonium.repair();

        System.out.println("------------------------73------------------------");
        WaterBottle waterBottle = new WaterBottle();
        waterBottle.clean();
        waterBottle.fill();
        waterBottle.drink();
        waterBottle.store();

        System.out.println("------------------------74------------------------");
        ScientificCalci scientificCalci = new ScientificCalci();
        scientificCalci.modulus();
        scientificCalci.power();
        scientificCalci.squareRoot();
        scientificCalci.add();

        System.out.println("------------------------75------------------------");
        LetUsRest letUsRest = new LetUsRest();
        letUsRest.eat();
        letUsRest.pamper();
        letUsRest.sleep();
        letUsRest.relax();
        letUsRest.meditate();

        System.out.println("------------------------76------------------------");
        CabService cabService = new CabService();
        cabService.transport();
        cabService.deliver();
        cabService.track();
        cabService.logTransport();
        System.out.println("------------------------77------------------------");
        ZipCompressor zipCompressor = new ZipCompressor();
        zipCompressor.compress();
        zipCompressor.decompress();
        zipCompressor.merge();
        zipCompressor.logCompression();



    }
}
